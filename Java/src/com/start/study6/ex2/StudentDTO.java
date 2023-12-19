package com.start.study6.ex2;

public class StudentDTO {
	private String name;
	private int num;
	private int korean;
	private int english;
	private int math;
	private int sum;
	private double ave;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
		return "번호 : " + this.num + "\t이름 : " + this.name + "\t국어 : " + this.korean + "\t영어 : " + this.english + "\t수학 : " + this.math + "\t총점 : " + this.sum + "\t평균 : " + this.ave;
	}
}
