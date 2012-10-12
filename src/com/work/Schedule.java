package com.work;

import java.io.*;
import java.net.*;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class Schedule extends Activity {
	Integer version;
	Integer myVersion;
	String myTag;
	private boolean alreadyDone;

	Handler handler;





	public void handleMessageDownload() 
	{  
		//Uri uri = "http://athena.nitc.ac.in/~roshan_bcs10/tathva/Tathva2012.apk";
		//startNextMatchingActivity(new Intent(Intent.ACTION_VIEW, uri));
		myTag="Log";
		Log.i(myTag,"Download Starting");	
		final String apkurl = "http://tathva.org/2012/files/t12_schedule.pdf";
		final String outputFileName = "schedule.pdf";
		try{



			Log.i(myTag,"Download began");
			String PATH = Environment.getExternalStorageDirectory()
					+ "/download/";
			File file = new File(PATH);
			file.mkdirs();
			final File outputFile = new File(file, outputFileName);
			if(outputFile.exists()){
				AlertDialog.Builder builder = new AlertDialog.Builder(Schedule.this);

				builder.setMessage("File Already exists.\n Do you want to download a new version")
				.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						URL url;
						dialog.cancel();
						Toast.makeText(Schedule.this.getApplicationContext(), "Please wait while file is being downloaded",
								Toast.LENGTH_LONG).show();
						try {
							
							url = new URL(apkurl);
							
							
							HttpURLConnection c = (HttpURLConnection) url.openConnection();
							c.setRequestMethod("GET");
							c.setDoOutput(true);
							c.connect();
							final int fileLength = c.getContentLength();
							Log.i(myTag,"Update");	
							outputFile.delete();
							Log.i(myTag,"Delete");	
							FileOutputStream fos;

							fos = new FileOutputStream(outputFile);

							Log.i(myTag,"Update file");	

							InputStream is = c.getInputStream();
							byte[] buffer = new byte[1024];
							int len1 = 0;
							int count = 0;
							int percent = 0;
							while ((len1 = is.read(buffer)) != -1) {
								fos.write(buffer, 0, len1);
								count=count+len1;
								percent=count*100/fileLength;
							}
							fos.close();
							is.close();// .apk is download to sdcard in download file
							//Toast.makeText(AndroidAboutMe.this.getApplicationContext(), "Downloaded",
							//       Toast.LENGTH_LONG).show();
							// install the .apk
							Log.i(myTag,"Downloaded");	

						} catch (Exception e) {
							// TODO Auto-generated catch block
							dialog.cancel();
							Toast.makeText(Schedule.this.getApplicationContext(), "Update error!\n"+e.toString(),
									Toast.LENGTH_SHORT).show();
						}
						finally
						{
							
							Intent intent = new Intent(Intent.ACTION_VIEW);
							intent.setDataAndType(Uri.fromFile(new File(Environment
									.getExternalStorageDirectory()
									+ "/download/"
									+ outputFileName)),
									"application/pdf");
							intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
							Schedule.this.startActivity(intent);
						}

						
					}
				})
				.setNegativeButton("Cancel",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						Intent intent = new Intent(Intent.ACTION_VIEW);
						intent.setDataAndType(Uri.fromFile(new File(Environment
								.getExternalStorageDirectory()
								+ "/download/"
								+ outputFileName)),
								"application/pdf");
						intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						Schedule.this.startActivity(intent);
						dialog.cancel();
					}
				});

				AlertDialog alertDialog = builder.create();
				alertDialog.show();
				
			}
			else
			{
				FileOutputStream fos;
				try {
					URL url = new URL(apkurl);
					final HttpURLConnection c = (HttpURLConnection) url.openConnection();
					c.setRequestMethod("GET");
					c.setDoOutput(true);
					c.setConnectTimeout(30000);
					c.connect();
					fos = new FileOutputStream(outputFile);

					Log.i(myTag,"Update file");	

					InputStream is = c.getInputStream();
					byte[] buffer = new byte[1024];
					int len1 = 0;
					while ((len1 = is.read(buffer)) != -1) {
						fos.write(buffer, 0, len1);
					}
					fos.close();
					is.close();// .apk is download to sdcard in download file
					//Toast.makeText(AndroidAboutMe.this.getApplicationContext(), "Downloaded",
					//       Toast.LENGTH_LONG).show();
					// install the .apk
					Log.i(myTag,"Downloaded");	
					Intent intent = new Intent(Intent.ACTION_VIEW);
					intent.setDataAndType(Uri.fromFile(new File(Environment
							.getExternalStorageDirectory()
							+ "/download/"
							+ outputFileName)),
							"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					Schedule.this.startActivity(intent);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					Toast.makeText(Schedule.this.getApplicationContext(), "Update error!\n"+e.toString(),
							Toast.LENGTH_SHORT).show();
				}


				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setDataAndType(Uri.fromFile(new File(Environment
						.getExternalStorageDirectory()
						+ "/download/"
						+ outputFileName)),
						"application/pdf");
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				Schedule.this.startActivity(intent);
			}
		}catch(Exception e)
		{
			Log.i(myTag,e.toString());	

		}


	}






	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule);
		Button buttonSchedule = (Button)findViewById(R.id.schedulebutton);


		buttonSchedule.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				// TODO Auto-generated method stu
				handleMessageDownload();
			}});


	}


}