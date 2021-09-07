package com.bora.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilityLibrary {

	public static String getTimeStamp() {
		String pattern = "yyyy.MM.dd.HH.mm.ss";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = new Date();
		String timeStamp = dateFormat.format(date);
		return timeStamp;
	}
}
