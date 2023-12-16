package com.start.study4.util;

import java.util.ArrayList;

import com.start.study4.lang.ex1.WeatherData;

public class StudyList {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add(1,new WeatherData("서울", "23", "clear", "10"));
		
		for(int i = 0 ; i < ar.size(); ++i) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		
		ar.set(0, "31");
		ar.remove(2);
		ar.remove("31");
		ar.clear();
		for(int i = 0 ; i < ar.size(); ++i) {
			System.out.println(ar.get(i));
		}
		
		
	}

}
