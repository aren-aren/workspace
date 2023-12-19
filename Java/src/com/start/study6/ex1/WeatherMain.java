package com.start.study6.ex1;

import java.util.ArrayList;

public class WeatherMain {

	
	public static void main(String[] args) {
		WeatherDAO weatherDAO = new WeatherDAO();
		
		ArrayList<WeatherDTO> weathers;
		try {
			weathers = weatherDAO.getWeathers();
			
			weathers.stream().forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
