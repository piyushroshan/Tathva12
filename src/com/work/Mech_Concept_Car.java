package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Mech_Concept_Car extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mech_conceptcar);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_mech_conceptcar);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_mech_conceptcar_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("prblm_stmt");

	        spec4.setContent(R.id.linear_mech_conceptcar_stmt);
	        spec4.setIndicator("  Pblm Stmt  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec6 = tabs.newTabSpec("Specification");

	        spec6.setContent(R.id.linear_mech_conceptcar_spec);
	        spec6.setIndicator("  Specification  ");

	        tabs.addTab(spec6);
	        

	        TabHost.TabSpec spec8 = tabs.newTabSpec("Prizes");

	        spec8.setContent(R.id.linear_mech_conceptcar_prizes);
	        spec8.setIndicator("  Prizes  ");

	        tabs.addTab(spec8);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_mech_conceptcar_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
