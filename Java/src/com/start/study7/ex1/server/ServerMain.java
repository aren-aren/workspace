package com.start.study7.ex1.server;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new ServerController().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
