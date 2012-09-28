package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Manage_Tycoon extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.manage_tycoon);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_manage_tycoon);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_manage_tycoon_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("criteria");

	        spec4.setContent(R.id.linear_manage_tycoon_criteria);
	        spec4.setIndicator("  Criteria  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("spec");

	        spec8.setContent(R.id.linear_manage_tycoon_spec);
	        spec8.setIndicator("  Specification  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_manage_tycoon_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
