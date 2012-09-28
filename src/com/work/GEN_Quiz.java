package com.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class GEN_Quiz extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.gen_quiz);

	        TabHost tabs = (TabHost)findViewById(R.id.tabhost_gen_quiz);

	        tabs.setup();

	        TabHost.TabSpec spec1 = tabs.newTabSpec("intro");

	        spec1.setContent(R.id.linear_gen_quiz_intro);
	        spec1.setIndicator("  Introduction  ");
	        
	        tabs.addTab(spec1);
	        
	        TabHost.TabSpec spec8 = tabs.newTabSpec("prahela");

	        spec8.setContent(R.id.linear_gen_quiz_prahela);
	        spec8.setIndicator("  Prahelika Tech Quiz  ");

	        tabs.addTab(spec8);
	        
	        
	        TabHost.TabSpec spec4 = tabs.newTabSpec("artha");

	        spec4.setContent(R.id.linear_gen_quiz_artha);
	        spec4.setIndicator("  Artha Business Quiz  ");

	        tabs.addTab(spec4);
	        
	        
	        TabHost.TabSpec spec7= tabs.newTabSpec("samasya");

	        spec7.setContent(R.id.linear_gen_quiz_Samasya);
	        spec7.setIndicator("  Samasya School Quiz  ");

	        tabs.addTab(spec7);
	        
	        TabHost.TabSpec spec3 = tabs.newTabSpec("Contact");

	        spec3.setContent(R.id.linear_gen_quiz_contact);
	        spec3.setIndicator("  Contact  ");

	        tabs.addTab(spec3);
	}

}
