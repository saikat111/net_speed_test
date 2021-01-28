package com.codingburg.checknetspeed.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.codingburg.checknetspeed.R;
import com.github.anastr.speedviewlib.SpeedView;
import com.onesignal.OneSignal;

public class SplashActivity extends AppCompatActivity {
	private static final String ONESIGNAL_APP_ID = "b3927725-6cfb-45b6-ba04-84a8a1e5b65e";
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_splash);
		OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
		SpeedView speedometer = findViewById(R.id.iv_appicon);
		speedometer.speedTo(50, 2000);
		// OneSignal Initialization
		OneSignal.initWithContext(this);
		OneSignal.setAppId(ONESIGNAL_APP_ID);
		values();

	}

	private void values() {
		SharedPreferences sharedPref = getSharedPreferences (
				"setting", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPref.edit ();
		editor.putString ("UNIT", "Mbps");
		editor.apply ();
		Handler handler = new Handler ();
		handler.postDelayed (() -> {
			SplashActivity.this.startActivity (new Intent (SplashActivity.this, HomeActivity.class));
			finish ();
		}, 2000);
	}
}
