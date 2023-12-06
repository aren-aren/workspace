package com.start.study2;

public class ArrayStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,4,5};
		
		int[] ar2 = ar;
		System.out.println(ar2[0]);
		
		ar[0] = 100;
		System.out.println(ar2[0]);
		
		int[] ar3 = {ar[0],ar[1]};
		ar = ar3;
		
		for(int i = 0 ; i < ar.length ; ++i) {
			System.out.println(ar[i]);
		}
	}

}
