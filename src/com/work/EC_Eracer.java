package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class EC_Eracer extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ec_eracer);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_ec_eracer);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_ec_eracer_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("eventspecifications");

	        spec4.setContent(R.id.linear_ec_eracer_specs);
	        spec4.setIndicator("  Event Specifications  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec11 = tabs.newTabSpec("teamspecifications");

	        spec11.setContent(R.id.linear_ec_eracer_team_specs);
	        spec11.setIndicator("  Team Specifications  ");

	        tabs.addTab(spec11);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_ec_eracer_judge);
	        spec7.setIndicator("  Judging Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_ec_eracer_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	        
	        TabHost.TabSpec spec12 = tabs.newTabSpec("Prizes");

	        spec12.setContent(R.id.linear_ec_eracer_prize);
	        spec12.setIndicator("  Prizes  ");

	        tabs.addTab(spec12);
	}

}
