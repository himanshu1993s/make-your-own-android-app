package com.example.abc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class Mech extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mech);
        
        

    Button b1=(Button)findViewById(R.id.mech1);
    Button b2=(Button)findViewById(R.id.mech2);
    Button b3=(Button)findViewById(R.id.mech3);
    Button b4=(Button)findViewById(R.id.mech4);
    Button b5=(Button)findViewById(R.id.mech5);
    Button b6=(Button)findViewById(R.id.mech6);
    Button bb=(Button)findViewById(R.id.bb);
    
    bb.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    			Intent i=new Intent(getApplicationContext(),MainActivity.class);
    			startActivity(i);
    			
    		}
    	});
    b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SharedPreferences con=getSharedPreferences("tab", 0);
			Editor ed=con.edit();
			
			ed.putString("c1", "mech/mit.html");
			ed.commit();
			//ed.putString("c2", con2.getText().toString()+"");
		//	Toast.makeText(getApplicationContext(), "Amrit", 1000).show();
			Intent i=new Intent(getApplicationContext(),Ise_list.class);
			startActivity(i);
			
		}
	});
 b2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SharedPreferences con=getSharedPreferences("tab", 0);
			Editor ed=con.edit();
			
			ed.putString("c1", "mech/yda.html");
			ed.commit();
			//ed.putString("c2", con2.getText().toString()+"");
			//Toast.makeText(getApplicationContext(), "Amrit", 1000).show();
			Intent i=new Intent(getApplicationContext(),Ise_list.class);
			startActivity(i);
			
		}
	});
 
 b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SharedPreferences con=getSharedPreferences("tab", 0);
			Editor ed=con.edit();
			
			ed.putString("c1", "mech/apk.html");
			ed.commit();
			//ed.putString("c2", con2.getText().toString()+"");
			//Toast.makeText(getApplicationContext(), "Amrit", 1000).show();
			Intent i=new Intent(getApplicationContext(),Ise_list.class);
			startActivity(i);
			
		}
	});
 
 b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SharedPreferences con=getSharedPreferences("tab", 0);
			Editor ed=con.edit();
			
			ed.putString("c1", "mech/bsh.html");
			ed.commit();
			//ed.putString("c2", con2.getText().toString()+"");
			//Toast.makeText(getApplicationContext(), "Amrit", 1000).show();
			Intent i=new Intent(getApplicationContext(),Ise_list.class);
			startActivity(i);
			
		}
	});
 b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SharedPreferences con=getSharedPreferences("tab", 0);
			Editor ed=con.edit();
			
			ed.putString("c1", "mech/hor.html");
			ed.commit();
			//ed.putString("c2", con2.getText().toString()+"");
			//Toast.makeText(getApplicationContext(), "Amrit", 1000).show();
			Intent i=new Intent(getApplicationContext(),Ise_list.class);
			startActivity(i);
			
		}
	});
 
 b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			SharedPreferences con=getSharedPreferences("tab", 0);
			Editor ed=con.edit();
			
			ed.putString("c1", "mech/mof.html");
			ed.commit();
			//ed.putString("c2", con2.getText().toString()+"");
			//Toast.makeText(getApplicationContext(), "Amrit", 1000).show();
			Intent i=new Intent(getApplicationContext(),Ise_list.class);
			startActivity(i);
			
		}
	});

   
}
}