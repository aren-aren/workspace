package com.start.study3.rpg;

import com.start.study3.rpg.weapon.Axe;
import com.start.study3.rpg.weapon.Weapon;

public class RpgMain {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		warrior.setName("warara");

		Axe axe = new Axe();
		warrior.setWeapon(axe);
		
		Archer archer = new Archer();
		archer.attack();
		
		Magician magician = new Magician();
		
		Character c = magician;
		Character c2 = archer;
		Character c3 = warrior;
	}

}
