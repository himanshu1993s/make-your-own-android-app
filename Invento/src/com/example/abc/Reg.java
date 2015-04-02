package com.example.abc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Reg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        WebView w1=(WebView)findViewById(R.id.webView1);
        
       // Toast.makeText(getApplicationContext(), "", 1000).show();
        w1.loadUrl("http://twinbuzz.in/registration/Phone.html");
       
    }

    
}
