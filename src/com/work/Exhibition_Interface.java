package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class Exhibition_Interface extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.exhibition_interface);
		TabHost tabs = (TabHost)findViewById(R.id.tabhost_exhibition_interface);

        tabs.setup();

        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

        spec1.setContent(R.id.linear_exhibition_interface_intro);
        spec1.setIndicator("  Introduction");
        
        tabs.addTab(spec1);
        
        TabHost.TabSpec spec4 = tabs.newTabSpec("specifications");

        spec4.setContent(R.id.linear_exhibition_interface_specs);
        spec4.setIndicator("  Specifications  ");

        tabs.addTab(spec4);
        
        
        TabHost.TabSpec spec7 = tabs.newTabSpec("criteria");

        spec7.setContent(R.id.linear_exhibition_interface_judge);
        spec7.setIndicator("  Criteria  ");

        tabs.addTab(spec7);
        

        
        TabHost.TabSpec spec9 = tabs.newTabSpec("contact");

        spec9.setContent(R.id.linear_exhibition_interface_contact);
        spec9.setIndicator("  Contact  ");

        tabs.addTab(spec9);
        
        
        
	}

}
