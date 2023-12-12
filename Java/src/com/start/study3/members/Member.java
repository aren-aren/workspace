package com.start.study3.members;

public class Member {
	//비만관리 회원프로그램
	private String name;
	private double weight;
	private double height;
	private int age;
	

	public Member() {}
	
	public Member(double weight) {
		this.weight = weight;
	}
	
	//데이터 입력
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		if(weight >= 0 && weight <= 300.0) {
			this.weight = weight;			
		} else {
			this.weight = 60.0;
		}
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//데이터 출력
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getAge() {
		return age;
	}
	
}
