package com.jcdc.gi.Tablas;

public class Tablas
{
	public static final int VERSION_DATABASE = 1;
	public static final String NOMBRE_DATABASE = "Sistema de gestion de inventario 2020.db";
	public static final Boolean VERSION_FREE = false;

	//*** Entidad Usuarios ***
	public static final String TABLA_USUARIOS = "usuarios";
	public static final String COL_ID_USU = "id_usu";
	public static final String COL_NOMBRE_USU = "nombre_usu";
	public static final String COL_PASSWORD_USU = "password";
	public static final String COL_NIVEL_USU = "nivel";
	public static final String COL_CONEXION_USU = "conexion";
	public static final String COL_ESTADO_USU = "estado_usu";
	public static final Integer N_USU = 5;

	public static final String CREAR_TABLA_USUARIOS = "CREATE TABLE "+
	TABLA_USUARIOS+"("+
	COL_ID_USU+" TEXT,"+
	COL_NOMBRE_USU+" TEXT,"+
	COL_PASSWORD_USU+" TEXT,"+
	COL_NIVEL_USU+" TEXT,"+
	COL_CONEXION_USU+" TEXT,"+
	COL_ESTADO_USU+" TEXT)";

	//*** Entidad Clientes ***
	public static final String TABLA_CLIENTES = "clientes";
	public static final String COL_ID_CLIE = "id_clie";
	public static final String COL_NOMBRE_CLIE = "nombre_clie";
	public static final String COL_NIT_CLIE = "nit_clie";
	public static final String COL_CELULAR_CLIE = "celular_clie";
	public static final String COL_MAIL_CLIE = "mail_clie";
	public static final String COL_ESTADO_CLIE = "estado_clie";
	public static final Integer N_CLIE = 5;

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
	public static final String COL_ID_PROV = "id_prov";
	public static final String COL_NOMBRE_PROV = "nombre_prov";
	public static final String COL_TELEFONO_PROV = "telefono_prov";
	public static final String COL_PROMOTOR_PROV = "promotor_prov";
	public static final String COL_CELULAR_PROV = "celular_prov";
	public static final String COL_MAIL_PROV = "mail_prov";
	public static final String COL_ESTADO_PROV = "estado_prov";
	public static final Integer N_PROV = 5;

	public static final String CREAR_TABLA_PROVEEDORES = "CREATE TABLE "+
	TABLA_PROVEEDORES+"("+
	COL_ID_PROV+" TEXT,"+
	COL_NOMBRE_PROV+" TEXT,"+
	COL_TELEFONO_PROV+" TEXT,"+
	COL_PROMOTOR_PROV+" TEXT,"+
	COL_CELULAR_PROV+" TEXT,"+
	COL_MAIL_PROV+" TEXT,"+
	COL_ESTADO_PROV+" TEXT"+")";

	//*** Entidad Productos ***
	public static final String TABLA_PRODUCTOS = "productos";
	public static final String COL_ID_PROD = "id_prod";
	public static final String COL_LINEA_PROD = "linea_prod";
	public static final String COL_PRODUCTO_PROD = "producto_prod";
	public static final String COL_COLOR_PROD = "color_prod";
	public static final String COL_MINIMO_PROD = "minimo_prod";
	public static final String COL_UNIDADES_PROD = "unidades_prod";
	public static final String COL_PRECIO_PROD = "precio_prod";
	public static final String COL_STOCK_PROD = "stock_prod";
	public static final String COL_UNIDADES_COMPRA_PROD = "unidades_compra_prod";
	public static final String COL_PRECIO_COMPRA_PROD = "precio_compra_prod";
	public static final String COL_ALARMA_PROD = "alarma_prod";
	public static final String COL_ID_PROV_PROD = "id_proveedor_prod";
	public static final String COL_ESTADO_PROD = "estado_prod";
	public static final String COL_ID_COMB_PROD = "id_comb_prod";
	public static final String COL_PRECIO_COMB = "precio_comb";
	public static final Integer N_PROD = 5;

	public static final String CREAR_TABLA_PRODUCTOS = "CREATE TABLE "+
	TABLA_PRODUCTOS+"("+
	COL_ID_PROD+" TEXT,"+
	COL_LINEA_PROD+" TEXT,"+
	COL_PRODUCTO_PROD+" TEXT,"+
	COL_COLOR_PROD+" TEXT,"+
	COL_MINIMO_PROD+" TEXT,"+
	COL_UNIDADES_PROD+" TEXT,"+
	COL_PRECIO_PROD+" TEXT,"+
	COL_STOCK_PROD+" TEXT,"+
	COL_UNIDADES_COMPRA_PROD+" TEXT,"+
	COL_PRECIO_COMPRA_PROD+" TEXT,"+
	COL_ALARMA_PROD+" TEXT,"+
	COL_ID_PROV_PROD+" TEXT,"+
	COL_ESTADO_PROD+" TEXT,"+
	COL_ID_COMB_PROD+" TEXT,"+
	COL_PRECIO_COMB+" TEXT"+")";

