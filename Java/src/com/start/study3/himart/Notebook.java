package com.start.study3.himart;

public class Notebook extends Product {
	private String cpu;
	
	public Notebook() {
		this.cpu = "i5";
		this.setBrand("Samsung");
		this.setSize(17);
		this.setPrice(200);
		this.setPoint(5);
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
}
