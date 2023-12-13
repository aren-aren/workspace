package com.start.study3.himart;

public class Television extends Product{
	private String color;
	

	public Television() {
		color = "black";
		this.setBrand("LG");
		this.setSize(100);
		this.setPrice(1000);
		this.setPoint(25);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}    
