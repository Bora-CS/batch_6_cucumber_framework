package com.bora.helpers;

public class UtilityLibrary {

	public static String getTimeStamp() {
		
	TimeStamp timeStamp = new TimeStamp(System.currentTimeMillis());
	SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
	Date date = new Date();
	String timeStamp = dateFormat.format(date);
	}
}
