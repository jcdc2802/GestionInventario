package com.jcdc.gi;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.content.*;
import com.jcdc.gi.Metodos.*;
import android.view.View.*;
import android.view.*;
import com.jcdc.gi.GestionTablas.*;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
	Metodos metodo = new Metodos(MainActivity.this);
	Button btnProveedor;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btnProveedor = findViewById(R.id.btnProveedor);
		
		btnProveedor.setOnClickListener(this);
		
		metodo.msg("Hola Jc");
		
    }
	
	
	@Override
	public void onClick(View id)
	{
		// TODO: Implement this method
		
		try{
			
			Intent prov = new Intent(this,com.jcdc.gi.GestionTablas.Proveedores.class);
			startActivity(prov);
			
		}catch(Exception e){metodo.msg("error"+" "+e.toString());}
		
		
	}
	
	
}
