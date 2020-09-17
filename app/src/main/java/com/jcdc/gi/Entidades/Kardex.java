package com.jcdc.gi.Entidades;
import android.support.v7.app.*;

public class Kardex extends AppCompatActivity
{
	public String fecha;
	public String proforma;
	public String detalle;
	public String entrada;
	public String salida;
	public String saldo;
	
	public Kardex(){}

	public Kardex(String fecha, String proforma, String detalle, String entrada, String salida, String saldo)
	{
		this.fecha = fecha;
		this.proforma = proforma;
		this.detalle = detalle;
		this.entrada = entrada;
		this.salida = salida;
		this.saldo = saldo;
	}
	
}
