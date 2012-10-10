package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Initiatives extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.initiatives);
		setControls();
	}
	
	
	private void setControls()  {
		
		
		ImageView imgYI = (ImageView)findViewById(R.id.img_intiative_yi);
		imgYI.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Highlights_YI.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		
		ImageView imgJigyasa = (ImageView)findViewById(R.id.img_envision_jigyasa);
		imgJigyasa.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Highlights_Jigyasa.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAavishkaar = (ImageView)findViewById(R.id.img_envision_aavishkaar);
		imgAavishkaar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Highlights_Aavishkaar.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		
		ImageView imgInterface = (ImageView)findViewById(R.id.img_envision_interface);
		imgInterface.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Highlights_Interface.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		
		ImageView imgIDP = (ImageView)findViewById(R.id.img_envision_idp);
		imgIDP.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Highlights_IDP.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		

	}
}
