package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Mech_Machnascene extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mech_machnascene);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_mech_machnascene);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_mech_machnascene_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("prblm_stmt");

	        spec4.setContent(R.id.linear_mech_machnascene_stmt);
	        spec4.setIndicator("  Pblm Stmt  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("spec");

	        spec9.setContent(R.id.linear_mech_machnascene_spec);
	        spec9.setIndicator("  Specifications  ");

	        tabs.addTab(spec9);
	        
	        TabHost.TabSpec spec5 = tabs.newTabSpec("Prizes");

	        spec5.setContent(R.id.linear_mech_machnascene_prizes);
	        spec5.setIndicator("  Prizes  ");

	        tabs.addTab(spec5);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("contact");
	        spec3.setContent(R.id.linear_mech_machnascene_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
