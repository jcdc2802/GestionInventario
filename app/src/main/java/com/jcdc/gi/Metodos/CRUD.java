package com.jcdc.gi.Metodos;
import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import android.support.v7.app.*;
import com.jcdc.gi.ConexionSqlite.*;
import java.util.*;

public class CRUD extends AppCompatActivity
{
	private static Context context;
	
	ConexionSqlite conectar;
	SQLiteDatabase db;
	Cursor c;
	
	ArrayList<String> compA;
	ArrayList<String> compB;
	
	public CRUD(Context c)
	{
		context = c;
	}
	
	
	public Boolean tablaVacia(String tabla){
		
		conectar = new ConexionSqlite(context);
		
		Boolean vacio = false;
		db = conectar.getReadableDatabase();
		c = db.query(tabla,null,null,null,null,null,null);
		if(c.moveToFirst()){vacio = true;}
		c.close();
		db.close();
		
		return vacio;
	}
	
	public Boolean regRepetido(){
		
		/*
		Boolean rep = true;
		String compararA = Utilidades.COL_LINEA_PROD+"=?"+" and "+Utilidades.COL_PRODUCTO_PROD+"=?"+" and "+Utilidades.COL_COLOR_PROD+"=?";
		String[] compararB = {arrayRegistro.get(1),arrayRegistro.get(2),arrayRegistro.get(3)};

		db = conectar.getReadableDatabase();
		c = db.query(Utilidades.TABLA_PRODUCTOS,null,compararA,compararB,null,null,null);
		if(c.moveToFirst())
		{
			msg(getString(R.string.producto_existe));
			rep = false;
		}
		c.close();
		db.close();*/
		
		return true;
	}
	
	public void guardar(){
		
		
	}
	
	public void editar(){
		
		
	}
	
	public void eliminar(){
		
		
	}
	
}
