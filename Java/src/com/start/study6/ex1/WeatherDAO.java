package com.start.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherDAO {
	// DAO : Data Access Object
	private static int count;
	
	static {
		WeatherDAO.count = 1;
	}
	
	public List<WeatherDTO> getWeathers() throws Exception {
		//파일에서 파일의 내용을 읽어오는 역할
		File file = new File("c:\\Study\\weather");
		
		String recentFileName = getRecentFileName(file);
		System.out.println("최신 파일 이름 : " + recentFileName);
		
		file = new File(file, recentFileName);
		
		if(!file.exists()) {
			return new ArrayList<WeatherDTO>();
		}
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<WeatherDTO> weatherList = new ArrayList<>();
		
//		while(true) {
//			String str = br.readLine();
//			
//			if(str == null) break;
//			if(!str.matches("^[가-힣|a-z|A-Z]+-[가-힣|a-z|A-Z]+-\\d+-\\d+$")) continue;
//			
//			StringTokenizer tokens = new StringTokenizer(str, "-");
//			WeatherDTO weatherDTO = new WeatherDTO();
//			weatherDTO.setRegion(tokens.nextToken());
//			weatherDTO.setWeather(tokens.nextToken());
//			weatherDTO.setTemperature(Integer.parseInt(tokens.nextToken()));
//			weatherDTO.setHumidity(Integer.parseInt(tokens.nextToken()));
//			
//			weatherList.add(weatherDTO);
//		}
		
		for(String str = br.readLine() ; str != null ; str = br.readLine()) {
			
			if(!str.matches("^[가-힣|a-z|A-Z]+-[가-힣|a-z|A-Z]+-\\d+-\\d+$")) continue;
			
			StringTokenizer tokens = new StringTokenizer(str, "-");
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setRegion(tokens.nextToken());
			weatherDTO.setWeather(tokens.nextToken());
			weatherDTO.setTemperature(Integer.parseInt(tokens.nextToken()));
			weatherDTO.setHumidity(Integer.parseInt(tokens.nextToken()));
			
			weatherList.add(weatherDTO);
		}
		
		br.close();
		fr.close();
		
		return weatherList;
	}

	private String getRecentFileName(File file) {
		return Arrays.stream(file.list())
						.filter(name -> name.matches("\\d+.txt"))
						.map(name -> name.split("\\.")[0])
						.mapToLong(Long::parseLong)
						.max()
						.orElse(0) + ".txt";
	}

	public WeatherDTO getDetail(List<WeatherDTO> list, Scanner scan) {
		System.out.println("검색할 도시명 : ");
		String target = scan.next();
		
		for(WeatherDTO w : list) {
			if(w.getRegion().equals(target)) {
				return w;
			}
		}
		
		return null;
	}
	
	public boolean add(List<WeatherDTO> list, Scanner scan) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명 : ");
		weatherDTO.setRegion(scan.next());
		System.out.println("기온 : ");
		weatherDTO.setTemperature(scan.nextInt());
		System.out.println("날씨 : ");
		weatherDTO.setWeather(scan.next());
		System.out.println("습도 : ");
		weatherDTO.setHumidity(scan.nextInt());
		
		return list.add(weatherDTO);
	}

	public void delete(List<WeatherDTO> ar, Scanner scan) {
		System.out.println("삭제할 도시명 : ");
		
		String city = scan.next();
		for(WeatherDTO weatherDTO : ar) {
			if(!weatherDTO.getRegion().equals(city)) continue;
			
			if(ar.remove(weatherDTO)) {
				System.out.println("삭제 성공");
				return;
			} else {
				break;
			}
		}
		
		System.out.println("삭제 실패");
		
	}

	public void save(List<WeatherDTO> ar) throws Exception {
		Calendar date = Calendar.getInstance();
//		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd"); // Date를 원하는 포맷으로 만들어줌
//		String filename = "" + date.get(Calendar.YEAR) + (date.get(Calendar.MONTH) + 1) + date.get(Calendar.DATE);
//		String filename = sd.format(date.getTime()) + count + ".txt";
		String filename = date.getTimeInMillis() + ".txt";
		File file = new File("c:\\Study\\weather", filename);
		FileWriter fw = new FileWriter(file, false);
		
		fw.write("##날씨정보\r\n");
		fw.write("지역-날씨-기온-습도\r\n");
		
		String information = "";
		for(WeatherDTO weatherDTO : ar) {
			information += String.join("-",weatherDTO.saveInfo()) + "\r\n";
		}
		
		fw.write(information);
		
		fw.flush();
		fw.close();
		count++;
		System.out.println("저장 완료");
	}
	
}
