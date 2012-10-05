package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_Delta_Wing extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_delta_wing);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_delta_wing);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_delta_wing_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("specialities");

	        spec7.setContent(R.id.linear_workshop_delta_wing_specialities);
	        spec7.setIndicator("  Specialities  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("structure");

	        spec3.setContent(R.id.linear_workshop_delta_wing_structure);
	        spec3.setIndicator("  Structure  ");

	        tabs.addTab(spec3);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("kit_contents");

	        spec8.setContent(R.id.linear_workshop_delta_wing_contents);
	        spec8.setIndicator("  Kit Contents  ");

	        tabs.addTab(spec8);
	        
	        TabHost.TabSpec spec9 = tabs.newTabSpec("details");

	        spec9.setContent(R.id.linear_workshop_delta_wing_details);
	        spec9.setIndicator("  Details  ");

	        tabs.addTab(spec9);
	        
	        
	        TabHost.TabSpec spec6 = tabs.newTabSpec("contacts");

	        spec6.setContent(R.id.linear_workshop_delta_wing_contact);
	        spec6.setIndicator("  Contact  ");

	        tabs.addTab(spec6);
	}
	

}
