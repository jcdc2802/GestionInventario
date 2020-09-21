package com.jcdc.gi.Entidades;

public class Combo
{
	public String id;
	public String nombre;
	public String id_producto;
	public String precio;
	public String estado;
	
	public Combo(){}

	public Combo(String id, String nombre, String id_producto, String precio, String estado)
	{
		this.id = id;
		this.nombre = nombre;
		this.id_producto = id_producto;
		this.precio = precio;
		this.estado = estado;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getId()
	{
		return id;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setId_producto(String id_producto)
	{
		this.id_producto = id_producto;
	}

	public String getId_producto()
	{
		return id_producto;
	}
	
	public void setPrecio(String precio)
	{
		this.precio = precio;
	}

	public String getPrecio()
	{
		return precio;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public String getEstado()
	{
		return estado;
	}
	
	
}
