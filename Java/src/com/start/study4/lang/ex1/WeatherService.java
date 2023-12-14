package com.start.study4.lang.ex1;

import java.util.Arrays;

public class WeatherService {

	private String datas;

	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
	}
	
	public WeatherData[] init() {
		String[] dataArr = datas.split("[\\.,-]");
		int len = dataArr.length/4;
		
		WeatherData[] weathers = new WeatherData[len];
		
		for(int i = 0 ; i < len ; ++i) {
			weathers[i] = new WeatherData();
			weathers[i].setRegion(dataArr[i*4 + 0]);
			weathers[i].setTemperature(dataArr[i*4 + 1]);
			weathers[i].setWeather(dataArr[i*4 + 2]);
			weathers[i].setHumidity(dataArr[i*4 + 3]);
		} 
		
//		Arrays.stream(weathers)
//			.map(WeatherData::toString)
//			.forEach(System.out::println);
		
		return weathers;
	}
}