	//*** Entidad Transitoria ***
	public static final String TABLA_TRANSITORIA = "transitoria";
	public static final String COL_PROFORMA_TRANS = "proforma_trans";
	public static final String COL_ID_PROD_TRANS = "id_producto_trans";
	public static final String COL_ID_CLIE_TRANS = "id_cliente_trans";
	public static final String COL_ID_USU_TRANS = "id_usuario_trans";
	public static final String COL_CANTIDAD_TRANS = "cantidad_trans";
	public static final String COL_PRECIO_TRANS = "precio_trans";
	public static final String COL_FECHA_TRANS = "fecha_trans";
	public static final String COL_SALDO_TRANS = "saldo_trans";
	public static final Integer N_TRANS = 5;

	public static final String CREAR_TABLA_TRANSITORIA = "CREATE TABLE "+
	TABLA_TRANSITORIA+"("+
	COL_PROFORMA_TRANS+" TEXT,"+
	COL_ID_PROD_TRANS+" TEXT,"+
	COL_ID_CLIE_TRANS+" TEXT,"+
	COL_ID_USU_TRANS+" TEXT,"+
	COL_CANTIDAD_TRANS+" TEXT,"+
	COL_PRECIO_TRANS+" TEXT,"+
	COL_FECHA_TRANS+" TEXT,"+
	COL_SALDO_TRANS+" TEXT)";

	//*** Entidad ventas ***
	public static final String TABLA_VENTAS = "ventas";
	public static final String COL_PROFORMA_VENT = "proforma_vent";
	public static final String COL_ID_PROD_VENT = "id_producto_vent";
	public static final String COL_ID_CLIE_VENT = "id_cliente_vent";
	public static final String COL_ID_USU_VENT = "id_usuario_vent";
	public static final String COL_CANTIDAD_VENT = "cantidad_vent";
	public static final String COL_PRECIO_VENT = "precio_vent";
	public static final String COL_FECHA_VENT = "fecha_vent";
	public static final String COL_SALDO_VENT = "saldo_vent";
	public static final String COL_FECHA_NEW_VENT = "fecha_new_vent";
	public static final Integer N_VENT = 5;

	public static final String CREAR_TABLA_VENTAS = "CREATE TABLE "+
	TABLA_VENTAS+"("+
	COL_PROFORMA_VENT+" TEXT,"+
	COL_ID_PROD_VENT+" TEXT,"+
	COL_ID_CLIE_VENT+" TEXT,"+
	COL_ID_USU_VENT+" TEXT,"+
	COL_CANTIDAD_VENT+" TEXT,"+
	COL_PRECIO_VENT+" TEXT,"+
	COL_FECHA_VENT+" TEXT,"+
	COL_SALDO_VENT+" TEXT,"+
	COL_FECHA_NEW_VENT+" TEXT)";

	//*** Entidad compras ***
	public static final String TABLA_COMPRAS = "compras";
	public static final String COL_PROFORMA_COMP = "proforma_comp";
	public static final String COL_ID_PROD_COMP = "id_producto_comp";
	public static final String COL_ID_PROV_COMP = "id_proveedor_comp";
	public static final String COL_ID_USU_COMP = "id_usuario_comp";
	public static final String COL_CANTIDAD_COMP = "cantidad_comp";
	public static final String COL_PRECIO_COMP = "precio_comp";
	public static final String COL_FECHA_COMP = "fecha_comp";
	public static final String COL_SALDO_COMP = "saldo_comp";
	public static final String COL_FECHA_NEW_COMP = "fecha_new_comp";
	public static final Integer N_COMP = 5;

	public static final String CREAR_TABLA_COMPRAS = "CREATE TABLE "+
	TABLA_COMPRAS+"("+
	COL_PROFORMA_COMP+" TEXT,"+
	COL_ID_PROD_COMP+" TEXT,"+
	COL_ID_PROV_COMP+" TEXT,"+
	COL_ID_USU_COMP+" TEXT,"+
	COL_CANTIDAD_COMP+" TEXT,"+
	COL_PRECIO_COMP+" TEXT,"+
	COL_FECHA_COMP+" TEXT,"+
	COL_SALDO_COMP+" TEXT,"+
	COL_FECHA_NEW_COMP+" TEXT)";

	//*** Tabla Kardex ***
	public static final String TABLA_KARDEX = "kardex";
	public static final String COL_FECHA_KARD = "fecha_kard";
	public static final String COL_PROFORMA_KARD = "proforma_kard";
	public static final String COL_DETALLE_KARD = "detalle_kard";
	public static final String COL_ENTRADA_KARD = "entrada_kard";
	public static final String COL_SALIDA_KARD = "salida_kard";
	public static final String COL_SALDO_KARD = "saldo_kard";
	public static final Integer N_KARD = 6;

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
	public static final String COL_ID_COMB = "id_comb";
	public static final String COL_NOMBRE_COMB = "nombre_comb";
	public static final String COL_PRECIO_COMBO = "precio_combo";
	public static final String COL_SALDO_COMBO = "saldo_combo";
	public static final Integer N_COMB = 4;

	public static final String CREAR_TABLA_COMBOS = "CREATE TABLE "+
	TABLA_COMBOS+"("+
	COL_ID_COMB+" TEXT,"+
	COL_NOMBRE_COMB+" TEXT,"+
	COL_PRECIO_COMBO+" TEXT,"+
	COL_SALDO_COMBO+" TEXT)";
}
