package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Highlights_Jigyasa extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.highlight_envision_jigyasa);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_highlight_envision_jigyasa);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_highlight_envision_jigyasa_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("stmt");

	        spec9.setContent(R.id.linear_highlight_envision_jigyasa_stmt);
	        spec9.setIndicator("  Statements  ");

	        tabs.addTab(spec9);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("objective");

	        spec8.setContent(R.id.linear_highlight_envision_jigyasa_objective);
	        spec8.setIndicator("  Objective  ");

	        tabs.addTab(spec8);
	        
	        TabHost.TabSpec spec10 = tabs.newTabSpec("rules");

	        spec10.setContent(R.id.linear_highlight_envision_jigyasa_rules);
	        spec10.setIndicator("  Rules  ");

	        tabs.addTab(spec10);
	        
	        TabHost.TabSpec spec11 = tabs.newTabSpec("guidelines");

	        spec11.setContent(R.id.linear_highlight_envision_jigyasa_guidelines);
	        spec11.setIndicator("  Guidelines  ");

	        tabs.addTab(spec11);
	        

	        
	        
	        
	        TabHost.TabSpec spec6 = tabs.newTabSpec("topics");

	        spec6.setContent(R.id.linear_highlight_envision_jigyasa_topics);
	        spec6.setIndicator("  Topics  ");

	        tabs.addTab(spec6);
	        
	        
	        TabHost.TabSpec spec7 = tabs.newTabSpec("prizes");

	        spec7.setContent(R.id.linear_highlight_envision_jigyasa_benefits);
	        spec7.setIndicator(" Benefits  ");

	        tabs.addTab(spec7);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_highlight_envision_jigyasa_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
