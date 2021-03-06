package com.jcdc.gi.Entidades;

public class Compra
{
	public String proforma;
	public String id_producto;
	public String id_proveedor;
	public String id_usuario;
	public String cantidad;
	public String precio;
	public String fecha;
	public String saldo;
	
	public Compra(){}

	public Compra(String proforma, String id_producto, String id_proveedor, String id_usuario, String cantidad, String precio, String fecha, String saldo)
	{
		this.proforma = proforma;
		this.id_producto = id_producto;
		this.id_proveedor = id_proveedor;
		this.id_usuario = id_usuario;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecha = fecha;
		this.saldo = saldo;
	}

	public void setProforma(String proforma)
	{
		this.proforma = proforma;
	}

	public String getProforma()
	{
		return proforma;
	}

	public void setId_producto(String id_producto)
	{
		this.id_producto = id_producto;
	}

	public String getId_producto()
	{
		return id_producto;
	}

	public void setId_proveedor(String id_proveedor)
	{
		this.id_proveedor = id_proveedor;
	}

	public String getId_proveedor()
	{
		return id_proveedor;
	}

	public void setId_usuario(String id_usuario)
	{
		this.id_usuario = id_usuario;
	}

	public String getId_usuario()
	{
		return id_usuario;
	}

	public void setCantidad(String cantidad)
	{
		this.cantidad = cantidad;
	}

	public String getCantidad()
	{
		return cantidad;
	}

	public void setPrecio(String precio)
	{
		this.precio = precio;
	}

	public String getPrecio()
	{
		return precio;
	}

	public void setFecha(String fecha)
	{
		this.fecha = fecha;
	}

	public String getFecha()
	{
		return fecha;
	}

	public void setSaldo(String saldo)
	{
		this.saldo = saldo;
	}

	public String getSaldo()
	{
		return saldo;
	}
	
	
}
