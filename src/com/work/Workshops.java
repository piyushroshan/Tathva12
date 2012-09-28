package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Workshops extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.workshops);
		setControls();
	}
	
	private void setControls()  {
		
		ImageView imgAstro = (ImageView)findViewById(R.id.image_workshop_astro);
		imgAstro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Astro.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		ImageView imgRC = (ImageView)findViewById(R.id.image_workshop_rc_plane);
		imgRC.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_RC_Plane.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		ImageView imgHack = (ImageView)findViewById(R.id.image_workshop_hack);
		imgHack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Hack_attack.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		ImageView imgCloud = (ImageView)findViewById(R.id.image_workshop_cloud);
		imgCloud.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Cloud_Computing.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgAutomotive = (ImageView)findViewById(R.id.image_workshop_automotive);
		imgAutomotive.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Automotive.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAccelero = (ImageView)findViewById(R.id.image_workshop_accelerobotix);
		imgAccelero.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Accelero_Botix.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
	}
}
