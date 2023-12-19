package com.start.study6.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class StudentDAO {
	
	public ArrayList<StudentDTO> getStudents() throws Exception {
		File file = new File("c:\\Study","student.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<StudentDTO> studentList = new ArrayList<>();
		
		for(String str = br.readLine() ; str != null ; str = br.readLine()) {
			if(!str.matches("^[가-힣|a-z|A-Z]+-\\d+-\\d+-\\d+-\\d+-\\d+-\\d+\\.{0,1}\\d*$")) continue;
			
			StringTokenizer tokens = new StringTokenizer(str,"-");
			StudentDTO student = new StudentDTO();
			student.setName(tokens.nextToken());
			student.setNum(Integer.parseInt(tokens.nextToken()));
			student.setKorean(Integer.parseInt(tokens.nextToken()));
			student.setEnglish(Integer.parseInt(tokens.nextToken()));
			student.setMath(Integer.parseInt(tokens.nextToken()));
			student.setSum(Integer.parseInt(tokens.nextToken()));
			student.setAve(Double.parseDouble(tokens.nextToken()));
			
			studentList.add(student);
		}
		
		br.close();
		fr.close();
		
		return studentList;
	}
	
	public void insertData() throws IOException {
		String[] name = "0 0 0 동일 movetwo 동삼 movefour movefive 동육 동칠 moveeight 동구 동십".split(" ");
		Random random = new Random();
		
		String[] inputs = new String[10];
		
		for(int i = 3 ; i < name.length ; ++i) {
			String[] strs = new String[7];
			strs[0] = name[i];
			strs[1] = i + "";
			
			int sum = 0;
			int n = 0;
			
			for(int j = 2 ; j < 5; j++) {
				n = random.nextInt(200)%101;
				strs[j] = n + "";
				sum += n;
			}
			
			strs[5] = sum + "";
			strs[6] = (double)sum/3 + "";
			
			inputs[i-3] = String.join("-", strs);
		}
		
		String datas = String.join("\n\r", inputs);
		
		File file = new File("c:\\Study" , "student.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write(datas);
		
		fw.flush();
		fw.close();
	}
}
