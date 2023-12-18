package com.start.study4.util;

import java.util.Calendar;

public class StudyCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month + 1);
		
		calendar.set(Calendar.YEAR, 2200);
		calendar.set(Calendar.MONTH, 12);
		System.out.println(calendar.getTime());
	}

}
