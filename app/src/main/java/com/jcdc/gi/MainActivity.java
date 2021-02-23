package com.jcdc.gi;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.content.*;
import com.jcdc.gi.Metodos.*;
import android.view.View.*;
import android.view.*;
import com.jcdc.gi.GestionTablas.*;
import com.jcdc.gi.Tablas.*;
import com.jcdc.gi.ConexionSqlite.*;
import android.database.sqlite.*;
import android.database.*;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
	ConexionSqlite conectar = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;
	
	Metodos metodo = new Metodos(this);
	CRUD metCrud = new CRUD(this);
	
	boolean tablaOk;
	Button btnProveedor;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		try{
			
			btnProveedor = findViewById(R.id.btnProveedor);

			btnProveedor.setOnClickListener(this);

			//metodo.msg("Hola Jc");

			tablaOk = metCrud.tablaVacia(Tablas.CONTROL);

			if(tablaOk){

				//metodo.msg("tabla con registros");
			}else{

				metodo.msg("tabla vacia");
				ContentValues registro = new ContentValues();
				registro.put(Tablas.CONTROL_ID,"id");
				registro.put(Tablas.CONTROL_USU,"1");
				registro.put(Tablas.CONTROL_CLIE,"1");
				registro.put(Tablas.CONTROL_PROV,"1");
				registro.put(Tablas.CONTROL_PROD,"1");
				registro.put(Tablas.CONTROL_COMB,"1");
				registro.put(Tablas.CONTROL_FIREBASE,"No");

				db = conectar.getWritableDatabase();
				db.insert(Tablas.CONTROL,null,registro);
				db.close();
			}
			
			
		}catch(Exception e){metodo.msg(e.toString());}
		
		
		
    }
	
	
	@Override
	public void onClick(View id)
	{
		// TODO: Implement this method
		
		try{
			
			Intent prov = new Intent(this,com.jcdc.gi.GestionTablas.TablaProv.class);
			startActivity(prov);
			
		}catch(Exception e){metodo.msg("error"+" "+e.toString());}
		
		
	}
	
	
}
