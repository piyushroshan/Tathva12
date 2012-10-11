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
    	
    	TextView tvE = (TextView)findViewById(R.id.textmainC);
    	tvE.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Competitions.class);
				Tathva.this.startActivity(myIntent);

			}
		});
    	
    	TextView tvW = (TextView)findViewById(R.id.textmainW);
    	tvW.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Workshops.class);
				Tathva.this.startActivity(myIntent);

				
			}
		});
    	
    	TextView tvEx = (TextView)findViewById(R.id.textmainEx);
    	tvEx.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Exhibitions.class);
				Tathva.this.startActivity(myIntent);
				
			}
		});
    	
    	TextView tvHigh = (TextView)findViewById(R.id.textmainH);
    	tvHigh.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Highlights.class);
				Tathva.this.startActivity(myIntent);
			}
		});
    	
    	TextView tvInitiative = (TextView)findViewById(R.id.textmainI);
    	tvInitiative.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Initiatives.class);
				Tathva.this.startActivity(myIntent);
			}
		});
    	
    	TextView tvHelp = (TextView)findViewById(R.id.textmainHelp);
    	tvHelp.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, Help.class);
				Tathva.this.startActivity(myIntent); 
			}
    	});
    	TextView tvUpdate = (TextView)findViewById(R.id.textmainUpdate);
    	tvUpdate.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Tathva.this, AndroidAboutMe.class);
				Tathva.this.startActivity(myIntent);
			}
		});
    	
    }
}