package com.start.s1;

public class Study3 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int num1 = 30;
		long num2 = 2148000000L;
		
		//num2 = num1;
		System.out.println(num1);
		num1 = (int)num2;
		
		System.out.println(num1);
		
		float f1 = num2;
		num2 = (long)f1;
		
		num1 = 33;
		num1 = num1 / 2;
		f1 = 33F/2;
		
		System.out.println(num1);
		System.out.println(f1);
		
		System.out.println("====================");
		
		int sum = 100;
		int count = 3;
		double result = 0;
		result = (double)sum / count;
		
		result = (int)(100*result)/(double)100;
		
		
		System.out.println(result);
		System.out.println("====================");
		
		char ch = 'A';
		int num = ch;
		num = num + 1;
		ch = (char)num;
		
		System.out.println(num);
		System.out.println(ch);
		
		System.out.println("프로그램 종료");
	}
	
}
