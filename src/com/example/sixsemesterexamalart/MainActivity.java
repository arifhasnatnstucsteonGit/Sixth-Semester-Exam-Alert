package com.example.sixsemesterexamalart;

import java.util.Calendar;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
     
	TextView tv;
	Intent i,i2,i3,i4,i5;
	PendingIntent pi,pi2,pi3,pi4,pi5;
	AlarmManager manager;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	Button b,b2,b3,b4,b5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		tv=(TextView) findViewById(R.id.link);
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		cb2=(CheckBox) findViewById(R.id.checkBox2);
		cb3=(CheckBox) findViewById(R.id.checkBox3);
		cb4=(CheckBox) findViewById(R.id.checkBox4);
		cb5=(CheckBox) findViewById(R.id.checkBox5);
		b=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		b5=(Button) findViewById(R.id.button5);
		
		b.setVisibility(View.INVISIBLE);
		b2.setVisibility(View.INVISIBLE);
		b3.setVisibility(View.INVISIBLE);
		b4.setVisibility(View.INVISIBLE);
		b5.setVisibility(View.INVISIBLE);
		
		
		tv.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/arif.hasnat3"));
				startActivity(i);
				
			}});
		
		
		
		
		
		
		
		
		
		
		
		
		cb1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cb1.isChecked()){
					Context c=MainActivity.this;
					//...................jan...1
				  i=new Intent(getBaseContext(),alarm.class);
			      pi=PendingIntent.getBroadcast(getBaseContext(), 0, i,PendingIntent.FLAG_CANCEL_CURRENT);
			        Calendar cal=Calendar.getInstance();
			        cal.setTimeInMillis(System.currentTimeMillis());        //cal.getTimeInMillis();
			       // cal.set(2014,0,1, 6 ,00,00);
			        //cal.add(Calendar.SECOND,5);
			        
			        cal.set(Calendar.MONTH,0);
			        cal.set(Calendar.DAY_OF_MONTH,30);
			        cal.set(Calendar.HOUR_OF_DAY,7);
			        cal.set(Calendar.MINUTE,00);
			        cal.set(Calendar.SECOND, 00);
			        manager=(AlarmManager) c.getSystemService(ALARM_SERVICE);
			        manager.setRepeating(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),5*1000*60,pi);
			       
					b.setVisibility(View.VISIBLE);
					
				}
				
				
				
				
				
				
				
				
			}});
		cb2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cb2.isChecked()){
					Context c=MainActivity.this;
					//...................jan...1
				  i2=new Intent(getBaseContext(),alarm2.class);
			      pi2=PendingIntent.getBroadcast(getBaseContext(), 0, i2,PendingIntent.FLAG_CANCEL_CURRENT);
			        Calendar cal2=Calendar.getInstance();
			        cal2.setTimeInMillis(System.currentTimeMillis());        //cal.getTimeInMillis();
			       // cal.set(2014,0,1, 6 ,00,00);
			        //cal.add(Calendar.SECOND,5);
			        
			        cal2.set(Calendar.MONTH,1);
			        cal2.set(Calendar.DAY_OF_MONTH,2);
			        cal2.set(Calendar.HOUR_OF_DAY,7);
			        cal2.set(Calendar.MINUTE,00);
			        cal2.set(Calendar.SECOND, 00);
			        manager=(AlarmManager) c.getSystemService(ALARM_SERVICE);
			        manager.setRepeating(AlarmManager.RTC_WAKEUP,cal2.getTimeInMillis(),5*1000*60,pi2);
			       
					b2.setVisibility(View.VISIBLE);
					
				}
				
			}});
		cb3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cb3.isChecked()){
					Context c=MainActivity.this;
					//...................jan...1
				  i3=new Intent(getBaseContext(),alarm3.class);
			      pi3=PendingIntent.getBroadcast(getBaseContext(), 0, i3,PendingIntent.FLAG_CANCEL_CURRENT);
			        Calendar cal3=Calendar.getInstance();
			        cal3.setTimeInMillis(System.currentTimeMillis());        //cal.getTimeInMillis();
			       // cal.set(2014,0,1, 6 ,00,00);
			        //cal.add(Calendar.SECOND,5);
			        
			        cal3.set(Calendar.MONTH,1);
			        cal3.set(Calendar.DAY_OF_MONTH,6);
			        cal3.set(Calendar.HOUR_OF_DAY,12);
			        cal3.set(Calendar.MINUTE,30);
			        cal3.set(Calendar.SECOND, 00);
			        manager=(AlarmManager) c.getSystemService(ALARM_SERVICE);
			        manager.setRepeating(AlarmManager.RTC_WAKEUP,cal3.getTimeInMillis(),5*1000*60,pi3);
			       
					b3.setVisibility(View.VISIBLE);
					
				}
				
			}});
		cb4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cb4.isChecked()){
					Context c=MainActivity.this;
					//...................jan...1
				  i4=new Intent(getBaseContext(),alarm4.class);
			      pi4=PendingIntent.getBroadcast(getBaseContext(), 0, i4,PendingIntent.FLAG_CANCEL_CURRENT);
			        Calendar cal4=Calendar.getInstance();
			        cal4.setTimeInMillis(System.currentTimeMillis());        //cal.getTimeInMillis();
			       // cal.set(2014,0,1, 6 ,00,00);
			        //cal.add(Calendar.SECOND,5);
			        
			        cal4.set(Calendar.MONTH,1);
			        cal4.set(Calendar.DAY_OF_MONTH,16);
			        cal4.set(Calendar.HOUR_OF_DAY,7);
			        cal4.set(Calendar.MINUTE,00);
			        cal4.set(Calendar.SECOND, 00);
			        manager=(AlarmManager) c.getSystemService(ALARM_SERVICE);
			        manager.setRepeating(AlarmManager.RTC_WAKEUP,cal4.getTimeInMillis(),5*1000*60,pi4);
			       
					b4.setVisibility(View.VISIBLE);
					
				}
				
			}});
		cb5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(cb5.isChecked()){
					Context c=MainActivity.this;
					//...................jan...1
				  i5=new Intent(getBaseContext(),alarm5.class);
			      pi5=PendingIntent.getBroadcast(getBaseContext(), 0, i5,PendingIntent.FLAG_CANCEL_CURRENT);
			        Calendar cal5=Calendar.getInstance();
			        cal5.setTimeInMillis(System.currentTimeMillis());        //cal.getTimeInMillis();
			       // cal.set(2014,0,1, 6 ,00,00);
			        //cal.add(Calendar.SECOND,5);
			        
			        cal5.set(Calendar.MONTH,1);
			        cal5.set(Calendar.DAY_OF_MONTH,24);
			        cal5.set(Calendar.HOUR_OF_DAY,7);
			        cal5.set(Calendar.MINUTE,00);
			        cal5.set(Calendar.SECOND, 00);
			        manager=(AlarmManager) c.getSystemService(ALARM_SERVICE);
			        manager.setRepeating(AlarmManager.RTC_WAKEUP,cal5.getTimeInMillis(),5*1000*60,pi5);
			       
					b5.setVisibility(View.VISIBLE);
					
				}
				
			}});
		
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager.cancel(pi);
				Toast.makeText(getBaseContext(), "Alarm canceled!",Toast.LENGTH_LONG).show();
				
			}});
		
		b2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager.cancel(pi2);
				Toast.makeText(getBaseContext(), "Alarm canceled!",Toast.LENGTH_LONG).show();
			}});
		b3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager.cancel(pi3);
				Toast.makeText(getBaseContext(), "Alarm canceled!",Toast.LENGTH_LONG).show();
			}});
		b4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager.cancel(pi4);
				Toast.makeText(getBaseContext(), "Alarm canceled!",Toast.LENGTH_LONG).show();
			}});
		b5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				manager.cancel(pi5);
				Toast.makeText(getBaseContext(), "Alarm canceled!",Toast.LENGTH_LONG).show();
			}});
		
		
	}

	

}
