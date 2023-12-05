package com.start.study1;

import java.util.Scanner;

public class Study2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		//아이디와 패스워드를 입력받아 로그인 성공 유무를 판단
		
		String check = "로그인 실패";
		for(int i = 1 ; i <= 5 ; ++i) {
			System.out.println("아이디 : ");
			int userId = sc.nextInt();
			System.out.println("패스워드 : ");
			int userPw = sc.nextInt();
			
			if(id == userId && pw == userPw) {
				check = "로그인 성공";
				break;
			}
		}
		
		System.out.println(check);
	}

}
