package com.start.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import com.start.study6.ex1.WeatherDTO;

public class ServerDAO {
	public List<WeatherDTO> getWeathers() throws Exception{
			File file = new File("c:\\Study\\weather");
			
			String recentFileName = "weather.txt";
			System.out.println("최신 파일 이름 : " + recentFileName);
			
			file = new File(file, recentFileName);
			
			if(!file.exists()) {
				return new ArrayList<>();
			}
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			ArrayList<WeatherDTO> weatherList = new ArrayList<>();
			
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

	public String listToString(List<WeatherDTO> list) {
		
		StringBuilder sb = new StringBuilder();
		list.stream()
			.map(WeatherDTO::toString)
			.forEach(e -> sb.append(e).append("!!!"));
		
		System.out.println(sb);
		
		return sb.toString();
	}
}
