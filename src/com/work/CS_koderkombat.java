package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class CS_koderkombat extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.cs_koderkombat);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_cs_koderkombat);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_cs_koderkombat_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("Rounds");

	        spec4.setContent(R.id.linear_cs_koderkombat_rounds);
	        spec4.setIndicator("  Rounds  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec6= tabs.newTabSpec("specifications");

	        spec6.setContent(R.id.linear_cs_koderkombat_specs);
	        spec6.setIndicator("  Specifications  ");

	        tabs.addTab(spec6);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_cs_koderkombat_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
