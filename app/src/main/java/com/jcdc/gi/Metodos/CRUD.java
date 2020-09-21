package com.jcdc.gi.Metodos;
import android.database.*;
import android.database.sqlite.*;
import android.support.v7.app.*;
import com.jcdc.gi.ConexionSqlite.*;
import java.util.*;

public class CRUD extends AppCompatActivity
{
	ConexionSqlite conexion = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;
	
	ArrayList<String> compA;
	ArrayList<String> compB;
	
	
	public Boolean tablaVacia(){
		
		return true;
	}
	
	public void guardar(){
		
		
	}
	
	public void editar(){
		
		
	}
	
	public void eliminar(){
		
		
	}
	
}
