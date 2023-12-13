package com.start.study3.himart;

public class Cellphone extends Product{
	private int quality;
	private String model;
	
	
	public Cellphone() {
		this.model = "IPhone";
		this.quality = 2000;
		this.setBrand("Apple");
		this.setSize(8);
		this.setPrice(250);
		this.setPoint(6);
	}
	
	
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
