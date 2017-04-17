package com.cloudtest.zuultest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class ZuultestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuultestApplication.class, args);
	}
}
