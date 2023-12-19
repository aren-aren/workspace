package com.start.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherDAO {
	// DAO : Data Access Object
	
	public ArrayList<WeatherDTO> getWeathers() throws Exception {
		//파일에서 파일의 내용을 읽어오는 역할
		File file = new File("c:\\Study", "weather.txt");
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
	
}
