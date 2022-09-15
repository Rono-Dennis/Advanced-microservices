package com.apipothi.namingserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApplication {
	private final static Logger logger = LoggerFactory.getLogger(EurekaNamingServerApplication.class);

	public static void main(String[] args) {
		logger.info("***eureka-naming-server-App-STARTING***");
		SpringApplication.run(EurekaNamingServerApplication.class, args);
		logger.info("***eureka-naming-server-App-COMPLETED***");
	}

}
