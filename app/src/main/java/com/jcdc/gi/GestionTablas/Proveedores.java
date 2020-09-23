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

public class Proveedores extends AppCompatActivity implements OnClickListener, OnItemSelectedListener
{
	ConexionSqlite conectar = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;
	
	Button btnGuardarProv;
	EditText etEmpProv,etTelefProv,etPromProv;
	EditText etCelProv,etMailProv;
	TextView tvIdProv;
	ArrayList<String> datosProv;
	
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
		
		btnGuardarProv = findViewById(R.id.btnGuardarProv);
		etEmpProv = findViewById(R.id.etEmpProv);
		etTelefProv = findViewById(R.id.etTelefProv);
		etPromProv = findViewById(R.id.etPromProv);
		etCelProv = findViewById(R.id.etCelProv);
		etMailProv = findViewById(R.id.etMailProv);
		tvIdProv = findViewById(R.id.tvIdProv);
		
		btnGuardarProv.setOnClickListener(this);
		
		//Spinner Estado
		arrayEstado = new ArrayList<>();
		arrayEstado.add("activo");
		arrayEstado.add("inactivo");
		spnEstado = findViewById(R.id.spnEstadoProv);
		ArrayAdapter<CharSequence> adapEstado = ArrayAdapter.createFromResource(
			this,
			R.array.actividad,
			R.layout.spinner_modelo);
		spnEstado.setAdapter(adapEstado);
		spnEstado.setOnItemSelectedListener(this);
		
		tvIdProv.setText("Prov"+numId());
		
		
	}
	
	@Override
	public void onClick(View p1)
	{
		boolean datoNulo = false;
		
		datosProv.clear();
		datosProv.add("Prov"+numId());
		datosProv.add(etEmpProv.getText().toString());
		datosProv.add(etTelefProv.getText().toString());
		datosProv.add(etPromProv.getText().toString());
		datosProv.add(etCelProv.getText().toString());
		datosProv.add(etMailProv.getText().toString());
		datosProv.add("guardar");
		datosProv.add(spnEstado.getSelectedItem().toString());
		
		for(int i=0;i<datosProv.size();i++){
			
			if(datosProv.get(i).equals("")){datoNulo = true;}
		}
		
		if(datoNulo){
			
			metodo.msg("Algun dato es nulo");
		}else{
			
			try{

				boolean vacia = metCrud.tablaVacia(Tablas.PROVEEDORES);

				if(vacia){

					metodo.msg("tabla con registros");
				}else{

					metodo.msg("tabla vacia");
					
					
					ContentValues registro = new ContentValues();
					registro.put(Tablas.PROVEEDORES_ID,datosProv.get(0));
					registro.put(Tablas.PROVEEDORES_EMPRESA,datosProv.get(1));
					registro.put(Tablas.PROVEEDORES_TELEFONO,datosProv.get(2));
					registro.put(Tablas.PROVEEDORES_PROMOTOR,datosProv.get(3));
					registro.put(Tablas.PROVEEDORES_CELULAR,datosProv.get(4));
					registro.put(Tablas.PROVEEDORES_MAIL,datosProv.get(5));
					registro.put(Tablas.PROVEEDORES_FIREBASE,datosProv.get(6));
					registro.put(Tablas.PROVEEDORES_ESTADO,datosProv.get(7));

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
					
					metodo.msg("datos guardados");
					
					limpiar();
				}


			}catch(Exception e){metodo.msg("Tabla vacia "+e.toString());}
			
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
		}
		c.close();
		db.close();
		
		num = Integer.parseInt(str);
		
		return num;
	}
	
	public void limpiar(){
		
		etEmpProv.setText("");
		etTelefProv.setText("");
		etPromProv.setText("");
		etCelProv.setText("");
		etMailProv.setText("");
	}
	
}
