package com.rono.amazonproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//http://localhost:8083/swagger-ui.html
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.rono.amazonproject")
@EnableDiscoveryClient
public class ComparePortalApplication {
	private final static Logger logger = LoggerFactory.getLogger(ComparePortalApplication.class);
	public static void main(String[] args) {
		logger.info("******-ComparePortalApplication-START");
		SpringApplication.run(ComparePortalApplication.class, args);
		logger.info("******-ComparePortalApplication-START");
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
