package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Highlights_IDP extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.highlight_envision_idp);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_highlight_envision_idp);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_highlight_envision_idp_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("idp's");

	        spec8.setContent(R.id.linear_highlight_envision_idp_details);
	        spec8.setIndicator("  IDPs @ Tathva 11  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_highlight_envision_idp_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
