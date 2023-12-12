package com.start.study3.members;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
//		member.name="name";
//		member.age = 20;

		member.setName("name");
		member.setWeight(99);
		
		System.out.println("이름 : " + member.getName() + " 몸무게 : " + member.getWeight());
	}
	

}
