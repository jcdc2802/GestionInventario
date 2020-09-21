package com.jcdc.gi.Tablas;

public class Tablas
{
	public static final int VERSION_DATABASE = 1;
	public static final String NOMBRE_DATABASE = "Gestion de Inventario 2021.db";
	public static final Boolean VERSION_FREE = true;

	//*** Entidad Usuarios ***
	public static final String TABLA_USUARIOS = "usuarios";
	public static final String COL_ID_USU = "id";
	public static final String COL_NOMBRE_USU = "nombre";
	public static final String COL_CLAVE_USU = "clave";
	public static final String COL_CELULAR_USU = "celular";
	public static final String COL_MAIL_USU = "mail";
	public static final String COL_CATEGORIA_USU = "categoria";
	public static final String COL_CONEXION_USU = "conexion";
	public static final String COL_ESTADO_USU = "estado";
	//public static final Integer N_USU = 5;

	public static final String CREAR_TABLA_USUARIOS = "CREATE TABLE "+
	TABLA_USUARIOS+"("+
	COL_ID_USU+" TEXT,"+
	COL_NOMBRE_USU+" TEXT,"+
	COL_CLAVE_USU+" TEXT,"+
	COL_CELULAR_USU+" TEXT,"+
	COL_MAIL_USU+" TEXT,"+
	COL_CATEGORIA_USU+" TEXT,"+
	COL_CONEXION_USU+" TEXT,"+
	COL_ESTADO_USU+" TEXT)";

	//*** Entidad Clientes ***
	public static final String TABLA_CLIENTES = "clientes";
	public static final String COL_ID_CLIE = "id";
	public static final String COL_NOMBRE_CLIE = "nombre";
	public static final String COL_NIT_CLIE = "nit";
	public static final String COL_CELULAR_CLIE = "celular";
	public static final String COL_MAIL_CLIE = "mail";
	public static final String COL_ESTADO_CLIE = "estado";
	//public static final Integer N_CLIE = 5;

	public static final String CREAR_TABLA_CLIENTES = "CREATE TABLE "+
	TABLA_CLIENTES+"("+
	COL_ID_CLIE+" TEXT,"+
	COL_NOMBRE_CLIE+" TEXT,"+
	COL_NIT_CLIE+" TEXT,"+
	COL_CELULAR_CLIE+" TEXT,"+
	COL_MAIL_CLIE+" TEXT,"+
	COL_ESTADO_CLIE+" TEXT"+")";

	//*** Entidad Proveedores ***
	public static final String TABLA_PROVEEDORES = "proveedores";
	public static final String COL_ID_PROV = "id";
	public static final String COL_EMPRESA_PROV = "empresa";
	public static final String COL_TELEFONO_PROV = "telefono";
	public static final String COL_PROMOTOR_PROV = "promotor";
	public static final String COL_CELULAR_PROV = "celular";
	public static final String COL_MAIL_PROV = "mail";
	public static final String COL_ESTADO_PROV = "estado";
	//public static final Integer N_PROV = 5;

	public static final String CREAR_TABLA_PROVEEDORES = "CREATE TABLE "+
	TABLA_PROVEEDORES+"("+
	COL_ID_PROV+" TEXT,"+
	COL_EMPRESA_PROV+" TEXT,"+
	COL_TELEFONO_PROV+" TEXT,"+
	COL_PROMOTOR_PROV+" TEXT,"+
	COL_CELULAR_PROV+" TEXT,"+
	COL_MAIL_PROV+" TEXT,"+
	COL_ESTADO_PROV+" TEXT"+")";

	//*** Entidad Productos ***
	public static final String TABLA_PRODUCTOS = "productos";
	public static final String COL_ID_PROD = "id";
	public static final String COL_LINEA_PROD = "linea";
	public static final String COL_NOMBRE_PROD = "nombre";
	public static final String COL_CUALIDAD_PROD = "cualidad";
	public static final String COL_UNIDAD_V_PROD = "unidad_v";
	public static final String COL_PRECIO_V_PROD = "precio_v";
	public static final String COL_UNIDAD_C_PROD = "unidad_c";
	public static final String COL_PRECIO_C_PROD = "precio_c";
	public static final String COL_STOCK_PROD = "stock";
	public static final String COL_MINIMO_PROD = "minimo";
	public static final String COL_ID_PROVEEDOR_PROD = "id_proveedor";
	public static final String COL_ID_COMBO_PROD = "id_combo";
	public static final String COL_PRECIO_COMBO_PROD = "precio_combo";
	public static final String COL_ESTADO_PROD = "estado";
	//public static final Integer N_PROD = 5;

	public static final String CREAR_TABLA_PRODUCTOS = "CREATE TABLE "+
	TABLA_PRODUCTOS+"("+
	COL_ID_PROD+" TEXT,"+
	COL_LINEA_PROD+" TEXT,"+
	COL_NOMBRE_PROD+" TEXT,"+
	COL_CUALIDAD_PROD+" TEXT,"+
	COL_UNIDAD_V_PROD+" TEXT,"+
	COL_PRECIO_V_PROD+" TEXT,"+
	COL_UNIDAD_C_PROD+" TEXT,"+
	COL_PRECIO_C_PROD+" TEXT,"+
	COL_STOCK_PROD+" TEXT,"+
	COL_MINIMO_PROD+" TEXT,"+
	COL_ID_PROVEEDOR_PROD+" TEXT,"+
	COL_ID_COMBO_PROD+" TEXT,"+
	COL_PRECIO_COMBO_PROD+" TEXT,"+
	COL_ESTADO_PROD+" TEXT"+")";

