package com.start.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public void s() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("클라이언트가 접속하기를 기다리는 중");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("클라이언트와 연결이 성공");
		InputStream is = sc.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = sc.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		
		while(true) {
			String msg = br.readLine();
			System.out.println("client : " + msg);
			
			if(msg.equals("exit")) break;
		
			//클라이언트에게 메세지 전송
			
			System.out.println("클라리언트로 보낼 메세지를 입력하세요 : ");
			String m = scan.nextLine();
			
			bw.write(m+"\r\n");
			bw.flush();
		}
		
		bw.write("exit");
		bw.flush();
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		sc.close();
		ss.close();
		scan.close();
		System.out.println("서버프로그램 종료");
	}
}
