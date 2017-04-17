package com.test.feigntest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	private ComputeClient computeClient;
	
	@RequestMapping("/add")
	public Integer add(Integer a, Integer b){
		return computeClient.add(a, b);
	}
}
