package com.test.ribbontest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/add")
	@HystrixCommand(fallbackMethod="fallback")
	public String add(){
		return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
	}
	
	public String fallback(){
		return "error";
	}
}
