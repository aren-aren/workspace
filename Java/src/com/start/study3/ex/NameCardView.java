package com.start.study3.ex;

import java.util.Scanner;

public class NameCardView {
	public void showMinimal(NameCard[] nameCards) {
		for(int i = 0 ; i < nameCards.length ; ++i) {
			System.out.println("번호 : " + nameCards[i].getNumber() + " 회사명 : " + nameCards[i].getCompany() + " 이름 : " + nameCards[i].getName());
		}
	}

	public void showMaximal(NameCard[] nameCards) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 0 ; i < nameCards.length ; ++i) {
			if(num == nameCards[i].getNumber()) {
				nameCards[i].info();
			}
		}
		
		
	}
}
