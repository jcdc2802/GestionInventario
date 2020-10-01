package com.jcdc.gi.GestionTablas;
import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import com.jcdc.gi.*;

public class TablaProv extends AppCompatActivity implements OnItemSelectedListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabla_proveedores);
		
	}
	
	

	@Override
	public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4)
	{
		// TODO: Implement this method
	}

	@Override
	public void onNothingSelected(AdapterView<?> p1)
	{
		// TODO: Implement this method
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu_edicion, menu);

		MenuItem item = menu.findItem(R.id.itmEliminar);
		//if(strProd.equals("nuevo")){item.setVisible(false);}

        return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		//arrayRegistro.clear();
		Boolean flat = true;

		switch (item.getItemId()) 
		{
			case R.id.itmNuevo:

				/*

				 boolean datoNulo = false;

				 datosProv.clear();
				 datosProv.add("Prov"+numId());
				 datosProv.add(etEmpProv.getText().toString());
				 datosProv.add(etTelefProv.getText().toString());
				 datosProv.add(etPromProv.getText().toString());
				 datosProv.add(etCelProv.getText().toString());
				 datosProv.add(etMailProv.getText().toString());
				 datosProv.add("guardar");
				 datosProv.add(spnEstado.getSelectedItem().toString());

				 for(int i=0;i<datosProv.size();i++){

				 if(datosProv.get(i).equals("")){datoNulo = true;}
				 }

				 if(datoNulo){

				 metodo.msg("Algun dato es nulo");
				 }else{

				 try{

				 boolean vacia = metCrud.tablaVacia(Tablas.PROVEEDORES);

				 if(vacia){

				 metodo.msg("tabla con registros");
				 }else{

				 metodo.msg("tabla vacia");


				 ContentValues registro = new ContentValues();
				 registro.put(Tablas.PROVEEDORES_ID,datosProv.get(0));
				 registro.put(Tablas.PROVEEDORES_EMPRESA,datosProv.get(1));
				 registro.put(Tablas.PROVEEDORES_TELEFONO,datosProv.get(2));
				 registro.put(Tablas.PROVEEDORES_PROMOTOR,datosProv.get(3));
				 registro.put(Tablas.PROVEEDORES_CELULAR,datosProv.get(4));
				 registro.put(Tablas.PROVEEDORES_MAIL,datosProv.get(5));
				 registro.put(Tablas.PROVEEDORES_FIREBASE,datosProv.get(6));
				 registro.put(Tablas.PROVEEDORES_ESTADO,datosProv.get(7));

				 db = conectar.getWritableDatabase();
				 db.insert(Tablas.PROVEEDORES,null,registro);
				 db.close();

				 int n = numId()+1;
				 String s = String.valueOf(n);
				 String[] compa = {"id"};
				 registro.clear();
				 registro.put(Tablas.CONTROL_PROV,s);
				 db = conectar.getWritableDatabase();
				 db.update(Tablas.CONTROL,registro,Tablas.CONTROL_ID+"=?",compa);
				 db.close();

				 metodo.msg("datos guardados");

				 limpiar();
				 }


				 }catch(Exception e){metodo.msg("Tabla vacia "+e.toString());}

				 }

				 */

				break;
		}

		return super.onOptionsItemSelected(item);

	}
	
}
