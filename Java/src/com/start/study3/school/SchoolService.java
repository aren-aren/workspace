package com.start.study3.school;

import java.util.Scanner;

public class SchoolService {
	
	public Student[] makeStudents() {
		//학생 수를 입력받아서 수만큼 학생 정보 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력할 학생 수:");
		int n = scan.nextInt();
		
		Student[] students = new Student[n];
		for(int i = 0 ; i < students.length ; ++i) {
			Student student = new Student();
			
			System.out.println("학생의 이름 : ");
			student.name = scan.next();
			System.out.println("학생의 번호 : ");
			student.num = scan.nextInt();
			System.out.println("학생의 학점 : ");
			student.grade = scan.nextDouble();
			
			students[i] = student;
		}
		
		return students;
	}
	
	public Student searchStudent(Student[] students) {
		Student target = null;
		
		return target;
	}
}
