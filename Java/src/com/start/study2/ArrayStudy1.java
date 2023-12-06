package com.start.study2;

import java.util.Scanner;

public class ArrayStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num;
		int[] ar = new int[3];
		
		String[] strArr = new String[4];
		
		for(int i = 0 ; i < strArr.length ; ++i) {
			strArr[i] = scan.next();
		}
		
		/* 자바가 사용하는 메모리 영역
		 * 메서드 영역
		 * 
		 * 
		 * 스택 영역
		 * 메서드 내에서 선언된 변수들이 담기는 공간
		 * int num <-
		 * int[] ar <- 스택 영역에 만들어짐 
		 * 레퍼런스 변수는 힙 영역의 실제 데이터가 들어있는 메모리의 주소를 가지고 있음
		 * 
		 * 힙 영역
		 * new <- 메모리를 할당받았을 때 실제 데이터가 저장되는 곳
		 * [I@ ??? <- sysout(배열) 시 나오는 값
		 * [ <- 배열
		 * I <- int 형
		 * 
		 */
	}

}
