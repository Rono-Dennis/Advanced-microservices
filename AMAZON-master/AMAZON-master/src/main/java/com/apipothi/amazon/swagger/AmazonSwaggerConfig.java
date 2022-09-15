package com.apipothi.amazon.swagger;
/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Web Site  : http://apipothi.com/
 * Play List : MICROSERVICE-SPRINGBOOT
 * JAVA      : 1.8
*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2	
public class AmazonSwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact(
			"API DENNIS",
			"https://www.youtube.com/teereecehd",
			"ronodennis72@gmail.com"
			);

	public static final ApiInfo APIPOTHI_DEFAULT = new ApiInfo(
			"AMAZON ",
			"This is AMAZON Api Documentation", 
			"2.0", 
			"urn:tos", 
			DEFAULT_CONTACT,
			"AMAZON MANUFACTURER 1.0", 
			"http://google.com/"
			);

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(APIPOTHI_DEFAULT);
	}
}
