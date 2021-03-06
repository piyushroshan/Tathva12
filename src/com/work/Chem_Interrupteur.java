package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Chem_Interrupteur extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.chem_interrupteur);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_chem_interrupteur);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_chem_interrupteur_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_chem_interrupteur_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("stmt");

	        spec8.setContent(R.id.linear_chem_interrupteur_stmt);
	        spec8.setIndicator("  Statement  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_chem_interrupteur_judge);
	        spec7.setIndicator("  Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec9= tabs.newTabSpec("guidelines");

	        spec9.setContent(R.id.linear_chem_interrupteur_guidelines);
	        spec9.setIndicator("  Guidelines  ");

	        tabs.addTab(spec9);
	        
	        
	        
	        TabHost.TabSpec spec6= tabs.newTabSpec("prizes");

	        spec6.setContent(R.id.linear_chem_interrupteur_prizes);
	        spec6.setIndicator("  Prizes  ");

	        tabs.addTab(spec6);
	        
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_chem_interrupteur_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
