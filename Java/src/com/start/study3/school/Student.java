package com.start.study3.school;

public class Student {
	//멤버변수 선언
	// 접근지정자 [그외지정자] 데이터타입 변수명
	String name;
	int num;
	double grade;
	
	//멤버메서드 선언
	public void printInfo() {
		System.out.println("번호 : " + this.num + " 이름 : " + this.name + " 학점 : " + this.grade);
	}
}
