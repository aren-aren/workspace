package com.start.study3.rpg.weapon;

public interface Weapon {
	//상수
	final int level = 1;
	
	//추상 메서드
	public abstract void attack();
	
	//접근 지정자는 public만 가능
	//interface내에서 public abstract만 써야하며 생략 가능
	
}
