package com.jcdc.gi.Entidades;
import android.support.v7.app.*;

public class Usuario extends AppCompatActivity
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
	
	
}
