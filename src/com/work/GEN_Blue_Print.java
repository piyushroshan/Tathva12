package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class GEN_Blue_Print extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.gen_blue_print);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_gen_blue_print);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_gen_blue_print_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("Topics");

	        spec4.setContent(R.id.linear_gen_blue_print_topics);
	        spec4.setIndicator("  Topics  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("rules");

	        spec8.setContent(R.id.linear_gen_blue_print_rules);
	        spec8.setIndicator("  Rules  ");

	        tabs.addTab(spec8);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_gen_blue_print_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
