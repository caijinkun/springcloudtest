package com.test.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {
    private static final Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient client;
    @RequestMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b){
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, hsot:"+instance.getHost()+",service_id:"+instance.getServiceId()+",result:"+r);
        return r;
    }
}
