package com.start.study4.util;

import java.util.Calendar;

public class StudyCalendar2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2= Calendar.getInstance();
		
		cal2.set(1994,8,7);
		
		System.out.println(cal.getTime());
		System.out.println(cal2.getTime());

		long t1 = cal.getTimeInMillis();
		long t2 = cal2.getTimeInMillis();
		
		System.out.println(t1);
		System.out.println(t2);
		
		long result = t1 - t2;
		result /= 1000*60*60*24;
		result /= 365;
		System.out.println(result);
		
		
	}

}
