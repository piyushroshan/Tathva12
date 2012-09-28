package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Robotics_League extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.robotics_league);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhostRoboLeague);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linearRoboLeagueIntro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("prblm_stmt");

	        spec4.setContent(R.id.linearRoboLeagueProblem);
	        spec4.setIndicator("  Pblm Stmt  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("specs");

	        spec2.setContent(R.id.linearRoboLeagueSpecifications);
	        spec2.setIndicator("  Specifications  ");

	        tabs.addTab(spec2);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linearRoboLeagueContact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
