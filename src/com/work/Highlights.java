package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Highlights extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.highlights);
		setControls();
	}
	
	private void setControls()  {
		
		ImageView imgRaju = (ImageView)findViewById(R.id.img_lectures_raju);
		imgRaju.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Raju.class);
				Highlights.this.startActivity(myIntent);
			}
		});
				
		
		ImageView imgTessy = (ImageView)findViewById(R.id.img_lectures_tessy);
		imgTessy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Tessy.class);
				Highlights.this.startActivity(myIntent);
			}
		});

		ImageView imgUnni = (ImageView)findViewById(R.id.img_lectures_unni);
		imgUnni.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Unni.class);
				Highlights.this.startActivity(myIntent);
			}
		});
			
		ImageView imgChandra = (ImageView)findViewById(R.id.img_lectures_chandra);
		imgChandra.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Chandra.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgIDP = (ImageView)findViewById(R.id.img_envision_idp);
		imgIDP.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_IDP.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgYI = (ImageView)findViewById(R.id.img_envision_young_engineer);
		imgYI.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_YI.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgSrishti = (ImageView)findViewById(R.id.img_envision_shristi);
		imgSrishti.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_Srishti.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgMother = (ImageView)findViewById(R.id.img_nites_mother_jane);
		imgMother.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Mother_Jane.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgShadow = (ImageView)findViewById(R.id.img_nites_hand_shadow);
		imgShadow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Hand_Shadow.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		

		ImageView imgMusic = (ImageView)findViewById(R.id.img_nites_music);
		imgMusic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Music.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgRobo = (ImageView)findViewById(R.id.img_nites_robo);
		imgRobo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Robo_Show.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		

		ImageView imgGroove = (ImageView)findViewById(R.id.img_nites_grooves);
		imgGroove.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Groove.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
	}

}
