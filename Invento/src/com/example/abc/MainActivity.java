package com.example.abc;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button i1=(Button) findViewById(R.id.i1);
        Button c1=(Button) findViewById(R.id.c1);
        Button e1=(Button) findViewById(R.id.e1);
        Button a1=(Button) findViewById(R.id.a1);
        Button m1=(Button) findViewById(R.id.m1);
        Button ci1=(Button) findViewById(R.id.ci1);
        Button au=(Button) findViewById(R.id.au);
        Button in=(Button) findViewById(R.id.in);
        Button exit=(Button) findViewById(R.id.exit);
        //Button reg=(Button)findViewById(R.id.)
        exit.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				
				final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
				alert.setMessage("Are you sure want to exit?");
				alert.setCancelable(false);
				
				alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface arg0, int arg1) 
					{
						Toast.makeText(getApplicationContext(), "Exited", 1000).show();
						MainActivity.this.finish();
						//System.exit(0);
					}
				});
				
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface arg0, int arg1) 
					{
						arg0.cancel();
						
					}
				});
                
				AlertDialog alertbox=alert.create();
				alertbox.show();
			}
		});
        i1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
				Intent i = new Intent(getApplicationContext(),Ise.class);
				startActivity(i);
			}
		} );
        
        au.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent iau=new Intent(getApplicationContext(),Aboutus.class);
				startActivity(iau);
			}
		});
        
 in.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent iau=new Intent(getApplicationContext(),abtinv.class);
				startActivity(iau);
			}
		});
c1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
				Intent i = new Intent(getApplicationContext(),Cse.class);
				startActivity(i);
			}
		} );
ci1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
		Intent i = new Intent(getApplicationContext(),Civil.class);
		startActivity(i);
	}
} );
a1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
		Intent i = new Intent(getApplicationContext(),Auto.class);
		startActivity(i);
	}
} );
e1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
		Intent i = new Intent(getApplicationContext(),Enc.class);
		startActivity(i);
	}
} );
m1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
		Intent i = new Intent(getApplicationContext(),Mech.class);
		startActivity(i);
	}
} );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
