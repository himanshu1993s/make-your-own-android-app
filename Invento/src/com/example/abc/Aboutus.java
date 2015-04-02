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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Aboutus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        WebView w1=(WebView)findViewById(R.id.w1);
        Button b=(Button) findViewById(R.id.back);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i = new Intent(getApplicationContext(),MainActivity.class);
			startActivity(i);
			}
		});
        // Toast.makeText(getApplicationContext(), "", 1000).show();
         w1.loadUrl("file:///android_asset/about-us.html");
        

        
    }
}