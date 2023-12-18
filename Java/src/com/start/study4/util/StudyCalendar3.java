package com.start.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalendar3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getTime());

		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 30);
		
		System.out.println(calendar.getTime());
		
		System.out.println("-----------");
		
		calendar.set(2023,11, 31);
		
		System.out.println(calendar.getTime());
		
		calendar.roll(Calendar.DATE, 3);
		
		System.out.println(calendar.getTime());
		
		calendar.set(2023,11, 31);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println(calendar.getTime());
		
		System.out.println("-----------");
		//UUID
		
		String n = UUID.randomUUID().toString();
		System.out.println(n);
	}

}
