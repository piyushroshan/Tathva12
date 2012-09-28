package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Tathva extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setControls();
    }
    
    private void setControls()  {
    	
    	TextView tvE = (TextView)findViewById(R.id.textmainE);
    	tvE.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Events.class);
				Tathva.this.startActivity(myIntent);

			}
		});
    	
    	TextView tvW = (TextView)findViewById(R.id.textmainW);
    	tvW.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Workshops.class);
				Tathva.this.startActivity(myIntent);

				
			}
		});
    	
    	TextView tvEx = (TextView)findViewById(R.id.textmainEx);
    	tvEx.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Exhibitions.class);
				Tathva.this.startActivity(myIntent);
				
			}
		});
    	
    	TextView tvHigh = (TextView)findViewById(R.id.textmainH);
    	tvHigh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Highlights.class);
				Tathva.this.startActivity(myIntent);
			}
		});
    	
    	TextView tvInitiative = (TextView)findViewById(R.id.textmainI);
    	tvInitiative.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Initiatives.class);
				Tathva.this.startActivity(myIntent);
			}
		});
    	
    	TextView tvHelp = (TextView)findViewById(R.id.textmainHelp);
    	tvHelp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Help.class);
				Tathva.this.startActivity(myIntent);
			}
		});
    	
    }
}