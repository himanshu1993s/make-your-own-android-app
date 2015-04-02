package com.example.abc;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Gravity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Ise_list extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_html);
        
        Button reg=(Button) findViewById(R.id.reg);
        Button back=(Button) findViewById(R.id.back );
        WebView sh=(WebView)findViewById(R.id.show_html);

		SharedPreferences con=getSharedPreferences("tab", 0);
		

		String c1=con.getString("c1", "");
		String c2=con.getString("c2", "");
     //   Toast.makeText(getApplicationContext(),"dahs"+ c1,1000).show();        //Button reg=(Button)findViewById(R.id.)
        sh.loadUrl("file:///android_asset/"+c1);
        reg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
				NotificationManager nm=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
				Notification notify=new Notification(android.R.drawable.dark_header, "You are registering !!", System.currentTimeMillis());
				Intent intent=new Intent(getApplicationContext(),MainActivity.class);
				PendingIntent pen=PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
				notify.setLatestEventInfo(getApplicationContext(), "Tech-Fest", "You are Registrating for the event of Invento", pen);
				//notify.sound=Uri.parse("android.resource://com.example.notification/"+R.);
				nm.notify(0, notify);
				Toast tst=Toast.makeText(getApplicationContext(), "Invento", 1000);
				tst.setGravity(Gravity.TOP, 0, 0);
				tst.show();
				Intent i1 = new Intent(getApplicationContext(),Reg.class);
				startActivity(i1);
			}
		} );
back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "hiiii", 1000).show();
				Intent i2 = new Intent(getApplicationContext(),Ise.class);
				startActivity(i2);
			}
		} );
    }

}
