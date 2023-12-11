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
	
	//findByNum
	//학생번호를 입력받아서, 일치하는 학생이 있는지 검색
	//해당 학생을 리턴, 없으면 null을 리턴
	public Student findByNum(Student[] students) {
		Scanner scan = new Scanner(System.in);
		Student target = null;
		
		System.out.println("찾을 학생의 번호 : ");
		int num = scan.nextInt();
		
		for(int i = 0 ; i < students.length ; ++i) {
			if(students[i].num == num) {
				target = students[i];
				break;
			}
		}
		
		return target;
	}
	
	//addStudent
	//이름, 번호, 점수를 입력받아서 기본 배열에 추가한 효과
	public Student[] addStudent(Student[] students) {
		Scanner scan = new Scanner(System.in);
		
		Student[] newStudents = new Student[students.length+1];
		for(int i = 0 ; i < students.length ; ++i) {
			newStudents[i] = students[i];
		}
		
		newStudents[students.length] = new Student();
		
		System.out.println("추가할 학생의 이름 : ");
		newStudents[students.length].name = scan.next();
		System.out.println("추가할 학생의 번호 : ");
		newStudents[students.length].num = scan.nextInt();
		System.out.println("추가할 학생의 학점 : ");
		newStudents[students.length].grade = scan.nextDouble();
		
		return newStudents;
	}
}
