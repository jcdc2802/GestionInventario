package com.jcdc.gi.ConexionSqlite;
import android.content.*;
import android.database.sqlite.*;
import com.jcdc.gi.Tablas.*;

public class ConexionSqlite extends SQLiteOpenHelper
{
	public ConexionSqlite(Context context)
	{
		super(context,Tablas.NOMBRE_DATABASE,null,Tablas.VERSION_DATABASE);
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(Tablas.CREAR_TABLA_USUARIOS);
		db.execSQL(Tablas.CREAR_TABLA_CLIENTES);
		db.execSQL(Tablas.CREAR_TABLA_PROVEEDORES);
		db.execSQL(Tablas.CREAR_TABLA_PRODUCTOS);
		db.execSQL(Tablas.CREAR_TABLA_TRANSITORIA);
		db.execSQL(Tablas.CREAR_TABLA_VENTAS);
		db.execSQL(Tablas.CREAR_TABLA_COMPRAS);
		db.execSQL(Tablas.CREAR_TABLA_KARDEX);
		db.execSQL(Tablas.CREAR_TABLA_COMBOS);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int p2, int p3)
	{
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_USUARIOS);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_CLIENTES);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_PROVEEDORES);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_PRODUCTOS);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_TRANSITORIA);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_VENTAS);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_COMPRAS);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_KARDEX);
		db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_COMBOS);
		onCreate(db);
	}
	
}
