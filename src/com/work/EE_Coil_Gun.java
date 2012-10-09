package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class EE_Coil_Gun extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ee_coil_gun);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_ee_coil_gun);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_ee_coil_gun_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec6= tabs.newTabSpec("statement");

	        spec6.setContent(R.id.linear_ee_coil_gun_stmt);
	        spec6.setIndicator("  Problem Statement  ");

	        tabs.addTab(spec6);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_ee_coil_gun_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_ee_coil_gun_judge);
	        spec7.setIndicator("  Judging Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec13 = tabs.newTabSpec("faq");

	        spec13.setContent(R.id.linear_ee_coil_gun_faq);
	        spec13.setIndicator("  FAQ  ");

	        tabs.addTab(spec13);
	        
	        
	        TabHost.TabSpec spec11 = tabs.newTabSpec("prizes");

	        spec11.setContent(R.id.linear_ee_coil_gun_prizes);
	        spec11.setIndicator("  Prizes  ");

	        tabs.addTab(spec11);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_ee_coil_gun_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
