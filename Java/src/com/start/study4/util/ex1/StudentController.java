package com.start.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	private Scanner scan;
	private StudentService studentService;
	private StudentView studentView;
	
	public StudentController() {
		this.scan = new Scanner(System.in);
		this.studentService = new StudentService();
		this.studentView = new StudentView();
	}

	public void start() {
		
		ArrayList<StudentDTO> studentList = this.studentService.init();
		
		while(true) {
			System.out.println("1. 학생 정보 출력");
			System.out.println("2. 학생 정보 검색");
			System.out.println("3. 학생 정보 추가");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.println("-------------------");
			
			int select = scan.nextInt();
			
			if(select == 1) {
				studentView.view(studentList);
			} else if(select == 2) {
				
			} else {
				break;
			}
		}
	}
}
