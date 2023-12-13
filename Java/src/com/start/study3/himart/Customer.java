package com.start.study3.himart;

public class Customer {
	private int money;
	private int point;
	
	
	public Customer() {
		this.money = 2000;
		this.point = 100;
	}
	
	public void buy(Product p) {
		int price = p.getPrice();
		
		if(this.money < price) {
			System.out.println("돈이 부족합니다.");
			
			if(this.money + this.point < price) {
				return;
			}
			
			System.out.println("포인트를 사용하여 계산합니다.");
			
			if(this.point < price) {
				price -= this.point;
				this.point = 0;
			} else {
				this.point -= price;
				price = 0;
			}
		}
		
		this.money -= price;
		this.point += p.getPoint();
		
		System.out.println("잔액 : " + this.money + "만원 , 포인트 : " + this.point);
	}
}
