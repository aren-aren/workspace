package com.start.study3.star;

public class Marine {
	
	int hp;
	Gun gun;
	
	public Marine() {
		System.out.println("생성자");
		this.hp = 200;
		this.gun = new Gun();
	}
	
	public void move() {
		System.out.println("이동");
	}
}
