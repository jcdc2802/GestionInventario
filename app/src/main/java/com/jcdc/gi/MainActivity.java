package com.jcdc.gi;

import android.os.*;
import android.support.v7.app.*;
import android.widget.*;
import android.content.*;
import com.jcdc.gi.Metodos.*;

public class MainActivity extends AppCompatActivity
{
	Metodos metodo = new Metodos(MainActivity.this);
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		metodo.msg("Hola Jc");
		
    }
	
	
	
	
}
