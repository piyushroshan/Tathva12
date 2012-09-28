package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Mech_Amphi extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mech_amphi);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_mech_amphi);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_mech_amphi_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("prblm_stmt");

	        spec4.setContent(R.id.linear_mech_amphi_stmt);
	        spec4.setIndicator("  Pblm Stmt  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_mech_amphi_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
