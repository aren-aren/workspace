package com.start.study3.rpg;

public class Archer extends Character {
	public Archer() {
		
	}
	
	//메서드 오버라이딩 -> 수정
	//상속받은 메서드를 자기자신에 맞게 내용을 재정의 하는 것
	//메서드 선언부는 동일하게, 내용만 변경
	public void attack() {
		System.out.println("화살 쏘기");
	}
}
