package com.apigatway.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class ApiGetwayServerApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(ApiGetwayServerApplication.class);
		logger.info("{}", "");

		SpringApplication.run(ApiGetwayServerApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
