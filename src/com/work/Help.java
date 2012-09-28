package com.work;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class Help extends TabActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.help);
		
		    TabHost tabHost = getTabHost();  // The activity TabHost
		    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
		    Intent intent;  // Reusable Intent for each tab
		    
		    intent = new Intent().setClass(this, reach_us.class);

		    // Initialize a TabSpec for each tab and add it to the TabHost
		    spec = tabHost.newTabSpec("reach_us").setIndicator("   Reach Us   ").setContent(intent);

		    tabHost.addTab(spec);
		    
		    
		 // Create an Intent to launch an Activity for the tab (to be reused)
		    intent = new Intent().setClass(this, image_scroller.class);

		    // Initialize a TabSpec for each tab and add it to the TabHost
		    spec = tabHost.newTabSpec("map").setIndicator("   Map   ").setContent(intent);

		    tabHost.addTab(spec);
		    
		    
		    
		    intent = new Intent().setClass(this, info.class);

		    // Initialize a TabSpec for each tab and add it to the TabHost
		    spec = tabHost.newTabSpec("info").setIndicator("   Info   ").setContent(intent);

		    tabHost.addTab(spec);
		    

		    intent = new Intent().setClass(this, contact.class);

		    // Initialize a TabSpec for each tab and add it to the TabHost
		    spec = tabHost.newTabSpec("contact").setIndicator("   Contacts   ").setContent(intent);

		    tabHost.addTab(spec);
		
		
		
	}

}
