package com.jcdc.gi.Tablas;

public class Tablas
{
	public static final int VERSION_DATABASE = 1;
	public static final String NOMBRE_DATABASE = "Gestion de Inventario 2021.db";
	public static final Boolean VERSION_FREE = true;

	//*** Entidad Usuarios ***
	public static final String USUARIOS = "usuarios";
	public static final String USUARIOS_ID = "id";
	public static final String USUARIOS_NOMBRE = "nombre";
	public static final String USUARIOS_CLAVE = "clave";
	public static final String USUARIOS_CELULAR = "celular";
	public static final String USUARIOS_MAIL = "mail";
	public static final String USUARIOS_CATEGORIA = "categoria";
	public static final String USUARIOS_CONEXION = "conexion";
	public static final String USUARIOS_FIREBASE = "firebase";
	public static final String USUARIOS_ESTADO = "estado";
	//public static final Integer N_USU = 5;
	public static final String CREAR_TABLA_USUARIOS = "CREATE TABLE "+
	USUARIOS+"("+
	USUARIOS_ID+" TEXT,"+
	USUARIOS_NOMBRE+" TEXT,"+
	USUARIOS_CLAVE+" TEXT,"+
	USUARIOS_CELULAR+" TEXT,"+
	USUARIOS_MAIL+" TEXT,"+
	USUARIOS_CATEGORIA+" TEXT,"+
	USUARIOS_CONEXION+" TEXT,"+
	USUARIOS_FIREBASE+" TEXT,"+
	USUARIOS_ESTADO+" TEXT)";

	//*** Entidad Clientes ***
	public static final String CLIENTES = "clientes";
	public static final String CLIENTES_ID = "id";
	public static final String CLIENTES_NOMBRE = "nombre";
	public static final String CLIENTES_NIT = "nit";
	public static final String CLIENTES_CELULAR = "celular";
	public static final String CLIENTES_MAIL = "mail";
	public static final String CLIENTES_FIREBASE = "firebase";
	public static final String CLIENTES_ESTADO = "estado";
	//public static final Integer N_CLIE = 5;
	public static final String CREAR_TABLA_CLIENTES = "CREATE TABLE "+
	CLIENTES+"("+
	CLIENTES_ID+" TEXT,"+
	CLIENTES_NOMBRE+" TEXT,"+
	CLIENTES_NIT+" TEXT,"+
	CLIENTES_CELULAR+" TEXT,"+
	CLIENTES_MAIL+" TEXT,"+
	CLIENTES_FIREBASE+" TEXT,"+
	CLIENTES_ESTADO+" TEXT"+")";

	//*** Entidad Proveedores ***
	public static final String PROVEEDORES = "proveedores";
	public static final String PROVEEDORES_ID = "id";
	public static final String PROVEEDORES_EMPRESA = "empresa";
	public static final String PROVEEDORES_TELEFONO = "telefono";
	public static final String PROVEEDORES_PROMOTOR = "promotor";
	public static final String PROVEEDORES_CELULAR = "celular";
	public static final String PROVEEDORES_MAIL = "mail";
	public static final String PROVEEDORES_FIREBASE = "firebase";
	public static final String PROVEEDORES_ESTADO = "estado";
	//public static final Integer N_PROV = 5;
	public static final String CREAR_TABLA_PROVEEDORES = "CREATE TABLE "+
	PROVEEDORES+"("+
	PROVEEDORES_ID+" TEXT,"+
	PROVEEDORES_EMPRESA+" TEXT,"+
	PROVEEDORES_TELEFONO+" TEXT,"+
	PROVEEDORES_PROMOTOR+" TEXT,"+
	PROVEEDORES_CELULAR+" TEXT,"+
	PROVEEDORES_MAIL+" TEXT,"+
	PROVEEDORES_FIREBASE+" TEXT,"+
	PROVEEDORES_ESTADO+" TEXT"+")";

