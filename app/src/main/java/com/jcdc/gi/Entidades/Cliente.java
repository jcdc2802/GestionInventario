package com.jcdc.gi.Entidades;
import android.support.v7.app.*;

public class Cliente extends AppCompatActivity
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
    
    
}
