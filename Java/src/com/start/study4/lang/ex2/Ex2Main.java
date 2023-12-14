package com.start.study4.lang.ex2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Ex2Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호 입력 : ");
		//이름, 주민등록번호
//		String[] numArr =  scan.next().replace("-", "").split("");
//		int[] userNum = new int[numArr.length];
		
		int[] userNum = Arrays.stream(scan.next().replace("-", "").split(""))
								.mapToInt(Integer::parseInt)
								.peek(System.out::println)
								.toArray();
		
//		for(int i = 0 ; i < numArr.length ; ++i) {
//			userNum[i] = Integer.parseInt(numArr[i]);
//		}
		
//		System.out.println(Arrays.toString(userNum));
		
		//1. 남자 여자 구별
		if(userNum[6] == 2 || userNum[6] == 4) {
			System.out.println("여자입니다.");
		} else if (userNum[6] == 1 || userNum[6] == 3) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("누구세요???");
		}
		
		
		//2. 나이
		int year = 10*userNum[0] + userNum[1];
		int age = 23-year;
		age = (age < 0)? 100+age : age;
		
		System.out.println(age + "살 입니다.");
		
		
		//3. 태어난 계절
		int month = 10*userNum[2] + userNum[3];
		String[] season = "겨울,겨울,봄,봄,봄,여름,여름,여름,가을,가을,가을,겨울".split(",");
		System.out.println(season[month-1] + "에 태어났습니다.");
		
		
		//4. 주민 번호가 타당한지
		//   9   9   1   2   2   5  -  1  2  3  4  5  6  7
		//   2   3   4   5   6   7     8  9  2  3  4  5
		//	총합 구하기 -> 총합을 11로 나눈 나머지
		//	11에서 나머지를 뺀 결과를 체크번호와 비교
		// 	만약 나머지가 두자리라면 그 나머지를 10으로 나눈 나머지를 구한다
		//  그 나머지를 체크번호와 일치하는지 확인
		int[] checkNum = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int checkSum = 0;
		for(int i = 0 ; i < checkNum.length ; ++i) {
			checkSum += checkNum[i] * userNum[i];
		}
		
		checkSum = 11 - checkSum%11;
		
		if(checkSum >= 10) {
			checkSum %= 10;
		}
		
		if(userNum[userNum.length-1] == checkSum) {
			System.out.println("올바른 주민번호 입니다.");
		} else {
			System.out.println("올바르지 않은 주민번호 입니다.");
		}
	}

}
