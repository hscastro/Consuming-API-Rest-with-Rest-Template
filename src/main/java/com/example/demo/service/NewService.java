package com.example.demo.service;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.News;
import com.example.demo.domain.Results;

public class NewService {
	
	static RestTemplate restTemplate;
	
	private String key_api = "BAEndijGLASVFEGci9VJ2QYsVyMZZLpN";
	
	public NewService() {
	    restTemplate = new RestTemplate();
	}	
	
	public News getNews(String section){
		News news = new News();
		
		try {			
			
		    @SuppressWarnings("static-access")
			String tes1 = this.getEntity(section).getSection();
		    
		    Results tes3[] = this.getEntity(section).getResults();
		    
		    String title = tes3[0].getTitle();
		    
		    news.setSection(tes1);
		    news.setTitle(title);		    
		    news.setResults(tes3);
					    
		    return news;
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * get entity
	 * @throws JSONException 
	 */
	public static News getEntity(String section) throws Exception{
		
		String getUrl = "https://api.nytimes.com/svc/topstories/v2/"+section
					+".json?api-key=BAEndijGLASVFEGci9VJ2QYsVyMZZLpN";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<News> entity = new HttpEntity<News>(headers);
		News newsList = restTemplate.getForObject(getUrl, News.class);
		
		return newsList;
	}	

}
