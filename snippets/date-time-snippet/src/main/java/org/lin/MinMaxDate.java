package org.lin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class MinMaxDate {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		System.out.println("Hello World");

		Date minDate = new Date(Long.MIN_VALUE);
		Date maxDate = new Date(Long.MAX_VALUE);
		System.out.println(minDate);
		System.out.println(maxDate);
		
		Date today = new Date();

		System.out.println(minDate);
		System.out.println(today);
		System.out.println(today.after(minDate));

		// String datetimeString = "20130108152909";
		String datetimeString = "20130108";
		int lengthOfDateTimeString = datetimeString.length();

		int year = lengthOfDateTimeString >= 4 ? Integer
				.parseInt(datetimeString.substring(0, 4)) : 0;
		int month = lengthOfDateTimeString >= 6 ? Integer
				.parseInt(datetimeString.substring(4, 6)) : 0;
		int day = lengthOfDateTimeString >= 8 ? Integer.parseInt(datetimeString
				.substring(6, 8)) : 0;
		int hour = lengthOfDateTimeString >= 10 ? Integer
				.parseInt(datetimeString.substring(8, 10)) : 0;
		int minute = lengthOfDateTimeString >= 12 ? Integer
				.parseInt(datetimeString.substring(10, 12)) : 0;
		int second = lengthOfDateTimeString >= 14 ? Integer
				.parseInt(datetimeString.substring(12, 14)) : 0;

		GregorianCalendar gregorianCalendar = new GregorianCalendar(year,
				month, day, hour, minute, second);

		Date creationTime = gregorianCalendar.getTime();
		
		System.out.println(creationTime);
		
		System.out.println(creationTime.after(minDate));
		
		String time = "Sun Jul 15 2012 12:22:00 GMT+03:00 (FLE Daylight Time)";
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss zzz");
		Date date = sdf.parse(time);
		System.out.println(date);
	}
}
