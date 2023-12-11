package com.start.study3.study;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test;
		
		test = new Test();
		test.t1();
		
		int n =10;
		test.t2(n,23);
		System.out.println(n);
		
		Human human = new Human();
		human.age = 20;
		
		test.t3(human);
		System.out.println(human.age);
		
		int[] ar = new int[3];
		ar[0] = 3;
		ar[1] = 2;
		ar[2] = 6;
		
		test.t4(ar);
		
		
	}

}
