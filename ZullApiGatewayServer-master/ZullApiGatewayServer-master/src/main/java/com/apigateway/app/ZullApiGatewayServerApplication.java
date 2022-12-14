package com.apigateway.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZullApiGatewayServerApplication {

	private final static Logger logger = LoggerFactory.getLogger(ZullApiGatewayServerApplication.class);
	public static void main(String[] args) {
		logger.info("***zull-apigateway-service-App-STARTING***");
		SpringApplication.run(ZullApiGatewayServerApplication.class, args);
		logger.info("***zull-apigateway-service-App-COMPLETED***");
	}

	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	 

}
