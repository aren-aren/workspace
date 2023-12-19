package com.start.study5;

import java.util.Random;

public class StudyException2 {
	
	public void t2() throws Exception {
		Random random = new Random();
		int n = random.nextInt(2);
		
		System.out.println(10/n);
	}
}
