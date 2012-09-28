package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Highlights_YI extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.highlight_envision_yi);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_highlight_envision_yi);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_highlight_envision_yi_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("specs");

	        spec8.setContent(R.id.linear_highlight_envision_yi_spec);
	        spec8.setIndicator("  Specifications  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("stmt");

	        spec9.setContent(R.id.linear_highlight_envision_yi_stmt);
	        spec9.setIndicator("  Statements  ");

	        tabs.addTab(spec9);
	        
	        
	        
	        TabHost.TabSpec spec6 = tabs.newTabSpec("benefits");

	        spec6.setContent(R.id.linear_highlight_envision_yi_benefits);
	        spec6.setIndicator("  Benefits  ");

	        tabs.addTab(spec6);
	        
	        
	        TabHost.TabSpec spec7 = tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_highlight_envision_yi_criteria);
	        spec7.setIndicator("  Criteria  ");

	        tabs.addTab(spec7);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_highlight_envision_yi_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
