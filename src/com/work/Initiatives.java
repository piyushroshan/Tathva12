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
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Highlights_YI.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		
		ImageView imgTeach = (ImageView)findViewById(R.id.img_initiative_teach);
		imgTeach.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Initiative_Teach.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgSchool = (ImageView)findViewById(R.id.img_initiative_school);
		imgSchool.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Initiatives.this, Initiative_School.class);
				Initiatives.this.startActivity(myIntent);
			}
		});
	}
}
