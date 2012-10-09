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
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_ISRO.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgNPCIL = (ImageView)findViewById(R.id.img_npcil);
		imgNPCIL.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_NPCIL.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgLPSC = (ImageView)findViewById(R.id.img_lpsc);
		imgLPSC.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_LPSC.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgBlink = (ImageView)findViewById(R.id.img_exhibition_blink_solutions);
		imgBlink.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Exhibition_Blink_Solutions.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});

		ImageView imgSushant = (ImageView)findViewById(R.id.img_exhibition_sushant_patnaik);
		imgSushant.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this,Exhibition_Sushant_Patnaik.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgVista = (ImageView)findViewById(R.id.img_wheels_vista);
		imgVista.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Vista.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});

		ImageView imgFull = (ImageView)findViewById(R.id.img_wheels_fullthrottle);
		imgFull.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Full_Throttle.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAutograph = (ImageView)findViewById(R.id.img_wheels_autograph);
		imgAutograph.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Autograph.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAutoquiz = (ImageView)findViewById(R.id.img_wheels_autoquiz);
		imgAutoquiz.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Autoquiz.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
		

		ImageView imgHands = (ImageView)findViewById(R.id.img_wheels_hands_on);
		imgHands.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Exhibitions.this, Wheels_Hands_On.class);
				Exhibitions.this.startActivity(myIntent);
			}
		});
	}
}
