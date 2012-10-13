package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Nights extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nights);
		setControls();
	}
	
	private void setControls()  {
		
		
		
		
		ImageView imgRahul = (ImageView)findViewById(R.id.img_nites_rahul_nambiar);
		imgRahul.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Nights.this, Nites_Rahul_Nambiar.class);
				Nights.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgSuchithra = (ImageView)findViewById(R.id.img_nites_suchithra);
		imgSuchithra.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Nights.this, Nites_Suchithra.class);
				Nights.this.startActivity(myIntent);
			}
		});
		

		ImageView imgAcrobatics = (ImageView)findViewById(R.id.img_nites_acrobatics);
		imgAcrobatics.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Nights.this, Nites_Acrobatics.class);
				Nights.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAgam = (ImageView)findViewById(R.id.img_nites_agam);
		imgAgam.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Nights.this, Nites_Agam.class);
				Nights.this.startActivity(myIntent);
			}
		});
		


		
		
	}

}
