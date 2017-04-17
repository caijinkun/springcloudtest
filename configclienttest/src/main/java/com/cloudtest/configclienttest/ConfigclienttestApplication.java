package com.cloudtest.configclienttest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigclienttestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclienttestApplication.class, args);
	}
	@Value("${from}")
	public String form;
	
	@RequestMapping("/getVal")
	public String getValue(){
		return form;
	}
}
