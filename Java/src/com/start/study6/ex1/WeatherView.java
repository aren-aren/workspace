package com.start.study6.ex1;

import java.util.List;

public class WeatherView {
	
	public void view(List<WeatherDTO> list) {
		list.stream().forEach(System.out::println);
	}
	
	public void view(WeatherDTO weatherDTO) {
		if(weatherDTO == null) {
			System.out.println("지역을 찾지 못했습니다.");
			return;
		}
		System.out.println(weatherDTO);
	}
}
