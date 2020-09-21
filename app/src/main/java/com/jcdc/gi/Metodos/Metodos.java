package com.jcdc.gi.Metodos;
import android.content.*;
import android.widget.*;

public class Metodos
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
