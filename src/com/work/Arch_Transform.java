package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Arch_Transform extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.arch_transform);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_arch_transform);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_arch_transform_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("stmt");

	        spec4.setContent(R.id.linear_arch_transform_stmt);
	        spec4.setIndicator("  Statement  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("spec");

	        spec8.setContent(R.id.linear_arch_transform_spec);
	        spec8.setIndicator("  Specification  ");

	        tabs.addTab(spec8);
	        
	        
	        
	        TabHost.TabSpec spec9= tabs.newTabSpec("criteria");

	        spec9.setContent(R.id.linear_arch_transform_criteria);
	        spec9.setIndicator("  Criteria  ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_arch_transform_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
