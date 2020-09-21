package com.jcdc.gi.Entidades;

public class Usuario
{
	public String id;
	public String nombre;
	public String clave;
	public String celular;
	public String mail;
	public String categoria;
	public String conexion;
	public String estado;
	
	public Usuario(){}

	public Usuario(String id, String nombre, String clave, String celular, String mail, String categoria, String conexion, String estado)
	{
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.celular = celular;
		this.mail = mail;
		this.categoria = categoria;
		this.conexion = conexion;
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

	public void setClave(String clave)
	{
		this.clave = clave;
	}

	public String getClave()
	{
		return clave;
	}

	public void setCelular(String celular)
	{
		this.celular = celular;
	}

	public String getCelular()
	{
		return celular;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public String getMail()
	{
		return mail;
	}

	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}

	public String getCategoria()
	{
		return categoria;
	}

	public void setConexion(String conexion)
	{
		this.conexion = conexion;
	}

	public String getConexion()
	{
		return conexion;
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
