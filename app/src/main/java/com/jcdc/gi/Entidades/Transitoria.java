package com.jcdc.gi.Entidades;

public class Transitoria
{
	public String proforma;
	public String id_producto;
	public String id_clie_prov;
	public String id_usuario;
	public String cantidad;
	public String precio;
	public String fecha;
	public String saldo;
	
	public void Transitoria(){}

	public Transitoria(String proforma, String id_producto, String id_clie_prov, String id_usuario, String cantidad, String precio, String fecha, String saldo)
	{
		this.proforma = proforma;
		this.id_producto = id_producto;
		this.id_clie_prov = id_clie_prov;
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

	public void setId_clie_prov(String id_clie_prov)
	{
		this.id_clie_prov = id_clie_prov;
	}

	public String getId_clie_prov()
	{
		return id_clie_prov;
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
