package com.start.study6.ex2;

public class StudentMain {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		
		try {
			var list = dao.getStudents();
			list.stream().forEach(System.out::println);
//			dao.insertDate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
