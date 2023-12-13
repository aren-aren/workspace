package com.start.study3.rpg;

import com.start.study3.rpg.weapon.Axe;
import com.start.study3.rpg.weapon.Weapon;

public class Warrior extends Character {
	
	private Weapon weapon;
	
//	private Axe axe;
//	
//	public Axe getAxe() {
//		return axe;
//	}
//
//	public void setAxe(Axe axe) {
//		this.axe = axe;
//	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Warrior() {
		super();
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		this.weapon.attack();
	}
	
}
