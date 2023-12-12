package com.start.study3.cards;

public class Card {
	
	public static int size;
	private int num;
	private String shape;
	private String color;
	
	public Card(int size, int num, String shape, String color) {
		Card.size = size;
		this.num = num;
		this.shape = shape;
		this.color = color;
	}
	
	public static void m1() {
		System.out.println(Card.size);
		//System.out.println(this.num);
	}
	
	public void info() {
		System.out.println("Num : " + this.num);
		System.out.println("Shape : " + this.shape);
		System.out.println("Color : " + this.color);
		System.out.println("Size : " + Card.size);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
