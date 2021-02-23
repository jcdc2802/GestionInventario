package com.jcdc.gi.GestionTablas;
import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import android.graphics.*;
import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.view.ViewGroup.*;
import android.widget.*;
import android.widget.AdapterView.*;
import com.jcdc.gi.*;
import com.jcdc.gi.ConexionSqlite.*;
import com.jcdc.gi.Metodos.*;
import com.jcdc.gi.Tablas.*;

import android.view.ViewGroup.LayoutParams;

public class TablaProv extends AppCompatActivity implements OnItemSelectedListener
{
	ConexionSqlite conectar = new ConexionSqlite(this);
	SQLiteDatabase db;
	Cursor c;
	
	TableLayout tlListaProveedores;
	TableRow trFilasProveedores;
	TableRow lineaSep;
	TextView tvIdProv,tvEmpProv,tvPromProv,tvCelProv;
	
	Metodos metodo = new Metodos(this);
	CRUD metCrud = new CRUD(this);
	boolean tablaOk;
	
	//private TemplatePDF templatePDF;
	//private String[]header = new String[4];
	//ArrayList<String[]>rows;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabla_proveedores);
		
		
		
		tlListaProveedores = findViewById(R.id.tlListaProveedores);
		
		tablaOk = metCrud.tablaVacia(Tablas.PROVEEDORES);
		
		if(tablaOk){
			//metodo.msg("tabla con registros");
			
			
			 try{
				 String[] obtener = {
				 Tablas.PROVEEDORES_ID,
				 Tablas.PROVEEDORES_EMPRESA,
				 Tablas.PROVEEDORES_PROMOTOR,
				 Tablas.PROVEEDORES_CELULAR
				  };
				  db = conectar.getReadableDatabase();
				  c = db.query(Tablas.PROVEEDORES,obtener,null,null,null,null,null);
				  if(c.moveToFirst())
				  {
				  	do
				  	{
					  trFilasProveedores = new TableRow(this);
					   trFilasProveedores.addView(tvFormato(tvIdProv,c.getString(0)));
					   trFilasProveedores.addView(tvFormato(tvEmpProv,c.getString(1)));
					   trFilasProveedores.addView(tvFormato(tvPromProv,c.getString(2)));
					   trFilasProveedores.addView(tvFormato(tvCelProv,c.getString(3)));
					   tlListaProveedores.addView(trFilasProveedores);
					   tlListaProveedores.addView(lineaDiv(lineaSep));

					//rows.add(new String[]{c.getString(0),c.getString(1),c.getString(2),c.getString(3)});

					} while(c.moveToNext());
				}
				c.close();
				db.close();

				}

				catch(Exception e)
				{
					Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
				}
			
			
			
		}else{
			metodo.msg("tabla vacia");
		}

		
		
		
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
			case R.id.itmGuardar:
				
				try{

					Intent prov = new Intent(this,com.jcdc.gi.GestionTablas.Proveedores.class);
					prov.putExtra("strIdProv","Nuevo");
					startActivity(prov);

				}catch(Exception e){metodo.msg("error"+" "+e.toString());}

				

				break;
				
			case R.id.itmEliminar:
				
				showdialogoBuscar();
				
				break;
				
			case R.id.itmVolver:
				
				try{

					Intent inicio = new Intent(this,MainActivity.class);
					startActivity(inicio);

				}catch(Exception e){metodo.msg("error"+" "+e.toString());}

				break;
				
		}

		return super.onOptionsItemSelected(item);

	}
	
	
	public TextView tvFormato(TextView tv, String str)
	{
		tv = new TextView(this);

		tv.setLayoutParams(new TableRow.LayoutParams(
							   LayoutParams.WRAP_CONTENT,
							   LayoutParams.WRAP_CONTENT));
		tv.setGravity(Gravity.CENTER);
		tv.setTextColor(Color.BLACK);
		tv.setText(str);

		return tv;
	}

	public TableRow lineaDiv(TableRow tr)
	{
		tr = new TableRow(this);

        tr.setLayoutParams(new TableLayout.LayoutParams(
							   LayoutParams.FILL_PARENT, 
							   LayoutParams.WRAP_CONTENT));
        FrameLayout linea_divisoria = new FrameLayout(this);
        TableRow.LayoutParams linea_divisoria_params =
			new TableRow.LayoutParams(LayoutParams.FILL_PARENT, 2);
        linea_divisoria_params.span = 4;//n columnas
        linea_divisoria.setBackgroundColor(Color.parseColor("#000000"));
        tr.addView(linea_divisoria, linea_divisoria_params);

		return tr;
	}
	
	private void showdialogoBuscar(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

		View vista = this.getLayoutInflater().inflate(R.layout.layout_buscar,null);
		final EditText etIdBuscar = vista.findViewById(R.id.etIdBuscar);
		TextView tvIdBuscar = vista.findViewById(R.id.tvIdBuscar);
		tvIdBuscar.setText("Prov");

		builder.setView(vista)

			.setPositiveButton("Buscar", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {

					String strIdProv = "Prov"+etIdBuscar.getText().toString();
					//buscarProv(strIdProv);
					verificarId(strIdProv);

				}
			})

			.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();

					//volver();
				}
			})

			.show();
    }
	//************************************************************/
	
	public boolean idOk(String s)
	{
		boolean verifOk = false;
		
		try{
			//tvIdProv.setText(s);

			String[] comparar = {s};
			
			String[] obtener = {
				Tablas.PROVEEDORES_EMPRESA
				
			};
			
			db = conectar.getReadableDatabase();
			c = db.query(Tablas.PROVEEDORES,obtener,Tablas.PROVEEDORES_ID+"=?",comparar,null,null,null);
			if(c.moveToFirst())
			{
				verifOk = true;

			}
			c.close();
			db.close();
		}

		catch(Exception e)
		{
			Toast.makeText(this,"aki "+e.toString(),Toast.LENGTH_LONG).show();
		}
		
		return verifOk;
	}
	//************************************************************/
	
	public void verificarId(String id)
	{
		if(idOk(id)){
			
			
			 try{

			 Intent prov = new Intent(this,com.jcdc.gi.GestionTablas.Proveedores.class);
			 prov.putExtra("strIdProv",id);
			 startActivity(prov);

			 }catch(Exception e){metodo.msg("error"+" "+e.toString());}
			 
			
		}else
		{
			metodo.msg("No existe ese Id");
			//volver();
		}
		
		
	}
	
	
	
}
