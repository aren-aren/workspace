package com.start.study3.cards;

public class CardMain {

	public static void main(String[] args) {
		Card card = new Card(10,1,"Dia","Red");
		card.info();
		Card card2 = new Card(10,1,"Heart","Red");
		card2.info();
		
		Card.size=5;
		card.info();
		card2.info();
		
		//클래스 변수
		//클래스명.변수명
		
//		Card.size=50;
	}

}
