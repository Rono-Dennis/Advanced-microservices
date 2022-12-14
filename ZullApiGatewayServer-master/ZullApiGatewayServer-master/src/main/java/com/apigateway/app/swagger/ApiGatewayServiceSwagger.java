package com.apigateway.app.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ApiGatewayServiceSwagger {
	private final static Logger logger = LoggerFactory.getLogger(ApiGatewayServiceSwagger.class);

	public static final Contact DEFAULT_CONTACT = new Contact(
			"API DENNIS",
			"https://www.youtube.com/teereecehd",
			"ronodennis72@gmail.com"
			);

	public static final ApiInfo APIPOTHI_DEFAULT = new ApiInfo(
			"API GATEWAY", 
			"This is Api Gateway Documentation",
			"1.0",
			"urn:tos", 
			 DEFAULT_CONTACT, 
			"USER-SERVICE 1.0", 
			"https://www.youtube.com/teereecehd"
			);

	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(APIPOTHI_DEFAULT);

	}

}
