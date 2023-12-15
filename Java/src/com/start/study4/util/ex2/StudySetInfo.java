package com.start.study4.util.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class StudySetInfo {
	Random random = new Random();
	ArrayList<Integer> ar = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	int[] intArr = new int[6];
	
	
	public void ex0() {
		int idx = 0;
		
		while(true) {
			int num = random.nextInt(45) + 1;
			
			for(int i = 0 ; i < idx ; ++i) {
				if(num == intArr[i]) continue;
			}
			
			intArr[idx] = num;
			idx++;
			
			if(idx == 6) return;
		}
	}

	//로또번호 1 ~ 45 , 6개
	public void ex1() {
		//arraylist
		while(true) {
			int num = random.nextInt(45) + 1;
			
			if(ar.contains(num)) continue;
			
			ar.add(num);
			
			if(ar.size() == 6) return;
		}
	}
	
	public void ex2() {
		//hashset
		while(true) {
			int num = random.nextInt(45) + 1;
			set.add(num);
			
			if(set.size() == 6) return;
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
