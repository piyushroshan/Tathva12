package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_msp430 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_msp430);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_msp430);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_msp430_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("highlights");

	        spec7.setContent(R.id.linear_workshop_msp430_highlights);
	        spec7.setIndicator("  Highlights  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec2= tabs.newTabSpec("kit");

	        spec2.setContent(R.id.linear_workshop_msp430_kit);
	        spec2.setIndicator("  Kit Contents ");

	        tabs.addTab(spec2);
	        TabHost.TabSpec spec4 = tabs.newTabSpec("organiser");

	        spec4.setContent(R.id.linear_workshop_msp430_organiser);
	        spec4.setIndicator("  Workshop Details  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_workshop_msp430_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	        

	}

}
