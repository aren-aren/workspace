package com.start.study4.util.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StudentService {
	private String info;

	public StudentService() {
		this.info = "winter-1-50-60-80";
		this.info += "-iu-2-85-94-75";
		this.info += "-karina-3-78-78-98";
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
	
	public StudentDTO findByName() {
		//이름으로 검색
		
		return null;
	}
	
	public void studentAdd() {
		
	}
	
	public void studentDelete() {
		//이름으로 검색
		
	}
	
}
