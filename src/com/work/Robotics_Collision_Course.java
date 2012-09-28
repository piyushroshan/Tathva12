package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Robotics_Collision_Course extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.robotics_collision_course);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_robo_collision_course);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_robo_collision_course_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("prblm_stmt");

	        spec4.setContent(R.id.linear_robo_collision_course_stmt);
	        spec4.setIndicator("  Stmt  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("specs");

	        spec2.setContent(R.id.linear_robo_collision_course_spec);
	        spec2.setIndicator("  Specifications  ");

	        tabs.addTab(spec2);
	        
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_robo_collision_course_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
