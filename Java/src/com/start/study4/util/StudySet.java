package com.start.study4.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class StudySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.toString();
		
		hs.add("test");
		hs.add("second");
		hs.add("third");
		
		for(char i = 'a' ; i < 'z'+1 ; ++i) {
			hs.add(i+"123");
		}
		
		System.out.println(hs);
		
		List<String> list = new ArrayList<>();
		
		list.addAll(hs);
		
//		list.stream().forEach(System.out::println);
		
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
