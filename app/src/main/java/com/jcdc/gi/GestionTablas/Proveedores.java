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

public class Proveedores extends AppCompatActivity implements OnClickListener
{
	Button btnGuardarProv;
	EditText etEmpProv,etTelefProv,etPromProv;
	EditText etCelProv,etMailProv;
	ArrayList<String> datosProv;
	
	
	ConexionSqlite conectar = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;
	
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
		
		btnGuardarProv.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View p1)
	{
		boolean datoNulo = false;
		
		datosProv.clear();
		datosProv.add("Prov1");
		datosProv.add(etEmpProv.getText().toString());
		datosProv.add(etTelefProv.getText().toString());
		datosProv.add(etPromProv.getText().toString());
		datosProv.add(etCelProv.getText().toString());
		datosProv.add(etMailProv.getText().toString());
		datosProv.add("Activo");
		
		for(int i=0;i<datosProv.size();i++){
			
			if(datosProv.get(i).equals("")){datoNulo = true;}
		}
		
		if(datoNulo){
			
			metodo.msg("Algun dato es nulo");
		}else{
			
			try{

				boolean vacia = metCrud.tablaVacia(Tablas.TABLA_PROVEEDORES);

				if(vacia){

					metodo.msg("tabla con registros");
				}else{

					metodo.msg("tabla vacia");
					
					
					ContentValues registro = new ContentValues();
					registro.put(Tablas.COL_ID_PROV,datosProv.get(0));
					registro.put(Tablas.COL_EMPRESA_PROV,datosProv.get(1));
					registro.put(Tablas.COL_TELEFONO_PROV,datosProv.get(2));
					registro.put(Tablas.COL_PROMOTOR_PROV,datosProv.get(3));
					registro.put(Tablas.COL_CELULAR_PROV,datosProv.get(4));
					registro.put(Tablas.COL_MAIL_PROV,datosProv.get(5));
					registro.put(Tablas.COL_ESTADO_PROV,datosProv.get(6));

					db = conectar.getWritableDatabase();
					db.insert(Tablas.TABLA_PROVEEDORES,null,registro);
					db.close();
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
	
	
	
}
