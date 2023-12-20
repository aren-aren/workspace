package com.start.study6.ex1;

public class WeatherMain {

	
	public static void main(String[] args) {
		
		try {
			new WeatherController().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
