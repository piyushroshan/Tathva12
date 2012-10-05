package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_Total_Station extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_total_station);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_total_station);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_total_station_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("highlights");

	        spec7.setContent(R.id.linear_workshop_total_station_highlights);
	        spec7.setIndicator("  Highlights  ");

	        tabs.addTab(spec7);
	        

	        TabHost.TabSpec spec4 = tabs.newTabSpec("organiser");

	        spec4.setContent(R.id.linear_workshop_total_station_organiser);
	        spec4.setIndicator("  Workshop Details  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_workshop_total_station_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	        

	}

}
