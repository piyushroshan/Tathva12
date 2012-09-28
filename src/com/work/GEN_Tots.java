package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class GEN_Tots extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.gen_tots);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_gen_tots);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_gen_tots_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("hunt");

	        spec8.setContent(R.id.linear_gen_tots_hunt);
	        spec8.setIndicator("  The Hunt for Atlantis  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("elementart");

	        spec4.setContent(R.id.linear_gen_tots_elementart);
	        spec4.setIndicator("  Elementary  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("tech");

	        spec7.setContent(R.id.linear_gen_tots_tech);
	        spec7.setIndicator("  Tech Dumb Charades  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_gen_tots_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
