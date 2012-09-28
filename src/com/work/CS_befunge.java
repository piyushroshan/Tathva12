package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class CS_befunge extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.cs_befunge);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_cs_befunge);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_cs_befunge_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec6 = tabs.newTabSpec("specs");

	        spec6.setContent(R.id.linear_cs_befunge_specs);
	        spec6.setIndicator("  Specifications  ");
	        
	        tabs.addTab(spec6);
	        
	        
	        TabHost.TabSpec spec7 = tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_cs_befunge_criteria);
	        spec7.setIndicator("  Criteria  ");
	        
	        tabs.addTab(spec7);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_cs_befunge_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
