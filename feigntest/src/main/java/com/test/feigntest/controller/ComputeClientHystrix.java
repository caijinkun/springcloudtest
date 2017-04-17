package com.test.feigntest.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Component
public class ComputeClientHystrix implements ComputeClient{
	@PostConstruct
	public void init(){
		System.out.println("=======================init");
	}
	@RequestMapping("/add")
	public Integer add(@RequestParam("a")Integer a, @RequestParam("b")Integer b){
		return -100000;
	}
}
