package com.jcdc.gi.Entidades;

public class Kardex
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

	public void setFecha(String fecha)
	{
		this.fecha = fecha;
	}

	public String getFecha()
	{
		return fecha;
	}

	public void setProforma(String proforma)
	{
		this.proforma = proforma;
	}

	public String getProforma()
	{
		return proforma;
	}

	public void setDetalle(String detalle)
	{
		this.detalle = detalle;
	}

	public String getDetalle()
	{
		return detalle;
	}

	public void setEntrada(String entrada)
	{
		this.entrada = entrada;
	}

	public String getEntrada()
	{
		return entrada;
	}

	public void setSalida(String salida)
	{
		this.salida = salida;
	}

	public String getSalida()
	{
		return salida;
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
