package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class EC_AnalogIQ extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ec_analogiq);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_ec_analogiq);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_ec_analogiq_intro);
	        spec1.setIndicator("  Introduction ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_ec_analogiq_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8= tabs.newTabSpec("stmt");

	        spec8.setContent(R.id.linear_ec_analogiq_stmt);
	        spec8.setIndicator("  Problem Statement  ");

	        tabs.addTab(spec8);
	        

	        TabHost.TabSpec spec11= tabs.newTabSpec("rounds");

	        spec11.setContent(R.id.linear_ec_analogiq_rounds);
	        spec11.setIndicator("  Event Format  ");

	        tabs.addTab(spec11);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_ec_analogiq_judge);
	        spec7.setIndicator("  Judging Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_ec_analogiq_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	        
	        TabHost.TabSpec spec13 = tabs.newTabSpec("Prize");

	        spec13.setContent(R.id.linear_ec_analogiq_prize);
	        spec13.setIndicator("  Prize  ");

	        tabs.addTab(spec13);
	}

}