	//*** Entidad Productos ***
	public static final String PRODUCTOS = "productos";
	public static final String PRODUCTOS_ID = "id";
	public static final String PRODUCTOS_LINEA = "linea";
	public static final String PRODUCTOS_NOMBRE = "nombre";
	public static final String PRODUCTOS_CUALIDAD = "cualidad";
	public static final String PRODUCTOS_UNIDAD_V = "unidad_v";
	public static final String PRODUCTOS_PRECIO_V = "precio_v";
	public static final String PRODUCTOS_UNIDAD_C = "unidad_c";
	public static final String PRODUCTOS_PRECIO_C = "precio_c";
	public static final String PRODUCTOS_STOCK = "stock";
	public static final String PRODUCTOS_MINIMO = "minimo";
	public static final String PRODUCTOS_ID_PROVEEDOR = "id_proveedor";
	public static final String PRODUCTOS_ID_COMBO = "id_combo";
	public static final String PRODUCTOS_PRECIO_COMBO = "precio_combo";
	public static final String PRODUCTOS_FIREBASE = "firebase";
	public static final String PRODUCTOS_ESTADO = "estado";
	//public static final Integer N_PROD = 5;
	public static final String CREAR_TABLA_PRODUCTOS = "CREATE TABLE "+
	PRODUCTOS+"("+
	PRODUCTOS_ID+" TEXT,"+
	PRODUCTOS_LINEA+" TEXT,"+
	PRODUCTOS_NOMBRE+" TEXT,"+
	PRODUCTOS_CUALIDAD+" TEXT,"+
	PRODUCTOS_UNIDAD_V+" TEXT,"+
	PRODUCTOS_PRECIO_V+" TEXT,"+
	PRODUCTOS_UNIDAD_C+" TEXT,"+
	PRODUCTOS_PRECIO_C+" TEXT,"+
	PRODUCTOS_STOCK+" TEXT,"+
	PRODUCTOS_MINIMO+" TEXT,"+
	PRODUCTOS_ID_PROVEEDOR+" TEXT,"+
	PRODUCTOS_ID_COMBO+" TEXT,"+
	PRODUCTOS_PRECIO_COMBO+" TEXT,"+
	PRODUCTOS_FIREBASE+" TEXT,"+
	PRODUCTOS_ESTADO+" TEXT"+")";

	//*** Entidad Transitoria ***
	public static final String TRANSITORIA = "transitoria";
	public static final String TRANSITORIA_ID_TRANSACCION = "id_transaccion";
	public static final String TRANSITORIA_PROFORMA = "proforma";
	public static final String TRANSITORIA_ID_PROD = "id_producto";
	public static final String TRANSITORIA_ID_CLIE_PROV = "id_clie_prov";
	public static final String TRANSITORIA_ID_USU = "id_usuario";
	public static final String TRANSITORIA_CANTIDAD = "cantidad";
	public static final String TRANSITORIA_PRECIO = "precio";
	public static final String TRANSITORIA_FECHA = "fecha";
	public static final String TRANSITORIA_SALDO = "saldo";
	public static final String TRANSITORIA_FIREBASE = "firebase";
	//public static final Integer N_TRANS = 5;
	public static final String CREAR_TABLA_TRANSITORIA = "CREATE TABLE "+
	TRANSITORIA+"("+
	TRANSITORIA_ID_TRANSACCION+" TEXT,"+
	TRANSITORIA_PROFORMA+" TEXT,"+
	TRANSITORIA_ID_PROD+" TEXT,"+
	TRANSITORIA_ID_CLIE_PROV+" TEXT,"+
	TRANSITORIA_ID_USU+" TEXT,"+
	TRANSITORIA_CANTIDAD+" TEXT,"+
	TRANSITORIA_PRECIO+" TEXT,"+
	TRANSITORIA_FECHA+" TEXT,"+
	TRANSITORIA_SALDO+" TEXT,"+
	TRANSITORIA_FIREBASE+" TEXT)";

	//*** Entidad ventas ***
	public static final String VENTAS = "ventas";
	public static final String VENTAS_ID_VENTA = "id_venta";
	public static final String VENTAS_PROFORMA = "proforma";
	public static final String VENTAS_ID_PROD = "id_producto";
	public static final String VENTAS_ID_CLIE = "id_cliente";
	public static final String VENTAS_ID_USU = "id_usuario";
	public static final String VENTAS_CANTIDAD = "cantidad";
	public static final String VENTAS_PRECIO = "precio";
	public static final String VENTAS_FECHA = "fecha";
	public static final String VENTAS_SALDO = "saldo";
	public static final String VENTAS_FIREBASE = "firebase";
	//public static final Integer N_VENT = 5;
	public static final String CREAR_TABLA_VENTAS = "CREATE TABLE "+
	VENTAS+"("+
	VENTAS_ID_VENTA+" TEXT,"+
	VENTAS_PROFORMA+" TEXT,"+
	VENTAS_ID_PROD+" TEXT,"+
	VENTAS_ID_CLIE+" TEXT,"+
	VENTAS_ID_USU+" TEXT,"+
	VENTAS_CANTIDAD+" TEXT,"+
	VENTAS_PRECIO+" TEXT,"+
	VENTAS_FECHA+" TEXT,"+
	VENTAS_SALDO+" TEXT,"+
	VENTAS_FIREBASE+" TEXT)";

