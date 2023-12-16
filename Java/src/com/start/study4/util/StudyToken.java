package com.start.study4.util;

import java.util.StringTokenizer;

public class StudyToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75".replaceAll("[\\.,]", "-");
		
		StringTokenizer st = new StringTokenizer(str,"-");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
