package com.jcdc.gi.Entidades;

public class Producto
{
	public String id;
	public String linea;
	public String nombre;
	public String cualidad;
	public String unidad_v;
	public String precio_v;
	public String unidad_c;
	public String precio_c;
	public String stock;
	public String minimo;
	public String id_proveedor;
	public String id_combo;
	public String precio_combo;
	public String estado;
	
	public Producto(){}

	public Producto(String id, String linea, String nombre, String cualidad, String unidad_v, String precio_v, String unidad_c, String precio_c, String stock, String minimo, String id_proveedor, String id_combo, String precio_combo, String estado)
	{
		this.id = id;
		this.linea = linea;
		this.nombre = nombre;
		this.cualidad = cualidad;
		this.unidad_v = unidad_v;
		this.precio_v = precio_v;
		this.unidad_c = unidad_c;
		this.precio_c = precio_c;
		this.stock = stock;
		this.minimo = minimo;
		this.id_proveedor = id_proveedor;
		this.id_combo = id_combo;
		this.precio_combo = precio_combo;
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

	public void setLinea(String linea)
	{
		this.linea = linea;
	}

	public String getLinea()
	{
		return linea;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setCualidad(String cualidad)
	{
		this.cualidad = cualidad;
	}

	public String getCualidad()
	{
		return cualidad;
	}

	public void setUnidad_v(String unidad_v)
	{
		this.unidad_v = unidad_v;
	}

	public String getUnidad_v()
	{
		return unidad_v;
	}

	public void setPrecio_v(String precio_v)
	{
		this.precio_v = precio_v;
	}

	public String getPrecio_v()
	{
		return precio_v;
	}

	public void setUnidad_c(String unidad_c)
	{
		this.unidad_c = unidad_c;
	}

	public String getUnidad_c()
	{
		return unidad_c;
	}

	public void setPrecio_c(String precio_c)
	{
		this.precio_c = precio_c;
	}

	public String getPrecio_c()
	{
		return precio_c;
	}

	public void setStock(String stock)
	{
		this.stock = stock;
	}

	public String getStock()
	{
		return stock;
	}

	public void setMinimo(String minimo)
	{
		this.minimo = minimo;
	}

	public String getMinimo()
	{
		return minimo;
	}

	public void setId_proveedor(String id_proveedor)
	{
		this.id_proveedor = id_proveedor;
	}

	public String getId_proveedor()
	{
		return id_proveedor;
	}

	public void setId_combo(String id_combo)
	{
		this.id_combo = id_combo;
	}

	public String getId_combo()
	{
		return id_combo;
	}

	public void setPrecio_combo(String precio_combo)
	{
		this.precio_combo = precio_combo;
	}

	public String getPrecio_combo()
	{
		return precio_combo;
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
