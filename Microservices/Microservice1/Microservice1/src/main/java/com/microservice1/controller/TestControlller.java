package com.microservice1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice1.feignClient.ProxyFeign;

@RestController
@RequestMapping("/first_service")
public class TestControlller {

	@Autowired
	ProxyFeign proxyFeign;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/getSum/{first_num}/{second_num}")
	public int getSum(@PathVariable Integer first_num, @PathVariable Integer second_num) {

		int result = proxyFeign.calculateSum(first_num, second_num);

		logger.info("{}", result);
		return result;
	}
}
