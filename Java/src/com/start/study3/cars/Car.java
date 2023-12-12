package com.start.study3.cars;

public class Car {
	
	String company;
	String name;
	String fuel;
	String color;
	int price;
	Engine engine;
	
	//기본 생성자, 디폴트 생성자, 빈 생성자
	public Car() {
		this("Black");
	}
	
	public Car(String color) {
		this.company = "Kia";
		this.name = "K5";
		this.fuel = "Gas";
		this.color = color;
		this.price = 3000;
//		this.cc = 2000;
	}
	
	public Car(String name, String color) {
		this.company = "Kia";
		this.name = name;
		this.fuel = "Gas";
		this.color = color;
		this.price = 3000;
//		this.cc = 2000;
	}
	
	public void info() {
		System.out.println("------------------------------");
		System.out.println("Company : " + this.company);
		System.out.println("Name : " + this.name);
		System.out.println("Fuel : " + this.fuel);
		System.out.println("Color : " + this.color);
		System.out.println("Price : " + this.price);
//		System.out.println("CC : " + this.cc);
		System.out.println("------------------------------");
	}
}
