package com.start.study4.lang.ex1;

public class WeatherData {
	private String region;
	private String temperature;
	private String weather;
	private String humidity;
	
	public WeatherData() {
		
	}
	
	public WeatherData(String region, String temperature, String weather, String humidity) {
		this.region = region;
		this.temperature = temperature;
		this.weather = weather;
		this.humidity = humidity;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "지역 : " + this.region + "\t 기온 : " + this.temperature + "\t 날씨 : " + this.weather + "\t 습도 : " + this.humidity;
	}
	
	
}
