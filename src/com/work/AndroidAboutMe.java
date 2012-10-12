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

public class AndroidAboutMe extends Activity {
	Integer version;
	Integer myVersion;
	String myTag;
	private boolean alreadyDone;

	Handler handler;

	public void checkVersion()
	{
		String nextLine;
		String testline = new String("");
		//version=;
		URL url = null;


		URLConnection urlConn = null;
		InputStreamReader  inStream = null;
		BufferedReader buff = null;
		myTag="hello";
		try{
			Log.i(myTag,"Called2");	
			// Create the URL obect that points
			// at the default file index.html
			url  = new URL("http://athena.nitc.ac.in/~roshan_bcs10/tathva/tathva.txt");
			urlConn = url.openConnection();
			urlConn.setUseCaches(false); 
			//urlConn.setRequestProperty("User-Agent", useragent);
			urlConn.setConnectTimeout(30000);
			urlConn.connect();
			inStream = new InputStreamReader(urlConn.getInputStream());
			buff= new BufferedReader(inStream);
			boolean flag = true;
			nextLine = "";
			// Read and print the lines from index.html
			while (flag){
				nextLine =buff.readLine();  
				if (nextLine !=null){
					testline=nextLine;
					flag=false;
				}
				else{
					break;
				} 
			}
			version = Integer.valueOf(testline);
			myVersion = Integer.valueOf(getPackageManager().getPackageInfo(getPackageName(), 0).versionCode);
			if (version !=null && myVersion !=null && myVersion < version )
			{
				Toast.makeText(AndroidAboutMe.this.getApplicationContext(),"A new version is available\n Cick on update to download now.",
						Toast.LENGTH_SHORT).show();
			}
				
		} catch(Exception e){
			Log.i(myTag,e.toString());
			Toast.makeText(AndroidAboutMe.this.getApplicationContext(), e.toString(),
					Toast.LENGTH_SHORT).show();
		} 
		Log.i(myTag,testline);	
	}



	public void handleMessage() 
	{  
		Log.i(myTag, myVersion + "   " + version);
		if(version!=null && myVersion < version) 
		{
			AlertDialog.Builder builder = new AlertDialog.Builder(AndroidAboutMe.this);
			builder.setMessage("There is a newer version. Would you like to install it now?")
			.setCancelable(false)
			.setPositiveButton("Yes", new DialogInterface.OnClickListener() 
			{
				public void onClick(DialogInterface dialog, int id) 
				{
					//Uri uri = "http://athena.nitc.ac.in/~roshan_bcs10/tathva/Tathva2012.apk";
					//startNextMatchingActivity(new Intent(Intent.ACTION_VIEW, uri));
					String apkurl = "http://athena.nitc.ac.in/~roshan_bcs10/tathva/Tathva2012.apk";
					String outputFileName = "Tathva2012.apk.apk";
					try {
						URL url = new URL(apkurl);
						HttpURLConnection c = (HttpURLConnection) url.openConnection();
						c.setRequestMethod("GET");
						c.setDoOutput(true);
						c.setConnectTimeout(30000);
						c.connect();
						
						final int fileLength = c.getContentLength();
						String PATH = Environment.getExternalStorageDirectory()
								+ "/download/";
						File file = new File(PATH);
						file.mkdirs();
						File outputFile = new File(file, outputFileName);
						if(outputFile.exists()){
							outputFile.delete();
							Log.i(myTag,"Delete");	
						}
						Log.i(myTag,"Update");	

						FileOutputStream fos = new FileOutputStream(outputFile);
						Log.i(myTag,"Update file");	
						InputStream is = c.getInputStream();

						byte[] buffer = new byte[1024];
						int len1 = 0;
						int count = 0;
						int percent = 0;
						while ((len1 = is.read(buffer)) != -1) {
							fos.write(buffer, 0, len1);
							count=count+len1;
							
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
								"application/vnd.android.package-archive");
						intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						AndroidAboutMe.this.startActivity(intent);
					} catch (Exception e) {
						Toast.makeText(AndroidAboutMe.this.getApplicationContext(), "Update error!\n"+e.toString(),
								Toast.LENGTH_SHORT).show();
						Log.i(myTag,e.toString());
					}
					dialog.cancel();
				}
			})
			//You can leave this button out if you don't want to give the users any choice. They will either have to update, or close the app
			.setNegativeButton("No", new DialogInterface.OnClickListener() 
			{ 
				public void onClick(DialogInterface dialog, int id) 
				{
					dialog.cancel();
				}
			});
			AlertDialog alertDialog = builder.create();
			alertDialog.show();
		}else
		{
			AlertDialog.Builder builder = new AlertDialog.Builder(AndroidAboutMe.this);
			builder.setMessage("Your version is up to date\n Note: Check that you are connected to internet.")
			.setCancelable(false)
			//You can leave this button out if you don't want to give the users any choice. They will either have to update, or close the app
			.setNegativeButton("Close", new DialogInterface.OnClickListener() 
			{ 
				public void onClick(DialogInterface dialog, int id) 
				{
					dialog.cancel();
				}
			});
			AlertDialog alertDialog = builder.create();
			alertDialog.show();
		}

	}





	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(AndroidAboutMe.this.getApplicationContext(), "Checking for new version",
				Toast.LENGTH_SHORT).show();
		checkVersion();
		setContentView(R.layout.version);
		Button buttonAboutMe = (Button)findViewById(R.id.aboutme);


		buttonAboutMe.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String strVersion;
				PackageInfo packageInfo;
				try {
					packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
					strVersion = "Version Name: " + packageInfo.versionName +"\n"
							+ "Version Code: " + String.valueOf(packageInfo.versionCode)+"\n"
							+ "Version New: " + String.valueOf(version);
				} catch (NameNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					strVersion = "Cannot load Version!";
				} 

				new AlertDialog.Builder(AndroidAboutMe.this)
				.setTitle("About Me!").setMessage(strVersion)
				.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {}
				}).show();

			}});


		Button buttonUpdates = (Button)findViewById(R.id.update);


		buttonUpdates.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				// TODO Auto-generated method stub

				handleMessage();
			}});


		//handlesMessage();

	}


}