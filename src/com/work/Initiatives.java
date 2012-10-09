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
		

	}
}
