package com.spring.test.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class HelloController {
	@Autowired
	private DiscoveryClient client;
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public void hello(String name) {
		ServiceInstance si = client.getLocalServiceInstance();
		System.out.println("hello," + si.getHost() + ":" + si.getPort() + ":" + si.getServiceId());
	}
}
