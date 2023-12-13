package com.start.study3.ex;

public class NameCard {
	private int number;
	private String name;
	private String position;
	private String company;
	private String address;
	private String phoneNumber;
	private String mail;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void info() {
		System.out.println("번호 \t: " + this.number);
		System.out.println("이름 \t: " + this.name);
		System.out.println("회사 \t: " + this.company);
		System.out.println("직책 \t: " + this.position);
		System.out.println("주소 \t: " + this.address);
		System.out.println("전화번호: " + this.phoneNumber);
		System.out.println("이메일 \t: " + this.mail);
	}
}
