package com.jcdc.gi.Metodos;
import android.content.*;
import android.support.v7.app.*;
import android.widget.*;

public class Metodos extends AppCompatActivity
{
	
	private static Context context;

	public Metodos(Context c)
	{
		context = c;
	}
	//*****************************************//

	public static void msg(String s)
	{
		Toast.makeText(context,s,Toast.LENGTH_SHORT).show();
	}
	
}
