package com.start.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public void send() throws Exception {
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.165", 8282);
		System.out.println("접속 성공");
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		while(true) {
			System.out.println("서버로 보낼 메세지를 입력하세요 : ");
			String m = scan.nextLine();
			
			bw.write(m+"\r\n");
			bw.flush();
			
			System.out.println("서버로부터 받은 메세지 : ");
			 
			String msg = br.readLine();
			System.out.println("server : " + msg);
			
			if(msg.equals("exit")) break;
			
		}
		
		bw.write("exit");
		bw.flush();
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		scan.close();
		System.out.println("종료합니다.");
	}
}
