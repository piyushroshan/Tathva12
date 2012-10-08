package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Robotics_Signal_Maestro extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.robotics_signal_maestro);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_robo_signal_maestro);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_robo_signal_maestro_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("spec");

	        spec4.setContent(R.id.linear_robo_signal_maestro_spec);
	        spec4.setIndicator("  Specification  ");

	        tabs.addTab(spec4);
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("stmt");

	        spec2.setContent(R.id.linear_robo_signal_maestro_stmt);
	        spec2.setIndicator("  Statement  ");

	        tabs.addTab(spec2);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("arena");

	        spec8.setContent(R.id.linear_robo_signal_maestro_arena);
	        spec8.setIndicator("  Arena ");

	        tabs.addTab(spec8);
	        TabHost.TabSpec spec9 = tabs.newTabSpec("prizes");

	        spec9.setContent(R.id.linear_robo_signal_maestro_prizes);
	        spec9.setIndicator(" Prizes ");

	        tabs.addTab(spec9);	        
	        TabHost.TabSpec spec5 = tabs.newTabSpec("contact");

	        spec5.setContent(R.id.linear_robo_signal_maestro_contact);
	        spec5.setIndicator("  Contact  ");

	        tabs.addTab(spec5);
	}

}
