package com.start.study3.study;

public class Test {
	
	public void t1() {
		System.out.println("T1 Method");
	}
	
	public void t2(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		num1 = 30;
	}
	
	public void t3(Human human) {
		if(human.age > 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");			
		}
		
		human.age = 500;
	}
	
	public void t4(int[] ar) {
		for(int i = 0 ; i < ar.length ; ++i) {
			System.out.println(ar[i]);
		}
	}
}
