package com.start.study3.rpg;

public class RpgMain {

	public static void main(String[] args) {
		Magician magician = new Magician();
		magician.level = 15;
		magician.exp = 44;
		magician.gold = 3000;
		magician.skill = "파이어볼";
		
		System.out.println("레벨 : " + magician.level);
		System.out.println("경험치 : " + magician.exp);
		System.out.println("골드 : " + magician.gold);
		System.out.println("스킬 : " + magician.skill);
	}

}
