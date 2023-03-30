package com.microservice2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/getSum/{first_num}/{second_num}")
	public int calculateSum(@PathVariable Integer first_num, @PathVariable Integer second_num) {

		int result = first_num + second_num;

		logger.info("{}", result);
		return result;
	}
}
