package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Robotics_Transporter extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.robotics_transporter);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhostTrans);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("transporter");

	        spec1.setContent(R.id.linearRoboTransIntro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("block_spec");

	        spec4.setContent(R.id.linearRoboTransBlockSpec);
	        spec4.setIndicator("  Block Specification  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec7 = tabs.newTabSpec("rob_fab");

	        spec7.setContent(R.id.linearRoboTrans_fab);
	        spec7.setIndicator("  Robot Fabrication  ");

	        tabs.addTab(spec7);
	        
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("rob_prop");

	        spec9.setContent(R.id.linearRoboTrans_prop);
	        spec9.setIndicator("  Robot Propulsion  ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec5 = tabs.newTabSpec("rob_phase1");

	        spec5.setContent(R.id.linearRoboTrans_phase1);
	        spec5.setIndicator("  Phase 1  ");

	        tabs.addTab(spec5);
	        
	      
	        
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("rules");

	        spec2.setContent(R.id.linearRoboTransRules);
	        spec2.setIndicator("  Rules  ");

	        tabs.addTab(spec2);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linearRoboTransContact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
