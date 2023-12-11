package com.start.study3.rpg;

public class Magician {
	String name;
	int hp;
	int mp;
	
	public void info() {
		//String name = "abc";
		//멤버메서드 내에서 멤버 변수를 접근해서 사용 가능
		System.out.println(this);
		System.out.println("이름 : " + this.name + " HP : " + this.hp + " MP : " + this.mp);
		
		this.t1();
		t1();
	}
	
	public void t1() {
		System.out.println("test Method");
	}
}
