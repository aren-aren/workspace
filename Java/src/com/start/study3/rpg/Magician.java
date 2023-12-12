package com.start.study3.rpg;

public class Magician extends Character {
	
	private int mp;
	
	public void info() {
		super.superInfo();
		System.out.println("이름 : " + this.getName() + " HP : " + this.getHp() + " MP : " + this.getMp());
	}
	
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void t1() {
		System.out.println("test Method");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}
