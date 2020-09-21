package com.jcdc.gi.Entidades;

public class Cliente
{
	public String id;
	public String nombre;
	public String nit;
	public String celular;
	public String mail;
	public String estado;
	
	public Cliente(){}
	
	public Cliente(String id, String nombre, String nit, String celular, String mail, String estado)
	{
		this.id = id;
		this.nombre = nombre;
		this.nit = nit;
		this.celular = celular;
		this.mail = mail;
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

	public void setNit(String nit)
	{
		this.nit = nit;
	}

	public String getNit()
	{
		return nit;
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

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public String getEstado()
	{
		return estado;
	}
    
    
}
