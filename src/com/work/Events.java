package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Events extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events);
		setControls();
	}
	
	private void setControls()  {
		
		/* ----------------------------------- ROBOTICS------------------------*/
		
		ImageView imgTrans = (ImageView)findViewById(R.id.imgTrans);
		imgTrans.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Robotics_Transporter.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgLeague = (ImageView)findViewById(R.id.imgLeague);
		imgLeague.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Robotics_League.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgMiniMouse = (ImageView)findViewById(R.id.imgMiniMouse);
		imgMiniMouse.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Events.this, Robotics_Mini_Mouse.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgSignal = (ImageView)findViewById(R.id.imgSignal);
		imgSignal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Robotics_Signal_Maestro.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgCollision = (ImageView)findViewById(R.id.imgCollision);
		imgCollision.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Robotics_Collision_Course.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgDirt = (ImageView)findViewById(R.id.imgDirt);
		imgDirt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Robotics_Dirt_Race.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF ROBO------------------------*/
		
		/* ----------------------------------- MECH------------------------*/
		
		ImageView imgContr = (ImageView)findViewById(R.id.imgContr);
		imgContr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Mech_Contraption.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAmphi = (ImageView)findViewById(R.id.imgAmphi);
		imgAmphi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Mech_Amphi.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgIncarnate = (ImageView)findViewById(R.id.imgIncarnate);
		imgIncarnate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Mech_Incarnate.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgOff = (ImageView)findViewById(R.id.imgOff);
		imgOff.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Mech_OffRoad.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAqua = (ImageView)findViewById(R.id.imgAqua);
		imgAqua.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Mech_Aqua_Missile.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		
		/* ----------------------------------- END OF MECH------------------------*/
		
		/* ----------------------------------- CS------------------------*/
		
		ImageView imgTux = (ImageView)findViewById(R.id.imgTux);
		imgTux.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Events.this, CS_tux.class);
				Events.this.startActivity(myIntent);
				
			}
		});
		
		
		ImageView imgBef = (ImageView)findViewById(R.id.imgBef);
		imgBef.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Events.this, CS_befunge.class);
				Events.this.startActivity(myIntent);
				
			}
		});
		
		ImageView imgKoderkombat = (ImageView)findViewById(R.id.imgKoderKombat);
		imgKoderkombat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Events.this, CS_koderkombat.class);
				Events.this.startActivity(myIntent);
				
			}
		});
		
		
		
		/* ----------------------------------- END OF CS------------------------*/
		
		/* ----------------------------------- EE------------------------*/
		
		ImageView imgCoil = (ImageView)findViewById(R.id.imgCoil);
		imgCoil.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, EE_Coil_Gun.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgPure = (ImageView)findViewById(R.id.imgpure);
		imgPure.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, EE_Pure_Tricks.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgmouse = (ImageView)findViewById(R.id.imgMouse);
		imgmouse.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, EE_Mouse_Drive.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF EE------------------------*/
		
		/* ----------------------------------- EC------------------------*/
		
		ImageView imgGSM = (ImageView)findViewById(R.id.imgGSm);
		imgGSM.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, EC_GSM.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgSonic = (ImageView)findViewById(R.id.imgSonic);
		imgSonic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, EC_Sonic.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgEracer = (ImageView)findViewById(R.id.imgErace);
		imgEracer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, EC_Eracer.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF EC------------------------*/
		
		/* ----------------------------------- GEN------------------------*/
		
		ImageView imgInqVirt = (ImageView)findViewById(R.id.imgInq);
		imgInqVirt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, GEN_Inq_Virt.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgTots = (ImageView)findViewById(R.id.imgTOTS);
		imgTots.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, GEN_Tots.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgQuiz = (ImageView)findViewById(R.id.imgQuiz);
		imgQuiz.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Events.this, GEN_Quiz.class);
				Events.this.startActivity(myIntent);
				
			}
		});
		
		ImageView imgBizbio = (ImageView)findViewById(R.id.imgBiz);
		imgBizbio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, GEN_Bizbio_Perzanta.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgBlue = (ImageView)findViewById(R.id.imgBlueprint);
		imgBlue.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, GEN_Blue_Print.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgLog = (ImageView)findViewById(R.id.imgLOG);
		imgLog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, GEN_Log_IQ.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF GEN------------------------*/
		
		
		/* ----------------------------------- BLITZ------------------------*/
		
		ImageView imgDota = (ImageView)findViewById(R.id.img_blitz_dota);
		imgDota.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Blitz_Dota.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		
		
		ImageView imgFifa = (ImageView)findViewById(R.id.img_blitz_fifa);
		imgFifa.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Blitz_Fifa.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgNfs = (ImageView)findViewById(R.id.img_blitz_nfs);
		imgNfs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Blitz_Nfs.class);
				Events.this.startActivity(myIntent);
			}
		});
		

		
		ImageView imgRag = (ImageView)findViewById(R.id.img_blitz_ragdoll);
		imgRag.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Blitz_Rag.class);
				Events.this.startActivity(myIntent);
			}
		});

		
		ImageView imgStreet = (ImageView)findViewById(R.id.img_blitz_street);
		imgStreet.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Blitz_Street.class);
				Events.this.startActivity(myIntent);
			}
		});
		

		
		ImageView imgCounter = (ImageView)findViewById(R.id.img_blitz_counter);
		imgCounter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Blitz_Counter.class);
				Events.this.startActivity(myIntent);
			}
		});
		/* ----------------------------------- END OF BLITZ------------------------*/
		
		/* ----------------------------------- CIVIL------------------------*/
		
		ImageView imgErecthion = (ImageView)findViewById(R.id.img_civil_erecthion);
		imgErecthion.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Civil_Erecthion.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgDescartes = (ImageView)findViewById(R.id.img_civil_desc);
		imgDescartes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Civil_Descartes.class);
				Events.this.startActivity(myIntent);
			}
		});
		
	
		
		ImageView imgFloating = (ImageView)findViewById(R.id.img_civil_float);
		imgFloating.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Civil_Floating.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF CIVIL------------------------*/
		
		/* ----------------------------------- MANAGE------------------------*/
		
		
		ImageView imgBaptist = (ImageView)findViewById(R.id.img_manage_baptist);
		imgBaptist.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Manage_Baptist.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgBizz = (ImageView)findViewById(R.id.img_manage_socio);
		imgBizz.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Manage_Bizz.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgTycoon = (ImageView)findViewById(R.id.img_manage_tycoon);
		imgTycoon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Manage_Tycoon.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF MANAGE------------------------*/
		
		/* ----------------------------------- ARCH------------------------*/
		ImageView imgPath = (ImageView)findViewById(R.id.img_arch_path);
		imgPath.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Arch_Path.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgPod = (ImageView)findViewById(R.id.img_arch_pod);
		imgPod.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Arch_Pod.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgKinetic = (ImageView)findViewById(R.id.img_arch_kinetic);
		imgKinetic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Arch_Kinetic.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF ARCH------------------------*/
		
		/* ----------------------------------- CHEM------------------------*/
		
		ImageView imgInterrupteur = (ImageView)findViewById(R.id.img_chem_interrepteur);
		imgInterrupteur.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Chem_Interrupteur.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		ImageView imgCheautic = (ImageView)findViewById(R.id.img_chem_cheautic);
		imgCheautic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Events.this, Chem_Cheautic.class);
				Events.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF CHEM------------------------*/

	}
}
