package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_Cloud_Computing extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_cloud_computing);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_cloud_computing);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_cloud_computing_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("benefits");

	        spec7.setContent(R.id.linear_workshop_cloud_computing_benefits);
	        spec7.setIndicator("  Benefits  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("curriculum");

	        spec8.setContent(R.id.linear_workshop_cloud_computing_curriculum);
	        spec8.setIndicator("  Curriculum  ");

	        tabs.addTab(spec8);
	        
	        TabHost.TabSpec spec9= tabs.newTabSpec("details");

	        spec9.setContent(R.id.linear_workshop_cloud_computing_details);
	        spec9.setIndicator("  Details  ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_workshop_cloud_computing_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
