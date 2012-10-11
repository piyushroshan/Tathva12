package com.work;

import java.io.*;
import java.net.*;
import org.apache.http.util.ByteArrayBuffer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.*;
import android.os.*;
import android.util.*;


import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Update_Tathva extends Activity {

	private Integer version;
	Integer myVersion;
	private boolean alreadyDone;
	private String myTag;


	@SuppressWarnings("unused")
	private void checkVersion()
	{
		//String medString = "http://athena.nitc.ac.in/~roshan/tathva/tathva.txt";
		String medString = "http://athena.nitc.ac.in/~roshan_bcs10/tathva/tathva.txt";
		try {
			URL url = new URL(medString);
			InputStream i = (InputStream) url.openStream();
			InputStreamReader isr = new InputStreamReader(i);
			BufferedReader br= new BufferedReader(isr);
			String strVersion = br.readLine(); // Read the current version from the text file online.
			version = Integer.valueOf(strVersion);
		}
		catch (Exception e)
		{
			//Handle any problems here
		}



		final Handler handler = new Handler() 
		{
			public void handleMessage(Message msg) 
			{  
				Log.i(myTag,String.valueOf(msg.what));	
				if (msg.what == 0 && alreadyDone == false)
				{
					alreadyDone = true;

					Log.i(myTag, myVersion + "   " + version);
					if(myVersion < version) 
					{
						AlertDialog.Builder builder = new AlertDialog.Builder(Update_Tathva.this);
						builder.setMessage("There is a newer version. Would you like to install it now?")
						.setCancelable(false)
						.setPositiveButton("Yes", new DialogInterface.OnClickListener() 
						{
							public void onClick(DialogInterface dialog, int id) 
							{
								Uri uri = Uri.parse("http://127.0.0.1/tathva/Tathva2012.apk");
								//Uri uri = Uri.parse("http://athena.nitc.ac.in/~roshan/tathva/tathva.apk");
								startNextMatchingActivity(new Intent(Intent.ACTION_VIEW, uri));
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
					}
				}else if(msg.what == 1 && alreadyDone == false)
				{
					alreadyDone = true;
					//It took to long to read from the network so we aborted.
				}
			}
		};

		Thread checkUpdate = new Thread() {  
			public void run() {
				handler.sendEmptyMessageDelayed(1, 3500); //If it takes too long just give up for now
				checkVersion();	
				handler.sendEmptyMessage(0);
			}
		};
		checkUpdate.start();
	}
}

