package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Blitz_Dota extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.blitz_dota);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_blitz_dota);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_blitz_dota_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_blitz_dota_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("settings");

	        spec7.setContent(R.id.linear_blitz_dota_settings);
	        spec7.setIndicator("  Settings  ");

	        tabs.addTab(spec7);
	        
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("rules");

	        spec8.setContent(R.id.linear_blitz_dota_rules);
	        spec8.setIndicator("  Rules  ");

	        tabs.addTab(spec8);
	        
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_blitz_dota_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
