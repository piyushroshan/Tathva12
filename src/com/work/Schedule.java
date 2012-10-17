package com.work;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
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
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;

public class Schedule extends Activity {
	Integer version;
	Integer myVersion;
	String myTag;
	Button btnShowProgress;
	private final int progress_bar_type = 0;
	private ProgressDialog pDialog;
	final String outputFileName = "schedule.pdf";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule);
		String PATH = Environment.getExternalStorageDirectory()+ "/download/";
		File file = new File(PATH);
		file.mkdirs();
		File outputFile = new File(file , outputFileName);


		Button buttonSchedule = (Button)findViewById(R.id.schedulebutton);
		btnShowProgress = (Button) findViewById(R.id.schedulebutton);
		final Button btnswitch = (Button) findViewById(R.id.button1);
		try{
			if(outputFile.exists())
				btnswitch.setText("Open Downloaded Schedule");
			else
				btnswitch.setText("Open Schedule");
		}catch(Exception e)
		{

		}
		buttonSchedule.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				// TODO Auto-generated method stu
				final String apkurl = "http://tathva.org/2012/files/t12_schedule.pdf";

				new DownloadFileUrl().execute(apkurl);

			}});
		btnswitch.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				if(btnswitch.getText()=="Open Downloaded Schedule")
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
				else
				{
					Intent myIntent = new Intent(Schedule.this, image_schedule.class);
					Schedule.this.startActivity(myIntent); 
				}
			}
		});



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
		default:
			return null;
		}
	}


	public class DownloadFileUrl extends AsyncTask<String, String, String> {

		Context context;
		String urls;
		String fileName = "schedule.pdf";

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
				URL url =new URL(urls[0]);
				HttpURLConnection c = (HttpURLConnection) url.openConnection();
				c.setRequestMethod("GET");
				c.setDoOutput(true);
				c.connect();
				if (outputFile.exists())
				{
					outputFile.delete();
				}

				int lengthOfFile = c.getContentLength();
				FileOutputStream fos = new FileOutputStream(outputFile);
				InputStream is = c.getInputStream();

				byte[] buffer = new byte[1024];
				int len1 = 0;
				int total=0;
				int percent=0;
				while ((len1 = is.read(buffer)) != -1) {
					total+=len1;
					fos.write(buffer, 0, len1);
					percent=total*100/lengthOfFile;

					this.publishProgress(""+percent);
				}
				fos.close();
				is.close();
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

			dismissDialog(progress_bar_type);
			if(result=="done")
			{
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setDataAndType(Uri.fromFile(new File(Environment
						.getExternalStorageDirectory()
						+ "/download/"
						+ fileName)),
						"application/pdf");
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				Schedule.this.startActivity(intent);
			}
			else if (result=="error") {
				Toast.makeText(Schedule.this.getApplicationContext(), "Update error!",
						Toast.LENGTH_SHORT).show();
			}

		}




	}




}

