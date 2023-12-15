package com.start.study4.util;

import java.util.ArrayList;

public class StudyList3Main {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		StudyList3 sl3 = new StudyList3();
		sl3.add(ar);
		sl3.add(ar);
		sl3.add(ar);
		sl3.add(ar);
		sl3.add(ar);
		sl3.add(ar);
		sl3.add(ar);
		
		for(Integer i : ar) {
			System.out.println(i);
		}

	}

}
