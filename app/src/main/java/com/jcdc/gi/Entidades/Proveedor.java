package com.jcdc.gi.Entidades;
import android.support.v7.app.*;

public class Proveedor extends AppCompatActivity
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
	
}
