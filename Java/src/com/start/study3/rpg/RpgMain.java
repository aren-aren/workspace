package com.start.study3.rpg;

public class RpgMain {

	public static void main(String[] args) {
		Magician magician = new Magician();
		magician.name="magic";
		magician.hp = 100;
		magician.mp = 200;
		
		magician.info();
		System.out.println(magician);
	}

}