	//*** Entidad Transitoria ***
	public static final String TABLA_TRANSITORIA = "transitoria";
	public static final String COL_PROFORMA_TRANS = "proforma";
	public static final String COL_ID_PROD_TRANS = "id_producto";
	public static final String COL_ID_CLIE_PROV_TRANS = "id_clie_prov";
	public static final String COL_ID_USU_TRANS = "id_usuario";
	public static final String COL_CANTIDAD_TRANS = "cantidad";
	public static final String COL_PRECIO_TRANS = "precio";
	public static final String COL_FECHA_TRANS = "fecha";
	public static final String COL_SALDO_TRANS = "saldo";
	//public static final Integer N_TRANS = 5;
	public static final String CREAR_TABLA_TRANSITORIA = "CREATE TABLE "+
	TABLA_TRANSITORIA+"("+
	COL_PROFORMA_TRANS+" TEXT,"+
	COL_ID_PROD_TRANS+" TEXT,"+
	COL_ID_CLIE_PROV_TRANS+" TEXT,"+
	COL_ID_USU_TRANS+" TEXT,"+
	COL_CANTIDAD_TRANS+" TEXT,"+
	COL_PRECIO_TRANS+" TEXT,"+
	COL_FECHA_TRANS+" TEXT,"+
	COL_SALDO_TRANS+" TEXT)";

	//*** Entidad ventas ***
	public static final String TABLA_VENTAS = "ventas";
	public static final String COL_PROFORMA_VENT = "proforma";
	public static final String COL_ID_PROD_VENT = "id_producto";
	public static final String COL_ID_CLIE_VENT = "id_cliente";
	public static final String COL_ID_USU_VENT = "id_usuario";
	public static final String COL_CANTIDAD_VENT = "cantidad";
	public static final String COL_PRECIO_VENT = "precio";
	public static final String COL_FECHA_VENT = "fecha";
	public static final String COL_SALDO_VENT = "saldo";
	
	//public static final Integer N_VENT = 5;

	public static final String CREAR_TABLA_VENTAS = "CREATE TABLE "+
	TABLA_VENTAS+"("+
	COL_PROFORMA_VENT+" TEXT,"+
	COL_ID_PROD_VENT+" TEXT,"+
	COL_ID_CLIE_VENT+" TEXT,"+
	COL_ID_USU_VENT+" TEXT,"+
	COL_CANTIDAD_VENT+" TEXT,"+
	COL_PRECIO_VENT+" TEXT,"+
	COL_FECHA_VENT+" TEXT,"+
	COL_SALDO_VENT+" TEXT)";

	//*** Entidad compras ***
	public static final String TABLA_COMPRAS = "compras";
	public static final String COL_PROFORMA_COMP = "proforma";
	public static final String COL_ID_PROD_COMP = "id_producto";
	public static final String COL_ID_PROV_COMP = "id_proveedor";
	public static final String COL_ID_USU_COMP = "id_usuario";
	public static final String COL_CANTIDAD_COMP = "cantidad";
	public static final String COL_PRECIO_COMP = "precio";
	public static final String COL_FECHA_COMP = "fecha";
	public static final String COL_SALDO_COMP = "saldo";
	//public static final String COL_FECHA_NEW_COMP = "fecha_new_comp";
	//public static final Integer N_COMP = 5;

	public static final String CREAR_TABLA_COMPRAS = "CREATE TABLE "+
	TABLA_COMPRAS+"("+
	COL_PROFORMA_COMP+" TEXT,"+
	COL_ID_PROD_COMP+" TEXT,"+
	COL_ID_PROV_COMP+" TEXT,"+
	COL_ID_USU_COMP+" TEXT,"+
	COL_CANTIDAD_COMP+" TEXT,"+
	COL_PRECIO_COMP+" TEXT,"+
	COL_FECHA_COMP+" TEXT,"+
	COL_SALDO_COMP+" TEXT)";

	//*** Tabla Kardex ***
	public static final String TABLA_KARDEX = "kardex";
	public static final String COL_FECHA_KARD = "fecha";
	public static final String COL_PROFORMA_KARD = "proforma";
	public static final String COL_DETALLE_KARD = "detalle";
	public static final String COL_ENTRADA_KARD = "entrada";
	public static final String COL_SALIDA_KARD = "salida";
	public static final String COL_SALDO_KARD = "saldo";
	//public static final Integer N_KARD = 6;
	public static final String CREAR_TABLA_KARDEX = "CREATE TABLE "+
	TABLA_KARDEX+"("+
	COL_FECHA_KARD+" TEXT,"+
	COL_PROFORMA_KARD+" TEXT,"+
	COL_DETALLE_KARD+" TEXT,"+
	COL_ENTRADA_KARD+" TEXT,"+
	COL_SALIDA_KARD+" TEXT,"+
	COL_SALDO_KARD+" TEXT)";

	//*** Tabla Kardex ***
	public static final String TABLA_COMBOS = "combos";
	public static final String COL_ID_COMB = "id";
	public static final String COL_NOMBRE_COMB = "nombre";
	public static final String COL_ID_PROD_COMB = "id_producto";
	public static final String COL_PRECIO_COMB = "precio";
	public static final String COL_ESTADO_COMB = "estado";
	//public static final Integer N_KARD = 6;
	public static final String CREAR_TABLA_COMBOS = "CREATE TABLE "+
	TABLA_COMBOS+"("+
	COL_ID_COMB+" TEXT,"+
	COL_NOMBRE_COMB+" TEXT,"+
	COL_ID_PROD_COMB+" TEXT,"+
	COL_PRECIO_COMB+" TEXT,"+
	COL_ESTADO_COMB+" TEXT)";
	
}
