package com.start.study7.ex1.client;

public class ClientView {
	public void view(String notice) {
		System.out.println(String.join("\n", notice.split("!!!")));
	}
}
