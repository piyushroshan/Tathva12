package com.work;

import java.io.*;
import java.net.*;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;

public class Update_Tathva extends Activity {
	Integer version;
	Integer myVersion;
	String myTag;
	Button btnShowProgress;
	private final int progress_bar_type = 0;
	private final int check_bar_type = 1;
	private ProgressDialog pDialog;
	final String outputFileName = "Tathva2012.apk.apk";
	Handler handler;
	boolean update = false;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.version);
		Button buttonAboutMe = (Button)findViewById(R.id.aboutme);
		btnShowProgress = (Button) findViewById(R.id.update);
		new CheckVersion().execute("http://athena.nitc.ac.in/~roshan_bcs10/tathva/tathva.txt");

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

				new AlertDialog.Builder(Update_Tathva.this)
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
				new CheckVersion().execute("http://athena.nitc.ac.in/~roshan_bcs10/tathva/tathva.txt");
				new DownloadFileUrl().execute("http://athena.nitc.ac.in/~roshan_bcs10/tathva/Tathva2012.apk");
			}});


		//handlesMessage();

	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case progress_bar_type:
			pDialog = new ProgressDialog(this);
			pDialog.setMessage("Downloading file. Please wait...");
			pDialog.setIndeterminate(false);
			pDialog.setMax(100);
			pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			pDialog.setCancelable(true);
			pDialog.show();
			return pDialog;
		case check_bar_type:
			pDialog = new ProgressDialog(this);
			pDialog.setMessage("Checking for new version...");
			pDialog.setIndeterminate(false);
			pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			pDialog.setCancelable(true);
			pDialog.show();
			return pDialog;
		default:
			return null;
		}
	}

	public class DownloadFileUrl extends AsyncTask<String, String, String> {

		Context context;
		String urls;
		String fileName = "Tathva2012.apk.apk";

		public void Download(String urls) {
			this.urls=urls;

		}

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			showDialog(progress_bar_type);
		}

		protected void onProgressUpdate(String... progress) {
			// setting progress percentage
			pDialog.setProgress(Integer.parseInt(progress[0]));
		}

		protected String doInBackground(String ... urls) {

			String PATH = Environment.getExternalStorageDirectory()+ "/download/";
			File file = new File(PATH);
			file.mkdirs();
			File outputFile = new File(file , fileName);
			// //////////////////////
			try {

				//Uri uri = "http://athena.nitc.ac.in/~roshan_bcs10/tathva/Tathva2012.apk";
				//startNextMatchingActivity(new Intent(Intent.ACTION_VIEW, uri));
				String apkurl = "http://athena.nitc.ac.in/~roshan_bcs10/tathva/Tathva2012.apk";

				URL url = new URL(apkurl);
				HttpURLConnection c = (HttpURLConnection) url.openConnection();
				c.setRequestMethod("GET");
				c.setDoOutput(true);
				c.setConnectTimeout(30000);
				c.connect();
				final int fileLength = c.getContentLength();
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
					percent=count*100/fileLength;
					this.publishProgress(""+percent);

				}
				fos.close();
				is.close();// .apk is download to sdcard in download file
				//Toast.makeText(Update_Tathva.this.getApplicationContext(), "Downloaded",
				//       Toast.LENGTH_LONG).show();
				// install the .apk
				Log.i(myTag,"Downloaded");	


			}
			catch (Exception e) {
				// TODO: handle exception
				return "error";
			}

			return "done";
		}

		@Override
		protected void onPostExecute(String result) {

			dismissDialog(progress_bar_type);
			if(result=="done")
			{
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setDataAndType(Uri.fromFile(new File(Environment
						.getExternalStorageDirectory()
						+ "/download/"
						+ outputFileName)),
						"application/vnd.android.package-archive");
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				Update_Tathva.this.startActivity(intent);		

			}
			else{
				Toast.makeText(Update_Tathva.this.getApplicationContext(), "Update error!",
						Toast.LENGTH_SHORT).show();
			}

		}




	}



	public class CheckVersion extends AsyncTask<String, String, String> {

		Context context;
		String urls;
		String fileName = "tathva.txt";

		public void Download(String urls) {
			this.urls=urls;

		}

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			showDialog(check_bar_type);
		}

		protected void onProgressUpdate(String... progress) {
			// setting progress percentage
			pDialog.setProgress(Integer.parseInt(progress[0]));
		}

		protected String doInBackground(String ... urls) {


			// //////////////////////
			try {
				URL url =new URL(urls[0]);
				HttpURLConnection c = (HttpURLConnection) url.openConnection();
				c.setUseCaches(false); 
				c.connect();
				InputStreamReader is = new InputStreamReader(c.getInputStream());
				BufferedReader buff= new BufferedReader(is);
				String nextLine = "";
				String testline="";
				// Read and print the lines from index.html
				nextLine =buff.readLine();  
				if (nextLine !=null){
					testline=nextLine;
				}
				version = Integer.valueOf(testline);
				myVersion = Integer.valueOf(getPackageManager().getPackageInfo(getPackageName(), 0).versionCode);

			} catch (IOException e) {
				e.printStackTrace();
				return "error";
			}
			catch (Exception e)
			{
				e.printStackTrace();
				return "error";
			}
			return "done";
		}

		@Override
		protected void onPostExecute(String result) {

			dismissDialog(check_bar_type);
			if(result=="done")
			{
				if (version !=null && myVersion !=null && myVersion < version )
				{
					update = true;
					Toast.makeText(Update_Tathva.this.getApplicationContext(),"A new version is available\n Cick on update to download now.",
							Toast.LENGTH_SHORT).show();
				}
			}

		}

	}
}


