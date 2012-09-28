package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class EE_Mouse_Drive extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ee_mouse_drive);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_ee_mouse_drive);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_ee_mouse_drive_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

	        spec4.setContent(R.id.linear_ee_mouse_drive_specs);
	        spec4.setIndicator("  Specifications  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec6= tabs.newTabSpec("statement");

	        spec6.setContent(R.id.linear_ee_mouse_drive_stmt);
	        spec6.setIndicator("  Statement  ");

	        tabs.addTab(spec6);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("criteria");

	        spec7.setContent(R.id.linear_ee_mouse_drive_judge);
	        spec7.setIndicator("  Criteria  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_ee_mouse_drive_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
