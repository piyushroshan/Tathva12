package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class CS_tux extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.cs_tux);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_cs_tux);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_cs_tux_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("Rules");

	        spec4.setContent(R.id.linear_cs_tux_rules);
	        spec4.setIndicator("  Rules  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_cs_tux_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
