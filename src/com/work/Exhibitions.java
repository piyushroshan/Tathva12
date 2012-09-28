package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Exhibitions extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exhibitions);
		setControls();
	}
	private void setControls()  {
		
		
		ImageView imgISRO = (ImageView)findViewById(R.id.img_isro);
		imgISRO.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_ISRO.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgNPOL = (ImageView)findViewById(R.id.img_npol);
		imgNPOL.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_NPOL.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgIndianarmy = (ImageView)findViewById(R.id.im_indian_army);
		imgIndianarmy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_Indian_Army.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgHAM = (ImageView)findViewById(R.id.img_exhibition_ham_radio);
		imgHAM.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_Ham_Radio.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgInterface = (ImageView)findViewById(R.id.img_exhibition_interface);
		imgInterface.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_Interface.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgTouch = (ImageView)findViewById(R.id.img_exhibition_touch_magix);
		imgTouch.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_Touch_Magix.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});

		ImageView imgVista = (ImageView)findViewById(R.id.img_wheels_vista);
		imgVista.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Vista.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});

		ImageView imgFull = (ImageView)findViewById(R.id.img_wheels_fullthrottle);
		imgFull.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Full_Throttle.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgConcept = (ImageView)findViewById(R.id.img_wheels_concept);
		imgConcept.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Concept_Car_Design.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		

		ImageView imgHands = (ImageView)findViewById(R.id.img_wheels_hands_on);
		imgHands.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Hands_On.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
	}
}
