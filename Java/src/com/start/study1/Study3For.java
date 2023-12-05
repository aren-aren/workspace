package com.start.study1;

import java.util.Scanner;

public class Study3For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0-59분
		//0-59초
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분 : ");
		int inputMin = sc.nextInt();
		System.out.println("초 : ");
		int inputSec = sc.nextInt();
		
		boolean timeout = false;
		for(int min = 0 ; min < 60 ; ++min) {
			for(int sec = 0 ; sec < 60 ; ++sec) {
				
				System.out.printf("%d : %d\n",min, sec);
				
				if(min == inputMin && sec == inputSec) {
					System.out.printf("%d분 %d초 입니다.\n",min, sec);
					timeout = true;
					break;
				}
				
			}
			
			if(timeout) {
				break;
			}
			
		}
	}

}
