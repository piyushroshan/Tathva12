package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class CS_IBM extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.cs_ibm);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_cs_ibm);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_cs_ibm_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("tutorial");

	        spec4.setContent(R.id.linear_cs_ibm_tutorial);
	        spec4.setIndicator(" Tutorial  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec11 = tabs.newTabSpec("phase1");

	        spec11.setContent(R.id.linear_cs_ibm_phase1);
	        spec11.setIndicator("  Phase 1  ");

	        tabs.addTab(spec11);
	        
	        TabHost.TabSpec spec15 = tabs.newTabSpec("phase2");

	        spec15.setContent(R.id.linear_cs_ibm_phase2);
	        spec15.setIndicator("  Phase 2  ");

	        tabs.addTab(spec15);
	        
	        TabHost.TabSpec spec13 = tabs.newTabSpec("Prizes");

	        spec13.setContent(R.id.linear_cs_ibm_prizes);
	        spec13.setIndicator("  Prizes  ");

	        tabs.addTab(spec13);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_cs_ibm_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
