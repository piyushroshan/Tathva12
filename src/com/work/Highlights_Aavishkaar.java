package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Highlights_Aavishkaar extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.highlight_envision_aavishkaar);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_highlight_envision_aavishkaar);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_highlight_envision_aavishkaar_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("prizes");

	        spec9.setContent(R.id.linear_highlight_envision_aavishkaar_prizes);
	        spec9.setIndicator("  Prizes ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_highlight_envision_aavishkaar_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
