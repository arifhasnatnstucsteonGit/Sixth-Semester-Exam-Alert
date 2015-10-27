package com.example.sixsemesterexamalart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class alarm2 extends BroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		MediaPlayer mp=MediaPlayer.create(arg0, R.raw.bismillah);
		mp.start();
		Toast.makeText(arg0, "Your Wireless Communication  Examination is going on !! Please get Ready ",Toast.LENGTH_LONG).show();
		
		

		
		
		
		
		
	}

}
