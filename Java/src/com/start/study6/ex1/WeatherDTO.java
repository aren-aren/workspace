package com.start.study6.ex1;

public class WeatherDTO {
	private String region;
	private String weather;
	private int temperature;
	private int humidity;
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	@Override
	public String toString() {
		return "지역 : " + this.region + "\t날씨 : " + this.weather + "\t기온 : " + this.temperature + "\t습도 : " + this.humidity;
	}
}
