package com.start.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {

	public void view(ArrayList<StudentDTO> studentList) {
//		for(int i = 0 ; i < studentList.size() ; ++i) {
//			System.out.println(studentList.get(i));
//		}
		
		for(StudentDTO stu : studentList) {
			System.out.println(stu);
		}
	}
	
	public void view(StudentDTO student) {
		System.out.println(student);
	}
	
	public void view(String message) {
		
	}
}
