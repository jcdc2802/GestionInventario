package com.jcdc.gi.Entidades;

public class Proveedor
{
	public String id;
	public String empresa;
	public String telefono;
	public String promotor;
	public String celular;
	public String mail;
	public String estado;
	
	public Proveedor(){}

	public Proveedor(String id, String empresa, String telefono, String promotor, String celular, String mail, String estado)
	{
		this.id = id;
		this.empresa = empresa;
		this.telefono = telefono;
		this.promotor = promotor;
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

	public void setEmpresa(String empresa)
	{
		this.empresa = empresa;
	}

	public String getEmpresa()
	{
		return empresa;
	}

	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	public String getTelefono()
	{
		return telefono;
	}

	public void setPromotor(String promotor)
	{
		this.promotor = promotor;
	}

	public String getPromotor()
	{
		return promotor;
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
