package com.start.s1;

public class Study4 {
	public static void main(String[] args) {
		int total = 1;
		int money = 50000;
		int change = money - total;
		
		int restChange = change;

		//만원짜리 개수
		int man = 0;
		man = restChange/10000;
		restChange %= 10000;
		//천원짜리 개수
		int chun = 0;
		chun = restChange/1000;
		restChange %= 1000;
		
		int obak = 0;
		obak = restChange/500;
		restChange %= 500;
		
		//백원짜리 개수
		int bak = 0;
		bak = restChange/100;
		restChange %= 100;
		//십원짜리 개수
		int sip = 0;
		sip = restChange/10;
		restChange %= 10;
		
		System.out.println(change);
		System.out.println("만원 : " + man);
		System.out.println("천원 : " + chun);
		System.out.println("오백원 : " + obak);
		System.out.println("백원 : " + bak);
		System.out.println("십원 : " + sip);
	}
}
