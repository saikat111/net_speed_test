package com.codingburg.checknetspeed;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith (AndroidJUnit4.class)
public class ExampleInstrumentedTest {
	@Test
	public void useAppContext () {
		Context appContext = InstrumentationRegistry.getInstrumentation ().getTargetContext ();
		assertEquals ("com.d3vdr0id.speedtest", appContext.getPackageName ());
	}
}
