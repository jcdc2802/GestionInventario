package com.jcdc.gi.Entidades;
import android.support.v7.app.*;

public class Venta extends AppCompatActivity
{
	public String proforma;
	public String id_producto;
	public String id_cliente;
	public String id_usuario;
	public String cantidad;
	public String precio;
	public String fecha;
	public String saldo;
	
	public Venta(){}

	public Venta(String proforma, String id_producto, String id_cliente, String id_usuario, String cantidad, String precio, String fecha, String saldo)
	{
		this.proforma = proforma;
		this.id_producto = id_producto;
		this.id_cliente = id_cliente;
		this.id_usuario = id_usuario;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecha = fecha;
		this.saldo = saldo;
	}
	
	
	
}