	//*** Entidad compras ***
	public static final String COMPRAS = "compras";
	public static final String COMPRAS_ID_COMPRA = "id_compra";
	public static final String COMPRAS_PROFORMA = "proforma";
	public static final String COMPRAS_ID_PROD = "id_producto";
	public static final String COMPRAS_ID_PROV = "id_proveedor";
	public static final String COMPRAS_ID_USU = "id_usuario";
	public static final String COMPRAS_CANTIDAD = "cantidad";
	public static final String COMPRAS_PRECIO = "precio";
	public static final String COMPRAS_FECHA = "fecha";
	public static final String COMPRAS_SALDO = "saldo";
	public static final String COMPRAS_FIREBASE = "firebase";
	//public static final String COL_FECHA_NEW_COMP = "fecha_new_comp";
	public static final String CREAR_TABLA_COMPRAS = "CREATE TABLE "+
	COMPRAS+"("+
	COMPRAS_ID_COMPRA+" TEXT,"+
	COMPRAS_PROFORMA+" TEXT,"+
	COMPRAS_ID_PROD+" TEXT,"+
	COMPRAS_ID_PROV+" TEXT,"+
	COMPRAS_ID_USU+" TEXT,"+
	COMPRAS_CANTIDAD+" TEXT,"+
	COMPRAS_PRECIO+" TEXT,"+
	COMPRAS_FECHA+" TEXT,"+
	COMPRAS_SALDO+" TEXT,"+
	COMPRAS_FIREBASE+" TEXT)";

	//*** Tabla Kardex ***
	public static final String KARDEX = "kardex";
	public static final String KARDEX_FECHA = "fecha";
	public static final String KARDEX_PROFORMA = "proforma";
	public static final String KARDEX_DETALLE = "detalle";
	public static final String KARDEX_ENTRADA = "entrada";
	public static final String KARDEX_SALIDA = "salida";
	public static final String KARDEX_SALDO = "saldo";
	public static final String KARDEX_FIREBASE = "firebase";
	//public static final Integer N_KARD = 6;
	public static final String CREAR_TABLA_KARDEX = "CREATE TABLE "+
	KARDEX+"("+
	KARDEX_FECHA+" TEXT,"+
	KARDEX_PROFORMA+" TEXT,"+
	KARDEX_DETALLE+" TEXT,"+
	KARDEX_ENTRADA+" TEXT,"+
	KARDEX_SALIDA+" TEXT,"+
	KARDEX_SALDO+" TEXT,"+
	KARDEX_FIREBASE+" TEXT)";

	//*** Tabla Combos ***
	public static final String COMBOS = "combos";
	public static final String COMBOS_ID = "id";
	public static final String COMBOS_NOMBRE = "nombre";
	public static final String COMBOS_ID_PROD = "id_producto";
	public static final String COMBOS_PRECIO = "precio";
	public static final String COMBOS_FIREBASE = "firebase";
	public static final String COMBOS_ESTADO = "estado";
	//public static final Integer N_KARD = 6;
	public static final String CREAR_TABLA_COMBOS = "CREATE TABLE "+
	COMBOS+"("+
	COMBOS_ID+" TEXT,"+
	COMBOS_NOMBRE+" TEXT,"+
	COMBOS_ID_PROD+" TEXT,"+
	COMBOS_PRECIO+" TEXT,"+
	COMBOS_FIREBASE+" TEXT,"+
	COMBOS_ESTADO+" TEXT)";
	
	//*** Tabla Control id ***
	public static final String CONTROL = "control";
	public static final String CONTROL_ID= "id";
	public static final String CONTROL_USU= "usu";
	public static final String CONTROL_CLIE = "clie";
	public static final String CONTROL_PROV = "prov";
	public static final String CONTROL_PROD = "prod";
	public static final String CONTROL_COMB = "comb";
	public static final String CONTROL_FIREBASE = "firebase";
	//public static final Integer N_KARD = 6;
	public static final String CREAR_TABLA_CONTROL = "CREATE TABLE "+
	CONTROL+"("+
	CONTROL_ID+" TEXT,"+
	CONTROL_USU+" TEXT,"+
	CONTROL_CLIE+" TEXT,"+
	CONTROL_PROV+" TEXT,"+
	CONTROL_PROD+" TEXT,"+
	CONTROL_COMB+" TEXT,"+
	CONTROL_FIREBASE+" TEXT)";
	
}
