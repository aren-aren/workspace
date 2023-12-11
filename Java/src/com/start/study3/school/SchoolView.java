package com.start.study3.school;

public class SchoolView {
	
	public void view(String message) {
		System.out.println(message);
	}

	public void view(Student[] students) {
		for(int i = 0 ; i < students.length ; ++i) {
			this.view(students[i]);
			//student.printInfo();
		}
	}

	public void view(Student student) {
		student.printInfo();
	}
}
