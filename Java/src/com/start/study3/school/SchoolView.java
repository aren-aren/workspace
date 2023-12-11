package com.start.study3.school;

public class SchoolView {

	public void view(Student[] students) {
		for(int i = 0 ; i < students.length ; ++i) {
			System.out.println("번호 : " + students[i].num + " 이름 : " + students[i].name + " 학점 : " + students[i].grade);
		}
	}
}
