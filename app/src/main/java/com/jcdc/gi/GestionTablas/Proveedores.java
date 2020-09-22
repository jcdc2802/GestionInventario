package com.jcdc.gi.GestionTablas;
import android.os.*;
import android.support.v7.app.*;
//import android.support.v7.appcompat.*;
import com.jcdc.gi.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import com.jcdc.gi.Metodos.*;
import com.jcdc.gi.Tablas.*;
import com.jcdc.gi.ConexionSqlite.*;
import android.database.sqlite.*;
import android.database.*;

public class Proveedores extends AppCompatActivity implements OnClickListener
{
	Button btnPrueba;
	
	ConexionSqlite conectar = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;
	
	CRUD metCrud = new CRUD(this);
	Metodos metodo = new Metodos(this);

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.proveedores);
		
		btnPrueba = findViewById(R.id.btnPrueba);
		
		btnPrueba.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View p1)
	{
		// TODO: Implement this method
		
		try{
			
			Boolean vacia = metCrud.tablaVacia(Tablas.TABLA_PROVEEDORES);

			if(vacia){

				metodo.msg("tabla con registros");
			}else{

				metodo.msg("tabla vacia");
			}
			
			
		}catch(Exception e){metodo.msg(e.toString());}
		
		
		
		
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
