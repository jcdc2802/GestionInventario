package com.jcdc.gi.Entidades;
import android.support.v7.app.*;

public class Producto extends AppCompatActivity
{
	public String id;
	public String linea;
	public String nombre;
	public String cualidad;
	public String unidad_v;
	public String precio_v;
	public String unidad_c;
	public String precio_c;
	public String stock;
	public String minimo;
	public String id_proveedor;
	public String estado;
	
	public Producto(){}

	public Producto(String id, String linea, String nombre, String cualidad, String unidad_v, String precio_v, String unidad_c, String precio_c, String stock, String minimo, String id_proveedor, String estado)
	{
		this.id = id;
		this.linea = linea;
		this.nombre = nombre;
		this.cualidad = cualidad;
		this.unidad_v = unidad_v;
		this.precio_v = precio_v;
		this.unidad_c = unidad_c;
		this.precio_c = precio_c;
		this.stock = stock;
		this.minimo = minimo;
		this.id_proveedor = id_proveedor;
		this.estado = estado;
	}
	
	
}
