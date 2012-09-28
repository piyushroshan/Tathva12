package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class GEN_Bizbio_Perzanta extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.gen_bizbio_perzanta);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_gen_bizbio_perzanta);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_gen_bizbio_perzanta_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_gen_bizbio_perzanta_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("stmt");

	        spec8.setContent(R.id.linear_gen_bizbio_perzanta_stmt);
	        spec8.setIndicator("  Statement  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_gen_bizbio_perzanta_judge);
	        spec7.setIndicator("  Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_gen_bizbio_perzanta_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
