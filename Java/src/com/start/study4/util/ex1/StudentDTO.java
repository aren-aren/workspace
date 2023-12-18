package com.start.study4.util.ex1;

public class StudentDTO {
	//DTO : Data Transfer Object
	//VO  : Value Object
	
	private String name;
	private int num;
	private int korean;
	private int english;
	private int math;
	
	private int sum;
	private Double ave;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}


	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAve() {
		return ave;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + this.name   + "\t 번호 : " + this.num+ "\t 국어 : " + this.korean + "\t 영어 : "+ this.english + "\t 수학 : " + this.math + "\t 총점 : " + this.sum + "\t 평균 : " + this.ave;
	}
	
}
