package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class EE_Accelerobotx extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ee_accelerobotx);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_ee_accelerobotx);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_ee_accelerobotx_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec6= tabs.newTabSpec("statement");

	        spec6.setContent(R.id.linear_ee_accelerobotx_stmt);
	        spec6.setIndicator("  Problem Statement  ");

	        tabs.addTab(spec6);
	        
	        TabHost.TabSpec spec16= tabs.newTabSpec("arena");

	        spec16.setContent(R.id.linear_ee_accelerobotx_arena);
	        spec16.setIndicator("  Arena  ");

	        tabs.addTab(spec16);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_ee_accelerobotx_specs);
	        spec4.setIndicator("  Machine Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec10= tabs.newTabSpec("controls");

	        spec10.setContent(R.id.linear_ee_accelerobotx_controls);
	        spec10.setIndicator("  Controls  ");

	        tabs.addTab(spec10);
	        
	        
	        TabHost.TabSpec spec12= tabs.newTabSpec("rules");

	        spec12.setContent(R.id.linear_ee_accelerobotx_rules);
	        spec12.setIndicator("  Event Rules  ");

	        tabs.addTab(spec12);
	        
	        
	        TabHost.TabSpec spec17= tabs.newTabSpec("team");

	        spec17.setContent(R.id.linear_ee_accelerobotx_team);
	        spec17.setIndicator("  Team Specifications  ");

	        tabs.addTab(spec17);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_ee_accelerobotx_judge);
	        spec7.setIndicator("  Judging Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec13 = tabs.newTabSpec("Prizes");

	        spec13.setContent(R.id.linear_ee_accelerobotx_prizes);
	        spec13.setIndicator("  Prizes  ");

	        tabs.addTab(spec13);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_ee_accelerobotx_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
