package com.start.study4.lang;

public class StringStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nn = "winteretwtritthfwgyfggfhd";
		
		int result = -1;
		int count = 0;
		while(true) {
			result = nn.indexOf('f', result+1);
			
			if(result == -1) {
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}

}
