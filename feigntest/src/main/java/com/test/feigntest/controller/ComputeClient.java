package com.test.feigntest.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="compute-service", fallback=ComputeClientHystrix.class)
public interface ComputeClient {
	@RequestMapping("/add")
	Integer add(@RequestParam("a")Integer a, @RequestParam("b")Integer b);
}
