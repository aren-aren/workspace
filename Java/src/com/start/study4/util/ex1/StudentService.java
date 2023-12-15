package com.start.study4.util.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	private String info;
	private Scanner scan;

	public StudentService() {
		this.info = "winter-1-50-60-80";
		this.info += "-iu-2-85-94-75";
		this.info += "-karina-3-78-78-98";
		
		scan = new Scanner(System.in);
	}
	
	public ArrayList<StudentDTO> init() {
		ArrayList<StudentDTO> students = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(info,"-");
		
		while(st.hasMoreTokens()) {
			StudentDTO stu = new StudentDTO();
			stu.setName(st.nextToken());
			stu.setNum(Integer.parseInt(st.nextToken()));
			
			int sum = 0;
			int n = 0;
			
			n = Integer.parseInt(st.nextToken());
			sum+=n;
			stu.setKorean(n);
			n = Integer.parseInt(st.nextToken());
			sum+=n;
			stu.setEnglish(n);
			n = Integer.parseInt(st.nextToken());
			sum+=n;
			stu.setMath(n);
			
			stu.setSum(sum);
			stu.setAve(sum/3);
			
			students.add(stu);
		}
		
		return students;
	}
	
	public StudentDTO findByName(ArrayList<StudentDTO> studentList) {
		//이름으로 검색
		System.out.println("찾을 학생 이름 : ");
		String name = scan.next();
		for(StudentDTO stu : studentList) {
			if(name.equals(stu.getName())) {
				return stu;
			}
		}
		
		return null;
	}
	
	public void studentAdd(ArrayList<StudentDTO> studentList) {
		StudentDTO stu = new StudentDTO();
		
		System.out.println("이름 : ");
		stu.setName(scan.next());
		System.out.println("번호 : ");
		stu.setNum(scan.nextInt());
		
		int sum = 0;
		int n = 0;
		System.out.println("국어 : ");
		n = scan.nextInt();
		stu.setKorean(n);
		sum += n;
		System.out.println("영어 : ");
		n = scan.nextInt();
		stu.setEnglish(n);
		sum += n;
		System.out.println("수학 : ");
		n = scan.nextInt();
		stu.setMath(n);
		sum += n;
		
		stu.setSum(sum);
		stu.setAve(sum/3);
		
		studentList.add(stu);
	}
	
	public void studentDelete(ArrayList<StudentDTO> studentList) {
		//이름으로 검색
		System.out.println("삭제할 학생 이름 : ");
		String name = scan.next();
		
		var iter = studentList.iterator();
		while(iter.hasNext()) {
			if(iter.next().getName().equals(name)) {
				iter.remove();
			}
		}
	}
	
}
