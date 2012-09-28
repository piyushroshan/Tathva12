package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_Astro extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_astro);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_astro);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_astro_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("highlights");

	        spec7.setContent(R.id.linear_workshop_astro_highlights);
	        spec7.setIndicator("  Highlights  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_workshop_astro_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
