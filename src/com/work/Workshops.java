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
		
		ImageView imgmsp430 = (ImageView)findViewById(R.id.image_workshop_msp430);
		imgmsp430.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_msp430.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		ImageView imgDelta_wing = (ImageView)findViewById(R.id.image_workshop_delta_wing);
		imgDelta_wing.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Delta_Wing.class);
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
		
		
		ImageView imgAutonova = (ImageView)findViewById(R.id.image_workshop_autonova);
		imgAutonova.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Autonova.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
		ImageView imgRobo = (ImageView)findViewById(R.id.image_workshop_robovision);
		imgRobo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Workshops.this, Workshop_Robo_Vision.class);
				Workshops.this.startActivity(myIntent);
			}
		});
		
	}
}
