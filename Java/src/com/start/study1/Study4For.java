package com.start.study1;

import java.util.Scanner;

public class Study4For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. 로그인 처리
		 * - 1. 로그인 2. 종료
		 * - id, pw 될 때까지 무제한
		 */
		
		/* 2. MMORPG
		 * - 레벨은 1부터 시작
		 * - 골드는 처음 0
		 * 
		 * - 모든 몬스터의 경험치는 같음
		 * - 1 -> 2  	3마리
		 * - n -> n+1 	3n마리
		 * - 사냥시 n마리 사냥 출력
		 * 
		 * - 레벨이 5렙 -> 1000골드
		 * - 레벨이 10렙 -> 2000골드
		 * - 레벨이 15렙 -> 3000골드 (5n -> 1000n)
		 * 
		 * - 최종레벨과 골드를 출력하고 게임 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//로그인
		while(true) {
			int id = 1234;
			int pw = 5678;
			System.out.println("1. 로그인 2. 종료");
			int select = sc.nextInt();
			
			if(select == 2) {
				return;
			}
			
			if(select == 1) {
				System.out.println("아이디 : ");
				int inputId = sc.nextInt();
				System.out.println("패스워드 : ");
				int inputPw = sc.nextInt();
				
				if(id == inputId && pw == inputPw) {
					break;
				}
			}
		}
		
		int lev = 0;
		int gold = 0;
		int levlimit = 15;
		
		for(lev = 1 ; lev < levlimit ;) {
			
			//사냥
			for(int mon = 1 ; mon <= 3*lev ; ++mon) {
				System.out.println("몬스터 " + mon + "마리 사냥.");
			}
			
			//레벨업
			lev++;
			System.out.println("레벨업! 현재 " + lev + "레벨");
			
			//골드
			if(lev%5 == 0) {
				int getGold = (lev/5)*1000;
				System.out.println(getGold + " 획득!");
				gold += getGold;
			}
			
			//continue?
			while(lev == levlimit) {
				System.out.println("계속할까요? 1. 예 2. 아니오");
				int select = sc.nextInt();
				if(select == 1) {
					levlimit *= 2;
				}
				if(select == 2) {
					break;
				}
			}
		}
		
		System.out.println("캐릭터 레벨 : " + lev);
		System.out.println("골드 : " + gold);
	}

}
