package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Highlights_Srishti extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.highlight_envision_srishti);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_highlight_envision_srishti);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_highlight_envision_srishti_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("stmt");

	        spec8.setContent(R.id.linear_highlight_envision_srishti_stmt);
	        spec8.setIndicator("  Statement  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("rules");

	        spec9.setContent(R.id.linear_highlight_envision_srishti_rules);
	        spec9.setIndicator("  Rules  ");

	        tabs.addTab(spec9);
	        
	        
	        
	        TabHost.TabSpec spec5 = tabs.newTabSpec("guidelines");

	        spec5.setContent(R.id.linear_highlight_envision_srishti_guidelines);
	        spec5.setIndicator("  Guidelines  ");

	        tabs.addTab(spec5);
	        
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_highlight_envision_srishti_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
