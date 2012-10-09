package com.work;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Competitions extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.competitions);
		setControls();
	}
	
	private void setControls()  {
		
		/* ----------------------------------- ROBOTICS------------------------*/
		
		ImageView imgCollision = (ImageView)findViewById(R.id.imgCollision);
		imgCollision.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Robotics_Collision_Course.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgTrans = (ImageView)findViewById(R.id.imgTrans);
		imgTrans.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Robotics_Transporter.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		
		
		
		ImageView imgLeague = (ImageView)findViewById(R.id.imgLeague);
		imgLeague.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Robotics_League.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgMiniMouse = (ImageView)findViewById(R.id.imgMiniMouse);
		imgMiniMouse.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Competitions.this, Robotics_Mini_Mouse.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgSignal = (ImageView)findViewById(R.id.imgSignal);
		imgSignal.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Robotics_Signal_Maestro.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		
		ImageView imgDirt = (ImageView)findViewById(R.id.imgDirt);
		imgDirt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Robotics_Dirt_Race.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF ROBO------------------------*/
		
		/* ----------------------------------- MECH------------------------*/
		
		ImageView imgContr = (ImageView)findViewById(R.id.imgContr);
		imgContr.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Mech_Contraption.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAmphi = (ImageView)findViewById(R.id.imgmechnascene);
		imgAmphi.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Mech_Machnascene.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgIncarnate = (ImageView)findViewById(R.id.imgIncarnate);
		imgIncarnate.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Mech_Incarnate.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgOff = (ImageView)findViewById(R.id.imgOff);
		imgOff.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Mech_Concept_Car.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgAqua = (ImageView)findViewById(R.id.imgAqua);
		imgAqua.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Mech_Aqua_Missile.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgNavigator = (ImageView)findViewById(R.id.imgNavigator);
		imgNavigator.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Mech_Navigator.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF MECH------------------------*/
		
		/* ----------------------------------- CS------------------------*/
		
		ImageView imgTux = (ImageView)findViewById(R.id.imgTux);
		imgTux.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Competitions.this, CS_tux.class);
				Competitions.this.startActivity(myIntent);
				
			}
		});
		
		
		ImageView imgBef = (ImageView)findViewById(R.id.imgBef);
		imgBef.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Competitions.this, CS_befunge.class);
				Competitions.this.startActivity(myIntent);
				
			}
		});
		
		ImageView imgKoderkombat = (ImageView)findViewById(R.id.imgKoderKombat);
		imgKoderkombat.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Competitions.this, CS_koderkombat.class);
				Competitions.this.startActivity(myIntent);
				
			}
		});
		
		
		
		/* ----------------------------------- END OF CS------------------------*/
		
		/* ----------------------------------- EE------------------------*/
		
		ImageView imgCoil = (ImageView)findViewById(R.id.imgCoil);
		imgCoil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, EE_Coil_Gun.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgPure = (ImageView)findViewById(R.id.imgpure);
		imgPure.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, EE_Pure_Tricks.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgmouse = (ImageView)findViewById(R.id.imgMouse);
		imgmouse.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, EE_Mouse_Drive.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF EE------------------------*/
		
		/* ----------------------------------- EC------------------------*/
		
		ImageView imgGSM = (ImageView)findViewById(R.id.imgGSm);
		imgGSM.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, EC_GSM.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgSonic = (ImageView)findViewById(R.id.imgSonic);
		imgSonic.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, EC_Sonic.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgEracer = (ImageView)findViewById(R.id.imgErace);
		imgEracer.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, EC_Eracer.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF EC------------------------*/
		
		/* ----------------------------------- GEN------------------------*/
		
		ImageView imgInqVirt = (ImageView)findViewById(R.id.imgInq);
		imgInqVirt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, GEN_Inq_Virt.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgTots = (ImageView)findViewById(R.id.imgTOTS);
		imgTots.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, GEN_Tots.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgQuiz = (ImageView)findViewById(R.id.imgQuiz);
		imgQuiz.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(Competitions.this, GEN_Quiz.class);
				Competitions.this.startActivity(myIntent);
				
			}
		});
		
		ImageView imgBizbio = (ImageView)findViewById(R.id.imgBiz);
		imgBizbio.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, GEN_Bizbio_Perzanta.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgBlue = (ImageView)findViewById(R.id.imgBlueprint);
		imgBlue.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, GEN_Blue_Print.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgLog = (ImageView)findViewById(R.id.imgLOG);
		imgLog.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, GEN_Log_IQ.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF GEN------------------------*/
		
		
		/* ----------------------------------- BLITZ------------------------*/
		
		ImageView imgDota = (ImageView)findViewById(R.id.img_blitz_dota);
		imgDota.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Blitz_Dota.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		
		
		ImageView imgFifa = (ImageView)findViewById(R.id.img_blitz_fifa);
		imgFifa.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Blitz_Fifa.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgNfs = (ImageView)findViewById(R.id.img_blitz_nfs);
		imgNfs.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Blitz_Nfs.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		

		
		

		
		ImageView imgCounter = (ImageView)findViewById(R.id.img_blitz_counter);
		imgCounter.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Blitz_Counter.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		/* ----------------------------------- END OF BLITZ------------------------*/
		
		/* ----------------------------------- CIVIL------------------------*/
		
		ImageView imgErecthion = (ImageView)findViewById(R.id.img_civil_erecthion);
		imgErecthion.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Civil_Erecthion.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgDescartes = (ImageView)findViewById(R.id.img_civil_desc);
		imgDescartes.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Civil_Descartes.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
	
		
		ImageView imgFloating = (ImageView)findViewById(R.id.img_civil_float);
		imgFloating.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Civil_Floating.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF CIVIL------------------------*/
		
		/* ----------------------------------- MANAGE------------------------*/
		
		
		ImageView imgBaptist = (ImageView)findViewById(R.id.img_manage_baptist);
		imgBaptist.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Manage_Baptist.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgBizz = (ImageView)findViewById(R.id.img_manage_socio);
		imgBizz.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Manage_Bizz.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		ImageView imgTycoon = (ImageView)findViewById(R.id.img_manage_tycoon);
		imgTycoon.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Manage_Tycoon.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF MANAGE------------------------*/
		
		/* ----------------------------------- ARCH------------------------*/
		ImageView imgPath = (ImageView)findViewById(R.id.img_arch_path);
		imgPath.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Arch_Transform.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgPod = (ImageView)findViewById(R.id.img_arch_pod);
		imgPod.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Arch_Parallel.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgKinetic = (ImageView)findViewById(R.id.img_arch_kinetic);
		imgKinetic.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Arch_Kinetic.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		
		/* ----------------------------------- END OF ARCH------------------------*/
		
		/* ----------------------------------- CHEM------------------------*/
		
		ImageView imgInterrupteur = (ImageView)findViewById(R.id.img_chem_interrepteur);
		imgInterrupteur.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Chem_Interrupteur.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		ImageView imgCheautic = (ImageView)findViewById(R.id.img_chem_cheautic);
		imgCheautic.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Competitions.this, Chem_Cheo.class);
				Competitions.this.startActivity(myIntent);
			}
		});
		
		/* ----------------------------------- END OF CHEM------------------------*/

	}
}
