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
		
		int input = 0;
		int count = 0;
		for(int i = 0 ; i < 90 ; ++i) {
			if(i%30 == 0) {
				System.out.printf("1.단발 2.점사 (남은 탄창 : %d)\n",(90-i)/30);
				input = sc.nextInt();
			}
			
			String shot = "탕";
				
			if(input == 2) {
				shot = "탕탕탕";
				i+=2;
			}
			
			int luckey = (int)Math.ceil(100*Math.random());
				
			count++;
			System.out.println(luckey + " : " + shot);
			
			if(luckey == 100) {
				System.out.println("탄창을 얻었습니다. (탄창 + 1)");
				i -= 30;
			}
			
			if((i+930)%30 == 29) {
				System.out.println(count + "번 쐈습니다.");
				
				if(i != 89) {
					System.out.println("리로드 중..");
				}
			}
		}
		
		System.out.println("끝");
	}

}
