package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Civil_Floating extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.civil_floating);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_civil_floating);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_civil_floating_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("stmt");

	        spec4.setContent(R.id.linear_civil_floating_stmt);
	        spec4.setIndicator("  Statement  ");
	        
	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("specs");

	        spec2.setContent(R.id.linear_civil_floating_spec);
	        spec2.setIndicator("  Specifications  ");

	        tabs.addTab(spec2);
	        
	        TabHost.TabSpec spec5 = tabs.newTabSpec("criteria");

	        spec5.setContent(R.id.linear_civil_floating_criteria);
	        spec5.setIndicator("  Criteria  ");

	        tabs.addTab(spec5);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_civil_floating_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
