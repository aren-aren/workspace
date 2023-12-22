package com.start.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientController {
	ClientView view;
	Scanner scan;
	
	public ClientController() {
		this.view = new ClientView();
		scan = new Scanner(System.in);
	}
	
	public ClientController(Scanner scan) {
		// class를 사용하는 곳에서 Scanner를 다른 곳에도 사용하여 만들어둔 Scanner 객체를 받아 올 때 사용
		this.scan = scan;
	}

	public void start() throws Exception {
		//1. 서버와 소켓 연결 시도
		
		//1. 날씨 정보 출력
		//2. 날씨 정보 검색
		//3. 프로그램 종료
		
		Socket socket = new Socket("localhost", 8282);
	
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		int select = 0;
		while(select != 3) {
			System.out.println("===================");
			System.out.println("1. 날씨 정보 출력");
			System.out.println("2. 날씨 정보 검색");
			System.out.println("3. 날씨 정보 추가");
			System.out.println("4. 날씨 정보 삭제");
			System.out.println("5. 날씨 정보 저장");
			System.out.println("3. 프로그램 종료");
			System.out.println("===================");
			select = scan.nextInt();
			
			bw.write(select+"\r\n");
			bw.flush();
			
			System.out.println("보냄");
			
			String msg = br.readLine();
			view.view(msg);
		}
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		socket.close();
	}
}
