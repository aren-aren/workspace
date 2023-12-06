package com.start.study3.school;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체 생성
//		//클래스명 변수명 = new 클래스명();
		
		
//		Student stu = new Student();
//		stu.name = "myname";
//		stu.num = 1;
//		stu.grade = 3.1;
//		
//		Student stu2 = new Student();
//		stu.name = "myname";
//		stu.num = 1;
//		stu.grade = 3.1;
//		
//		Student stu3 = new Student();
//		System.out.println(stu3.name);
//		System.out.println(stu3.num);
//		
//		Student[] students = {stu, stu2};
//		
//		System.out.println(students[0].grade);
		
		
		//학생의 수를 입력받아서 학생의 정보 입력받기
		System.out.println("학생의 수 입력");
		int num = scan.nextInt();
		
		Student[] students = new Student[num];
		for(int i = 0 ; i < num ; ++i) {
			students[i] = new Student();
			System.out.println("학생 이름 : ");
			students[i].name = scan.next();
			System.out.println("학생 번호 : ");
			students[i].num = scan.nextInt();
			System.out.println("학생 학점 : ");
			students[i].grade = scan.nextDouble();
		}
		
		for(int i = 0 ; i < num ; ++i) {
			System.out.printf("번호: %d 이름: %s 학점: %.1f \n",students[i].num, students[i].name, students[i].grade);
		}
	}

}
