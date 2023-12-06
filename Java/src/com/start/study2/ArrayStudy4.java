package com.start.study2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		/* 		메뉴
		 * 1. 학생 정보 생성
		 * 		- 학생 수를 입력 받음
		 * 		- 학생 수 만큼 이름, 번호, 학점을 입력받음
		 * 2. 학생 정보 출력
		 * 3. 학생 정보 검색
		 * 		- 검색할 학생 번호를 입력 받아서 정보 출력
		 * 4. 성적순 출력
		 * 5. 종료
		 * 
		 */
		
		
		String[] stuName = {"apple", "banana", "cytrus" , "durian", "egg"};
		int[] stuNum = { 1 , 2 , 3 , 4 , 5 };
		double[] stuGrade = { 1.5 , 3.9 , 2.4 , 2.1 , 4.0 };
		
		while(true) {
			System.out.println("1. 학생 정보 생성 2. 학생 정보 출력 3. 학생 정보 검색 4. 성적 순 출력 5. 종료");
			int select = scan.nextInt();
			int len = stuName.length;
			
			// 5번
			if(select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 1번
			if(select == 1) {
				System.out.println("입력할 학생 수 : ");
				int num = scan.nextInt();
				String[] newStuName = new String[len + num];
				int[] newStuNum = new int[len + num];
				double[] newStuGrade = new double[len + num];
				
				for(int i = 0 ; i < len ; ++i) {
					newStuName[i] = stuName[i];
					newStuNum[i] = stuNum[i];
					newStuGrade[i] = stuGrade[i];
				}
				
				for(int i = len ; i < len + num ; ++i) {
					System.out.println((i+1) + "번째 학생 이름 : ");
					newStuName[i] = scan.next();
					System.out.println((i+1) + "번째 학생 번호 : ");
					newStuNum[i] = scan.nextInt();
					System.out.println((i+1) + "번째 학생 학점 : ");
					newStuGrade[i] = scan.nextDouble();
				}
				
				stuName = newStuName;
				stuNum = newStuNum;
				stuGrade = newStuGrade;
				
				continue;
			}
			
			// 입력된 학생이 없을 때 조회가 안되게
			if(len == 0) {
				System.out.println("입력된 학생이 없습니다.");
				continue;
			}
			
			// 2번
			if(select == 2) {
				for(int i = 0 ; i < len ; ++i) {
					System.out.println("번호 : " + stuNum[i] + " , 이름 : " + stuName[i] + " , 학점 : " + stuGrade[i]);
				}
				continue;
			}
			
			// 3번
			if(select == 3) {
				System.out.println("검색할 학생의 번호 : ");
				int num = scan.nextInt();
				
				for(int i = 0 ; i < len ; ++i) {
					if(stuNum[i] == num) {
						System.out.println("번호 : " + stuNum[i] + " , 이름 : " + stuName[i] + " , 학점 : " + stuGrade[i]);
						break;
					}
					
					if(i == len -1) {
						System.out.println(num + "번 학생이 없습니다.");
					}
				}
			}
			
			// 4번
			if(select == 4) {
				//정렬
				int[] index = new int[len];
				for(int i = 0 ; i < len ; ++i) {
					index[i] = i;
				}
				
				for(int i = 0 ; i < len ; ++i) {
					//작은 값 찾기
					int idx = i;
					for(int j = i+1 ; j < len ; ++j) {
						if( stuGrade[index[idx]] > stuGrade[index[j]] ) {
							idx = j;
						}
					}
					
					//바꾸기
					//index[i] -> 현재값  index[idx] -> 작은 값
					int n = index[i];
					index[i] = index[idx];
					index[idx] = n;
					
				}
				
				//출력
				for(int i = 0 ; i < len ; ++i) {
					System.out.println("번호 : " + stuNum[index[i]] + " , 이름 : " + stuName[index[i]] + " , 학점 : " + stuGrade[index[i]]);
				}
			}
		}
		
	}

}
