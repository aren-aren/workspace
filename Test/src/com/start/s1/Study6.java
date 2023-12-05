package com.start.s1;

import java.util.Scanner;

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력하세요.");
//		String yourId = sc.next();
//		String id ="abc";
//		String pw = "ppp";
		
		int yourId = sc.nextInt();
		int id = 1234;
		
		if(id == yourId) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("일치하지 않습니다.");			
		}
	}

}
