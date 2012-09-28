package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Workshop_Hack_attack extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.workshop_hack_attack);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_workshop_hack_attack);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_workshop_hack_attack_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("workshops");

	        spec7.setContent(R.id.linear_workshop_hack_attack_workshops);
	        spec7.setIndicator("  Workshops  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("workshop_details");

	        spec3.setContent(R.id.linear_workshop_hack_attack_workshop_details);
	        spec3.setIndicator("  Workshop Details  ");

	        tabs.addTab(spec3);
	        
	        TabHost.TabSpec spec2 = tabs.newTabSpec("contact");

	        spec2.setContent(R.id.linear_workshop_hack_attack_contact);
	        spec2.setIndicator("  Contacts  ");

	        tabs.addTab(spec2);
	}

}
