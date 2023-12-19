package com.start.study5;

import java.util.Scanner;

public class StudyException {
	public void t1() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		
		int n = scan.nextInt();
		int num = 9;
		
		System.out.println(num/n);
		
		StudyException2 se2 = new StudyException2();
		se2.t2();
	}
	
	public void t2() throws Exception {
		int n1 = 56;
		int n2 = 60;
		
		int r1 = n1 + n2;
		int r2 = n1 - n2;
		
		if(r1 > 99) {
			throw new MyException("그런 숫자는 모른다.");
		}
		
		if(r2 < 0) {
			throw new MyException("0보다 작은 숫자는 모른다");
		}
		
		System.out.println(r1);
		System.out.println(r2);
		
	}
}
