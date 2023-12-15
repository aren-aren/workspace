package com.start.study4.util;

import java.util.HashMap;

public class StudyMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("k1", 1);
		map.put("k2", 2);
		
		System.out.println(map);

		Integer n = map.get("k2");
		System.out.println(n);
	}

}
