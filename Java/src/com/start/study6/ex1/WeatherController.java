package com.start.study6.ex1;

import java.util.List;
import java.util.Scanner;

public class WeatherController {

	/*
	 * 의존적이다(dependency)
	 *  -> DAO와 View가 없으면 일을 못한다
	 * 주입(Injection)
	 * 
	 * 의존성 주입(dependency injection, DI)
	 *  .- 생성자 내에서 생성
	 *  .- 외부에서 만들어서 생성자를 이용하여 받음
	 *  .- setter를 이용하여 받음
	 */
	private WeatherDAO weatherDAO;
	private WeatherView weatherView;
	private Scanner scan;
	
	// 의존성 주입-------------------------------------------------------------
	/* 
	 *  생명 주기(life cycle)가 같다
	 *	  -> controller가 죽을 때 dao와 view가 같이 죽는다
	 * 	강한 결합
	 */
	public WeatherController() {
		this.weatherDAO = new WeatherDAO();
		this.weatherView = new WeatherView();
		this.scan = new Scanner(System.in);
	}
	/*
	 *  생명 주기가 다르다
	 * 	  -> controller가 죽어도 dao와 view는 살?아 있다
	 *  느슨한 결합
	 */
	public WeatherController(WeatherDAO weatherDAO, WeatherView weatherView) {
		this.weatherDAO = weatherDAO;
		this.weatherView = weatherView;
		this.scan = new Scanner(System.in);
	}
	
	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}
	// ------------------------------------------------------------------------
	
	public void start() throws Exception {
		List<WeatherDTO> ar = weatherDAO.getWeathers();
		
		while(true) {
			System.out.println("1. 날씨 정보 출력");
			System.out.println("2. 날씨 정보 검색");
			System.out.println("3. 날씨 정보 추가");
			System.out.println("4. 날씨 정보 삭제");
			System.out.println("5. 날씨 정보 저장");
			System.out.println("6. 프로그램 종료");
			try {
				int select = scan.nextInt();
				
				if(select == 1) {
					weatherView.view(ar);
				} else if(select == 2) {
					WeatherDTO dto = weatherDAO.getDetail(ar, scan);
				weatherView.view(dto);
					} else if(select == 3) {
					if(weatherDAO.add(ar, scan)) {
						System.out.println("추가 성공");
					} else {
						System.out.println("추가 실패");
					}
				} else if(select == 4) {
					weatherDAO.delete(ar, scan);
				} else if(select == 5) {
					weatherDAO.save(ar);
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다."); 
				System.out.println(scan.next());
			}
		}
	}
}
