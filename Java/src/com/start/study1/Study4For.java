package com.start.study1;

import java.util.Scanner;

public class Study4For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FPS
		//총알 : 30발 탄창 * 3
		
		//1. 단발 - 탕
		//2. 점사 - 탕탕탕
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; ++i) {
			System.out.println("1.단발 2.점사");
			int input = sc.nextInt();
			int count = 0;
			
			for(int j = 0 ; j < 30 ; ++j) {
				String shot = "탕";
				
				if(input == 2) {
					shot = "탕탕탕";
					j+=2;
				}
				
				count++;
				System.out.println(shot);
			}
			System.out.println(count + "번 쐈다");
			
			if(i != 2) {
				System.out.println("리로드 중..");
			}
		}
		
		System.out.println("끝");
	}

}
