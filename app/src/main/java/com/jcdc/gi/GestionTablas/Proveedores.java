package com.jcdc.gi.GestionTablas;
import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.jcdc.gi.*;
import com.jcdc.gi.ConexionSqlite.*;
import com.jcdc.gi.Metodos.*;
import com.jcdc.gi.Tablas.*;
import java.util.*;
import android.widget.AdapterView.*;

public class Proveedores extends AppCompatActivity implements OnItemSelectedListener
{
	ConexionSqlite conectar = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;

	//Button btnGuardarProv;
	EditText etEmpProv,etTelefProv,etPromProv;
	EditText etCelProv,etMailProv;
	TextView tvIdProv;
	ArrayList<String> datosProv;

	String strIdProv;

	//spinner estado
	Spinner spnEstado;
	ArrayList<String> arrayEstado;


	CRUD metCrud = new CRUD(this);
	Metodos metodo = new Metodos(this);

	//Proveedor datosProv = new Proveedor("","","","","","","");

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.proveedores);

		datosProv = new ArrayList<>();

		//btnGuardarProv = findViewById(R.id.btnGuardarProv);
		etEmpProv = findViewById(R.id.etEmpProv);
		etTelefProv = findViewById(R.id.etTelefProv);
		etPromProv = findViewById(R.id.etPromProv);
		etCelProv = findViewById(R.id.etCelProv);
		etMailProv = findViewById(R.id.etMailProv);
		tvIdProv = findViewById(R.id.tvIdProv);

		//btnGuardarProv.setOnClickListener(this);

		//Spinner Estado
		arrayEstado = new ArrayList<>();
		arrayEstado.add(getString(R.string.activo));
		arrayEstado.add(getString(R.string.inactivo));
		spnEstado = findViewById(R.id.spnEstadoProv);
		ArrayAdapter<CharSequence> adapEstado = ArrayAdapter.createFromResource(
			this,
			R.array.actividad,
			R.layout.spinner_modelo);
		spnEstado.setAdapter(adapEstado);
		spnEstado.setOnItemSelectedListener(this);

		strIdProv = getIntent().getExtras().getString("strIdProv");

		if(strIdProv.equals(getString(R.string.nuevo))){
			tvIdProv.setText(getString(R.string.prov)+numId());
		}else{
			tvIdProv.setText(strIdProv);


			try{
				String[] comparar = {strIdProv};
				String[] devolver = 
				{

					Tablas.PROVEEDORES_EMPRESA,
					Tablas.PROVEEDORES_TELEFONO,
					Tablas.PROVEEDORES_PROMOTOR,
					Tablas.PROVEEDORES_CELULAR,
					Tablas.PROVEEDORES_MAIL,
					//Tablas.PROVEEDORES_FIREBASE,
					Tablas.PROVEEDORES_ESTADO

				};
				db = conectar.getReadableDatabase();
				c = db.query(Tablas.PROVEEDORES,devolver,Tablas.PROVEEDORES_ID+"=?",comparar,null,null,null);
				if(c.moveToFirst())
				{
					etEmpProv.setText(c.getString(0));
					etTelefProv.setText(c.getString(1));
					etPromProv.setText(c.getString(2));
					etCelProv.setText(c.getString(3));
					etMailProv.setText(c.getString(4));
					spnEstado.setSelection(arrayEstado.indexOf(c.getString(5)));
					//metodo.msg(c.getString(5));
				}
				c.close();
				db.close();


			}

			catch(Exception e)
			{
				Toast.makeText(this,"aki "+e.toString(),Toast.LENGTH_LONG).show();
			}

		}

	}

	public Boolean tablaVacia(String tabla){

		Boolean vacio = false;
		db = conectar.getReadableDatabase();
		c = db.query(tabla,null,null,null,null,null,null);
		if(c.moveToFirst()){vacio = true;}
		c.close();
		db.close();

		return vacio;
	}

	@Override
	public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4)
	{
		// TODO: Implement this method
	}

	@Override
	public void onNothingSelected(AdapterView<?> p1)
	{
		// TODO: Implement this method
	}


	public Integer numId(){

		String str = "";
		int num = 1;

		db = conectar.getReadableDatabase();
		c = db.query(Tablas.CONTROL,null,null,null,null,null,null);
		if(c.moveToFirst()){
			str = c.getString(3);
			num = Integer.parseInt(str);
		}
		c.close();
		db.close();
		
		return num;
	}

	public void limpiar(){

		etEmpProv.setText("");
		etTelefProv.setText("");
		etPromProv.setText("");
		etCelProv.setText("");
		etMailProv.setText("");
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu_edicion, menu);

		MenuItem itemGuardar = menu.findItem(R.id.itmGuardar);
		MenuItem itemEliminar = menu.findItem(R.id.itmEliminar);

		if(strIdProv.equals(getString(R.string.nuevo))){
			itemEliminar.setVisible(false);
			itemGuardar.setTitle(getString(R.string.guardar));
		}else{
			itemGuardar.setTitle(getString(R.string.guardar));
			itemEliminar.setTitle(getString(R.string.eliminar));
		}

        return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId()) 
		{
			case R.id.itmGuardar:
				
				//almacenamos los datos del formulario(ingresado por teclado)
				datosProv.clear();
				
				if(strIdProv.equals("Nuevo")){datosProv.add("Prov"+numId());}
				else{datosProv.add(tvIdProv.getText().toString());}
				datosProv.add(etEmpProv.getText().toString());
				datosProv.add(etTelefProv.getText().toString());
				datosProv.add(etPromProv.getText().toString());
				datosProv.add(etCelProv.getText().toString());
				datosProv.add(etMailProv.getText().toString());
				datosProv.add("guardar");
				datosProv.add(spnEstado.getSelectedItem().toString());
				
				boolean datosOk = true;
				//validamos que no haya datos nulos
				for(int i=0;i<datosProv.size();i++)
				{
					if(datosProv.get(i).equals("")){datosOk = false;}
				}	

				if(datosOk)//si los datos estan ok procedemos
				{
					//***** codigo aqui ****
					
					
					//******************************************

					//verificar si la empresa a insertar ya existe

					boolean datoExiste = true;
					String idProv = "";

					db = conectar.getReadableDatabase();//abrimos la base en modo lectura
					c =  db.rawQuery(" SELECT DISTINCT "+Tablas.PROVEEDORES_ID+" FROM "+Tablas.PROVEEDORES+" WHERE empresa='"+datosProv.get(1)+"' AND promotor='"+datosProv.get(3)+"'", null);
					if(c.moveToFirst()){

						idProv = c.getString(0);
						metodo.msg(getString(R.string.ya_existe));
						/*
						metodo.msg("id Tabla: "+idProv);
						metodo.msg("id Ingreso: "+datosProv.get(0));
						*/
						if(!idProv.equals(datosProv.get(0))){
							
							datoExiste = false;
						}
						
						
					}
					c.close();
					db.close();

					if(datoExiste){

						ContentValues registro = new ContentValues();

						if(strIdProv.equals("Nuevo")){
							registro.put(Tablas.PROVEEDORES_ID,datosProv.get(0));}

						registro.put(Tablas.PROVEEDORES_EMPRESA,datosProv.get(1));
						registro.put(Tablas.PROVEEDORES_TELEFONO,datosProv.get(2));
						registro.put(Tablas.PROVEEDORES_PROMOTOR,datosProv.get(3));
						registro.put(Tablas.PROVEEDORES_CELULAR,datosProv.get(4));
						registro.put(Tablas.PROVEEDORES_MAIL,datosProv.get(5));
						registro.put(Tablas.PROVEEDORES_FIREBASE,datosProv.get(6));
						registro.put(Tablas.PROVEEDORES_ESTADO,datosProv.get(7));

						//******************************************
						if(strIdProv.equals("Nuevo")){

							try{

								db = conectar.getWritableDatabase();
								db.insert(Tablas.PROVEEDORES,null,registro);
								db.close();

								int n = numId()+1;
								String s = String.valueOf(n);
								String[] compa = {"id"};
								registro.clear();
								registro.put(Tablas.CONTROL_PROV,s);

								db = conectar.getWritableDatabase();
								db.update(Tablas.CONTROL,registro,Tablas.CONTROL_ID+"=?",compa);
								db.close();

								metodo.msg(getString(R.string.datos_guardados));

								//limpiar();

							}catch(Exception e){metodo.msg(getString(R.string.tabla_vacia)+e.toString());}

						}else{

							try
							{	

								String str = datosProv.get(0);//IdProv(ingresado) 
								String[] compa = {str};

								db = conectar.getWritableDatabase();
								db.update(Tablas.PROVEEDORES,registro,Tablas.PROVEEDORES_ID+"=?",compa);
								db.close();

								metodo.msg(getString(R.string.datos_actualizados));


							}catch(Exception e){metodo.msg("error"+" "+e.toString());}

						}

					}

					//********************
					
					
					
				}else{
					metodo.msg(getString(R.string.faltan_datos));
				}
				
				
				
				volver();

				return true;

			case R.id.itmEliminar:
				
				showdialogoElim();

				return true;

			case R.id.itmVolver:

				
				volver();
				
				return true;
		}

		return super.onOptionsItemSelected(item);

	}
	
	public void volver()
	{
		
		try{

			Intent inicio = new Intent(this,com.jcdc.gi.GestionTablas.TablaProv.class);
			startActivity(inicio);

		}catch(Exception e){metodo.msg("error"+" "+e.toString());}
		
		
	}
	
	
	private void showdialogoElim(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder
			.setTitle(getString(R.string.alerta))
			.setMessage(getString(R.string.puede_estar_vinculado))

			.setPositiveButton(getString(R.string.si), new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {

					eliminarProv();
				}
			})

			.setNegativeButton(getString(R.string.no), new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
					volver();

				}
			})

			.show();
    }
	//************************************************************/
	public void eliminarProv()
	{
		//Boolean elim = false;
		String[] comparar = {tvIdProv.getText().toString()};
		
		db = conectar.getReadableDatabase();
		/*
		c = db.query(Utilidades.TABLA_COMPRAS,null,Utilidades.COL_ID_PROV_COMP+"=?",comparar,null,null,null);
		if(c.moveToFirst()){elim = true;}
		c.close();
		db.close();
		
		db = conectar.getWritableDatabase();
		if(elim){
			db.delete(Utilidades.TABLA_COMPRAS,Utilidades.COL_ID_PROV_COMP+"=?",comparar);
		}
		*/
		db.delete(Tablas.PROVEEDORES,Tablas.PROVEEDORES_ID+"=?",comparar);
		db.close();

		metodo.msg(getString(R.string.proveedor));
		metodo.msg(getString(R.string.eliminado));
		volver();
	}
	
	
		
}

