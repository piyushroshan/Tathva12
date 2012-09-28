package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Chem_Cheautic extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.chem_cheautic);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_chem_cheautic);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_chem_cheautic_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_chem_cheautic_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("stmt");

	        spec8.setContent(R.id.linear_chem_cheautic_stmt);
	        spec8.setIndicator("  Statement  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_chem_cheautic_judge);
	        spec7.setIndicator("  Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec9= tabs.newTabSpec("guidelines");

	        spec9.setContent(R.id.linear_chem_cheautic_guidelines);
	        spec9.setIndicator("  Guidelines  ");

	        tabs.addTab(spec9);
	        
	        TabHost.TabSpec spec5= tabs.newTabSpec("faq");

	        spec5.setContent(R.id.linear_chem_cheautic_faq);
	        spec5.setIndicator("  FAQ  ");

	        tabs.addTab(spec5);
	        
	        
	        
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_chem_cheautic_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
