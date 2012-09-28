package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Robotics_Mini_Mouse extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.robotics_mini_mouse);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_robo_mini_mouse);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_robo_mini_mouse_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("arena");

	        spec4.setContent(R.id.linear_robo_mini_mouse_arena);
	        spec4.setIndicator("  Arena  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("specs");

	        spec2.setContent(R.id.linear_robo_mini_mouse_specs);
	        spec2.setIndicator("  Specifications  ");

	        tabs.addTab(spec2);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("stmt");

	        spec3.setContent(R.id.linear_robo_mini_mouse_stmt);
	        spec3.setIndicator("  Statement  ");

	        tabs.addTab(spec3);
	        
	        TabHost.TabSpec spec5 = tabs.newTabSpec("contact");

	        spec5.setContent(R.id.linear_robo_mini_mouse_contact);
	        spec5.setIndicator("  Contact  ");

	        tabs.addTab(spec5);
	}

}
