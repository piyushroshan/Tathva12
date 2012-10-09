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
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Raju.class);
				Highlights.this.startActivity(myIntent);
			}
		});
				
		
		ImageView imgArchana = (ImageView)findViewById(R.id.img_lectures_archana);
		imgArchana.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Archana.class);
				Highlights.this.startActivity(myIntent);
			}
		});

		ImageView imgShivathanu = (ImageView)findViewById(R.id.img_lectures_shivathanu);
		imgShivathanu.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Shivathanu.class);
				Highlights.this.startActivity(myIntent);
			}
		});
			
		ImageView imgMadhavan = (ImageView)findViewById(R.id.img_lectures_madhavan);
		imgMadhavan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Lectures_Madhavan.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgIDP = (ImageView)findViewById(R.id.img_envision_shristi);
		imgIDP.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_IDP.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgYI = (ImageView)findViewById(R.id.img_envision_young_engineer);
		imgYI.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_YI.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgSrishti = (ImageView)findViewById(R.id.img_envision_shristi);
		imgSrishti.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Highlights_Srishti.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgRahul = (ImageView)findViewById(R.id.img_nites_rahul_nambiar);
		imgRahul.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Rahul_Nambiar.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgSuchithra = (ImageView)findViewById(R.id.img_nites_suchithra);
		imgSuchithra.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Suchithra.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		

		ImageView imgAcrobatics = (ImageView)findViewById(R.id.img_nites_acrobatics);
		imgAcrobatics.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Acrobatics.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAgam = (ImageView)findViewById(R.id.img_nites_agam);
		imgAgam.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Highlights.this, Nites_Agam.class);
				Highlights.this.startActivity(myIntent);
			}
		});
		


		
		
	}

}
