package com.start.study4.util.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class StudySetInfo {
	Random random = new Random();
	ArrayList<Integer> ar = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	int[] intArr = new int[6];
	
	
	public void ex0() {
		int idx = 0;
		
		while(idx < 6) {
			int num = random.nextInt(45) + 1;
			
			for(int i = 0 ; i < idx ; ++i) {
				if(num == intArr[i]) continue;
			}
			
			intArr[idx] = num;
			idx++;
		}
	}

	//로또번호 1 ~ 45 , 6개
	public void ex1() {
		//arraylist
		while(ar.size() < 6) {
			int num = random.nextInt(45) + 1;
			
			if(ar.contains(num)) continue;
			
			ar.add(num);
		}
	}
	
	public void ex2() {
		//hashset
		while(set.size() < 6) {
			set.add(random.nextInt(45) + 1);
		}
	}

	public void print() {
		System.out.println("array");
		System.out.println(Arrays.toString(intArr));
		
		System.out.println("arraylist");
		System.out.println(ar);
		
		System.out.println("hashset");
		System.out.println(set);
	}
}
