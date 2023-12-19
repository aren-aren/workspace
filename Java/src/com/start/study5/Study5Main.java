package com.start.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int num = scan.nextInt();

			System.out.println(num);
//			String str = null;
//		
//			System.out.println(str.toString());
		
			int[] arr = new int[2];
			arr[3] = 30;	
		
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("123");
		} catch (RuntimeException e) {
			System.out.println("Exception 발생");
		} catch (Exception e) {
			
		} finally {
			
		}
		
		
		System.out.println("정상 진행");
		int a = 10;
		 a /= 0;
		
		Test t = new Test();
		ArrayList<Integer> ar = null;
		t.t1(ar);
		
		System.out.println("종료합니다.");
	}

}
