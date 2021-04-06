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
	
	EditText etEmpProv,etTelefProv,etPromProv;
	EditText etCelProv,etMailProv,etIdProv;
	TextView tvIdProv;
	ArrayList<String> datosProv;
	String strIdProv;
	ArrayList<String> arrayEstado;

	CRUD metCrud = new CRUD(this);
	Metodos metodo = new Metodos(this);

	// **** Spinner Estado *****
	Spinner spnEstado;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.proveedores);

		datosProv = new ArrayList<>();
		
		etIdProv = findViewById(R.id.etIdProv);
		etEmpProv = findViewById(R.id.etEmpProv);
		etTelefProv = findViewById(R.id.etTelefProv);
		etPromProv = findViewById(R.id.etPromProv);
		etCelProv = findViewById(R.id.etCelProv);
		etMailProv = findViewById(R.id.etMailProv);
		tvIdProv = findViewById(R.id.tvIdProv);
		
		// **** Spinner Estado *****
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

		if(strIdProv.equals("Nuevo")){
			tvIdProv.setText(getId("Prov"));
			etIdProv.setText(getId("Prov"));
		}else{// *** Modo editar ***
			tvIdProv.setText(strIdProv);
			etIdProv.setText(strIdProv);

			try{// *** se recupera los datos de ese proveedor ***
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
				{	// *** se insertan los datos en el formulario ***
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
				
				//*** se verifica si el registro no existe ***
				boolean datoNoExiste = true;
				boolean IdNoExiste = true;
				String idProv = "";
				String idProvA = "";
				if(strIdProv.equals("Nuevo")){idProvA = getId("Prov");}
				else{datosProv.add(idProvA = strIdProv);}
				String idProvB = etIdProv.getText().toString();
				String strEmp = etEmpProv.getText().toString();
				String strProm = etPromProv.getText().toString();
				
				if(!idProvA.equals(idProvB) || strIdProv.equals("Nuevo"))
				{
					// *** 1) se verifica si Id no existe ***
					String[] comparar = {idProvB};
					db = conectar.getReadableDatabase();
					c = db.query(Tablas.PROVEEDORES,null,Tablas.PROVEEDORES_ID+"=?",comparar,null,null,null);
					if(c.moveToFirst()){	IdNoExiste = false;}
					c.close();
					db.close();
					if(!IdNoExiste){showAlertaMsg(getString(R.string.alerta)+"  "+getString(R.string.ese)+"  "+getString(R.string.id)+"  "+getString(R.string.ya)+"  "+getString(R.string.existe));}
				}
				
				// *** 2) se verifica si la empresa/promotor no existe ***
				db = conectar.getReadableDatabase();//abrimos la base en modo lectura
				c =  db.rawQuery(" SELECT DISTINCT "+Tablas.PROVEEDORES_ID+" FROM "+Tablas.PROVEEDORES+" WHERE empresa='"+strEmp+"' AND promotor='"+strProm+"'", null);
				if(c.moveToFirst())
				{
					idProv = c.getString(0);
					if(!idProv.equals(idProvA)){datoNoExiste = false;}
				}
				c.close();
				db.close();
				if(!datoNoExiste){showAlertaMsg(getString(R.string.alerta)+"  "+getString(R.string.ese)+"  "+getString(R.string.proveedor)+"  "+getString(R.string.ya)+"  "+getString(R.string.existe));}
				
				if(IdNoExiste && datoNoExiste)
				{
					// *** almacenamos los datos del:
					// *** formulario(ingresado por teclado)
					
					datosProv.clear();
					datosProv.add(etIdProv.getText().toString());
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

					if(datosOk)//si no hay datos nulos procedemos
					{
						ContentValues registro = new ContentValues();
						registro.put(Tablas.PROVEEDORES_ID,datosProv.get(0));
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
								//*** se insertan los datos ***
								db = conectar.getWritableDatabase();
								db.insert(Tablas.PROVEEDORES,null,registro);
								db.close();
								
								metodo.msg(getString(R.string.datos)+"  "+getString(R.string.guardados));

								//limpiar();

							}catch(Exception e){metodo.msg(getString(R.string.tabla_vacia)+e.toString());}

						}else{

							try
							{	
								String[] compa = {idProvA};//IdProv antes de la modificacion
								//*** se actualizan los datos
								db = conectar.getWritableDatabase();
								db.update(Tablas.PROVEEDORES,registro,Tablas.PROVEEDORES_ID+"=?",compa);
								db.close();

								metodo.msg(getString(R.string.datos)+"  "+getString(R.string.actualizados));


							}catch(Exception e){metodo.msg("error"+" "+e.toString());}

						}

						//********************
						
					}else{
						metodo.msg(getString(R.string.faltan)+"  "+getString(R.string.datos));
					}
					
					
					volver();
				}

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
			.setTitle(getString(R.string.alerta)+"  "+getString(R.string.este)+"  "+getString(R.string.item)+"  "+getString(R.string.puede_estar)+"  "+getString(R.string.vinculado)+"  "+getString(R.string.a_otros)+"  "+getString(R.string.datos))
			.setMessage(getString(R.string.desea)+"  "+getString(R.string.eliminar)+"  "+getString(R.string.de_igual_manera))

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


	public String getId(String s){

		int num = 1;
		String str;
		boolean repetir = false;
		//*** se recupera el numero de control
		db = conectar.getReadableDatabase();
		c = db.query(Tablas.CONTROL,null,null,null,null,null,null);
		if(c.moveToFirst()){num = Integer.parseInt(c.getString(3));}
		c.close();
		db.close();
		// *** se formula el código ***
		str = s + num;
		//*** se verifica si no existe ***
		String[] comparar = {str};
		db = conectar.getReadableDatabase();
		c = db.query(Tablas.PROVEEDORES,null,Tablas.PROVEEDORES_ID+"=?",comparar,null,null,null);
		if(c.moveToFirst()){	repetir = true;}
		c.close();
		db.close();
		//*** si existe se incrementa el número de control
		//*** se actualiza y se vuelve a llamar a la funcion
		if(repetir)
		{
			num++;
			String[] compa = {"id"};
			ContentValues registro = new ContentValues();
			registro.put(Tablas.CONTROL_PROV,String.valueOf(num));
			db = conectar.getWritableDatabase();
			db.update(Tablas.CONTROL,registro,Tablas.CONTROL_ID+"=?",compa);
			db.close();
			//*** se llama a la funcion ***
			str = getId(s);
		}
		
		return str;
	}
	
	public void limpiar()
	{
		etIdProv.setText("");
		etEmpProv.setText("");
		etTelefProv.setText("");
		etPromProv.setText("");
		etCelProv.setText("");
		etMailProv.setText("");
	}
	
	
	private void showAlertaMsg(String str){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder
			.setTitle(str)
			.setMessage(getString(R.string.porfavor)+"  "+getString(R.string.verifique)+"  "+getString(R.string.los)+"  "+getString(R.string.datos))

			.setPositiveButton(getString(R.string.aceptar), new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {

					dialog.dismiss();
					volver();
				}
			})

			.show();
    }
		
}

