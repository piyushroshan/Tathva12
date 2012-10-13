package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Lectures extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lectures);
		setControls();
	}
	
	private void setControls()  {
		
		ImageView imgRaju = (ImageView)findViewById(R.id.img_lectures_raju);
		imgRaju.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Lectures.this, Lectures_Raju.class);
				Lectures.this.startActivity(myIntent);
			}
		});
				
		
		ImageView imgArchana = (ImageView)findViewById(R.id.img_lectures_archana);
		imgArchana.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Lectures.this, Lectures_Archana.class);
				Lectures.this.startActivity(myIntent);
			}
		});

		ImageView imgShivathanu = (ImageView)findViewById(R.id.img_lectures_shivathanu);
		imgShivathanu.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Lectures.this, Lectures_Shivathanu.class);
				Lectures.this.startActivity(myIntent);
			}
		});
			
		ImageView imgMadhavan = (ImageView)findViewById(R.id.img_lectures_madhavan);
		imgMadhavan.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Lectures.this, Lectures_Madhavan.class);
				Lectures.this.startActivity(myIntent);
			}
		});
		
				


		
		
	}

}
