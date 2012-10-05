package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_Autonova extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_autonova);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_autonova);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_autonova_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("highlights");

	        spec7.setContent(R.id.linear_workshop_autonova_highlights);
	        spec7.setIndicator("  Highlights  ");

	        tabs.addTab(spec7);
	        
	        
	        
	        
	        TabHost.TabSpec spec9= tabs.newTabSpec("curriculam");

	        spec9.setContent(R.id.linear_workshop_autonova_curriculam);
	        spec9.setIndicator("  Curriculam  ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec5= tabs.newTabSpec("details");

	        spec5.setContent(R.id.linear_workshop_autonova_details);
	        spec5.setIndicator("  Details  ");

	        tabs.addTab(spec5);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_workshop_autonova_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
