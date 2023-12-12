package com.start.study3.cars;


public class CarMain {

	public static void main(String[] args) {
		
		
		Car car = new Car();
		car.info();
		Car car2 = new Car("white");
		car2.info();
		Car car3 = new Car("K9", "red");
		car3.info();
	}

}
