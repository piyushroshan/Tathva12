package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Mech_Aqua_Missile extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mech_aqua_missile);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_mech_aqua_missile);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_mech_aqua_missile_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("prblm_stmt");

	        spec4.setContent(R.id.linear_mech_aqua_missile_stmt);
	        spec4.setIndicator("  Pblm Stmt  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec6 = tabs.newTabSpec("spec");

	        spec6.setContent(R.id.linear_mech_aqua_missile_spec);
	        spec6.setIndicator("  Specification  ");

	        tabs.addTab(spec6);
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("prizes");

	        spec9.setContent(R.id.linear_mech_aqua_missile_prizes);
	        spec9.setIndicator("  Prizes  ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_mech_aqua_missile_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
