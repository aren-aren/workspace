package com.start.study3.ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class NameCardManager {
	Scanner scan = new Scanner(System.in);
	
	public NameCard[] add(NameCard[] old) {

		NameCard nameCard = new NameCard();
		
		System.out.println("번호 : ");
		nameCard.setNumber(scan.nextInt());
		
		System.out.println("이름 : ");
		nameCard.setName(scan.next());
		
		System.out.println("회사 : ");
		nameCard.setCompany(scan.next());
		
		System.out.println("직책 : ");
		nameCard.setPosition(scan.next());
		
		System.out.println("주소 : ");
		nameCard.setAddress(scan.next());
		
		System.out.println("전화번호 : ");
		nameCard.setPhoneNumber(scan.next());
		
		System.out.println("이메일 : ");
		nameCard.setMail(scan.next());
		
		
		NameCard[] newNameCards;
		if(old == null) {
			newNameCards = new NameCard[1];
			newNameCards[0] = nameCard;
			return newNameCards;
		}
		
		newNameCards = new NameCard[old.length + 1];
		for(int i = 0 ; i < old.length ; ++i) {
			newNameCards[i] = old[i];
		}
		newNameCards[old.length] = nameCard;
		
		return newNameCards;
	}
	
	

	public NameCard[] remove(NameCard[] nameCards) {
		if(nameCards == null || nameCards.length == 0) {
			//if문 안에서 앞에서 결과가 나오면 뒤는 검사X
			System.out.println("명함이 비었습니다.");
			return nameCards;
		}
		
		System.out.println("삭제할 명함의 번호 : ");
		int removeNum = scan.nextInt();
		
//		int count = 0;
		
		boolean isFind = false;
		for(int i = 0 ; i < nameCards.length ; ++i) {
			if(nameCards[i].getNumber() == removeNum) {
//				count++;
				isFind = true;
				continue;
			}
			
			if((!isFind) && (i == nameCards.length-1)) {
				System.out.println("삭제하려는 번호의 명함이 없습니다.");
				return nameCards;
			}
			
//			nameCards[i-count*(isFind?1:0)] = nameCards[i];
			
			nameCards[i-(isFind?1:0)] = nameCards[i];
		}
		
//		NameCard[] newNameCard = new NameCard[nameCards.length-count];
		
		NameCard[] newNameCard = new NameCard[nameCards.length-1];
		
		for(int i = 0 ; i < newNameCard.length ; ++i) {
			newNameCard[i] = nameCards[i];
		}
		
		return newNameCard;
	}
	
}
