package com.start.study3.ex;

import java.util.Scanner;

public class NameCardController {
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		NameCardManager nameCardManager = new NameCardManager();
		NameCardView nameCardView = new NameCardView();
		NameCard[] nameCards = new NameCard[20];
		
		for(int i = 0 ; i < 20 ; ++i) {
			nameCards[i] = new NameCard();
			nameCards[i].setName(i + "");
			nameCards[i].setNumber(i);
			nameCards[i].setAddress(i+ "");
			nameCards[i].setCompany(i+ "");
			nameCards[i].setMail(i+ "");
			nameCards[i].setPhoneNumber(i+ "");
			nameCards[i].setPosition(i+ "");
		}
		
		while(true) {
			System.out.println("-----  메뉴  -----");
			System.out.println("1. 명함 추가");
			System.out.println("2. 명함 수정");
			System.out.println("3. 명함 삭제");
			System.out.println("4. 명함 목록");
			System.out.println("5. 명함 디테일");
			System.out.println("6. 프로그램 종료");
			System.out.println("------------------");
			
			int select = scan.nextInt();
			
			if(select == 6) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			if(select == 1) {
				System.out.println("1. 명함 추가 메뉴입니다.");
				nameCards = nameCardManager.add(nameCards);
			}
			
			if(select == 2) {
				System.out.println("2. 명함 수정 메뉴입니다.");
			}
			
			if(select == 3) {
				System.out.println("3. 명함 삭제 메뉴입니다.");
				nameCards = nameCardManager.remove(nameCards);
			}
			
			if(select == 4) {
				System.out.println("4. 명함 목록 메뉴입니다.");
				nameCardView.showMinimal(nameCards);
			}
			
			if(select == 5) {
				System.out.println("5. 명함 디테일 메뉴입니다.");
				nameCardView.showMaximal(nameCards);
			}
		}
		
	}
}
