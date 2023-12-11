package com.start.study3.school;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolController {
	
	public void start() {
		Scanner scan= new Scanner(System.in);
		SchoolService schoolService = new SchoolService();
		SchoolView schoolView = new SchoolView();
		Student[] students = null;
		
		while(true) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 추가");
			System.out.println("5. 프로그램 종료");
			int select = scan.nextInt();
			
			//프로그램 종료
			if(select == 5) {
				break;
			}
			
			//학생 정보 입력
			if(select == 1) {
				students = schoolService.makeStudents();
				continue;
			}
			
			//입력된 학생이 없을 때 조회 불가
			if(students == null) {
				schoolView.view("입력된 학생이 없습니다.");
				continue;
			}
			
			//학생 정보 출력
			if(select == 2) {
				schoolView.view(students);
				continue;
			}
			
			//학생 정보 검색
			if(select == 3) {
				Student student = schoolService.findByNum(students);
				if(student != null) {
					schoolView.view(student);					
				} else {
					schoolView.view("찾는 학생이 없습니다.");
				}
				continue;
			}
			
			//학생 정보 추가
			if(select == 4) {
				students = schoolService.addStudent(students);
				continue;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
