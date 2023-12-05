package com.start.study1;

import java.util.Scanner;

public class Study1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요.");
		int num = sc.nextInt();
		
		//입력받은 정수의 약수
		for(int i = 1 ; i < num ; ++i) {
			if(num%i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
		
	}

}
