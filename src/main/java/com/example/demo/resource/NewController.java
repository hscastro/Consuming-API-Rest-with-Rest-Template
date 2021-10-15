package com.example.demo.resource;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.News;
import com.example.demo.service.NewService;

@RestController
public class NewController {
	
	
	private NewService newService = new NewService();
	
	@GetMapping("/api/news/topstories/{section}")
	public ResponseEntity<News> getNews(@PathVariable("section") String section) {
		
		News news  = newService.getNews(section);
		return ResponseEntity.ok(news);
	}
}
