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
		
		
		
		
		ImageView imgInformals = (ImageView)findViewById(R.id.img_informals);
		imgInformals.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_Informals.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgJigyasa = (ImageView)findViewById(R.id.img_wheels);
		imgJigyasa.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_Wheels.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAavishkaar = (ImageView)findViewById(R.id.img_envision_aavishkaar);
		imgAavishkaar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_Aavishkaaar.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgInterface = (ImageView)findViewById(R.id.img_envision_interface);
		imgInterface.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_Interfacee.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgIDP = (ImageView)findViewById(R.id.img_envision_idp);
		imgIDP.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_IDPP.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgYI = (ImageView)findViewById(R.id.img_envision_young_engineer);
		imgYI.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_YoungEn.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		


		
		
	}

}
