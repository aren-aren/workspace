package com.start.study1;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Study1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력하세요.");
		long num = sc.nextLong();
		
		Queue<Long> lpq = new PriorityQueue<>();
		
		//입력받은 정수의 약수
		//약수의 개수를 출력하세요
		for(long i = 1 ; i <= (long)Math.sqrt(num)+1 ; ++i) {
			if(num%i == 0) {
				lpq.add(i);
				
				long other = num/i;
				if(other != i) {
					lpq.add(other);
				}
			}
		}
		System.out.println("약수의 개수 : " + lpq.size() );
		while(!lpq.isEmpty()) {
			System.out.println(lpq.poll());
		}
		
	}

}
