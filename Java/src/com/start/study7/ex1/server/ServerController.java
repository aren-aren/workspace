package com.start.study7.ex1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerController {

	public void start() throws Exception {
		ServerSocket ss = new ServerSocket(8282);
		Socket socket = ss.accept();
		System.out.println("클라이언트 접속함");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		ServerDAO serverDAO = new ServerDAO();
		var list = serverDAO.getWeathers();
		
		boolean isContinue = true;
		while(isContinue) {
			String msg = "";
			String select = br.readLine();
			
			System.out.println("client - " + select);
			
			switch(select) {
			case "1":
				msg = serverDAO.listToString(list);
				break;
			case "2":
				msg = "2번 공사중";
				break;
			case "3":
				msg = "로그아웃 합니다.";
				isContinue = false;
				break;
			default:
				msg = "올바른 번호가 아닙니다.";
				break;
			}
			
			bw.write(msg + "\r\n");
			bw.flush();
			System.out.println("요청 처리 완료");
		}
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		ss.close();
	}
}
