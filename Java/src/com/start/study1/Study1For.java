package com.start.study1;

import java.util.Scanner;

public class Study1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요.");
		long num = sc.nextLong();
		
		//입력받은 정수의 약수
		for(long i = 1 ; i <= (long)Math.sqrt(num)/2 ; ++i) {
			if(num%i == 0) {
				System.out.println(i);
				System.out.println(num/i);
			}
		}
		
	}

}
