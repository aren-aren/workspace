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
	public void start() throws Exception {
		//1. 서버와 소켓 연결 시도
		
		//1. 날씨 정보 출력
		//2. 날씨 정보 검색
		//3. 프로그램 종료
		
		Socket socket = new Socket("localhost", 8282);
		Scanner scan = new Scanner(System.in);
	
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
			System.out.println("3. 프로그램 종료");
			System.out.println("===================");
			select = scan.nextInt();
			
			bw.write(select+"\r\n");
			bw.flush();
			
			System.out.println("보냄");
			
			String msg = br.readLine();
			System.out.println(String.join("\n",msg.split("!!!")));
		}
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		scan.close();
		socket.close();
	}
}
