package com.start.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class StudyFile {
	
	public void f4() throws Exception {
		File file = new File("c:\\Study\\test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String string = br.readLine();
			if(string == null) break;
			if(string.isBlank()) continue;
			System.out.println(string);
		}
		
		br.close();
		fr.close();
	}
	
	public void f3() throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("c:\\Study\\test2.txt");
		FileWriter fw = new FileWriter(file,true);
		
//		fw.write("moveone" + "\n\r");
//		fw.flush();
		Random random = new Random();
		
		
		String[] strs = {" ","\t", "\n\r", "exit"};
		
		while(true) {
			int n = random.nextInt(1000)%320;
			String str = n < 50? strs[n%4] : random.nextInt() + "";
			if(str.equals("exit")) break;
			
			fw.write(str);
			fw.flush();
		}
		
		fw.close();
	}
	
	public void f2() throws Exception {
		File file = new File("c:\\Study");
		String[] ar = file.list();
		
		for(String str : ar) {
			System.out.println(str + "\t: " + new File("c:\\Study\\",str).length());
		}
	}
	
	
	public void f1() throws Exception {
		File file = new File("c:\\Study\\Test.java");
		file = new File("c:\\Study\\test","sub1");
		
		if(!file.exists()) file.mkdirs();
		
		file = new File(file,"t1.java");
		if(!file.exists()) file.createNewFile();
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
	}
}
