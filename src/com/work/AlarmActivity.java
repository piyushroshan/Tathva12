package com.work;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class AlarmActivity extends Activity {
/*
	 // get a Calendar object with current time
	 Calendar cal = Calendar.getInstance();
	private Context ctx;
	 // add 5 minutes to the calendar object
	 cal.add(Calendar.MINUTE,5);
	 Intent intent = new Intent(ctx, AlarmReceiver.class);
	 intent.putExtra("Hello","hi");
	 // In reality, you would want to have a static variable for the request code instead of 192837
	 PendingIntent sender = PendingIntent.getBroadcast(this, 192837, intent, PendingIntent.FLAG_UPDATE_CURRENT);
	 
	 // Get the AlarmManager service
	 AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
	 am.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), sender);
	 */
}
