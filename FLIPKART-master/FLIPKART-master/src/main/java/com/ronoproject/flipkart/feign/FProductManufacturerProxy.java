package com.ronoproject.flipkart.feign;

import com.ronoproject.flipkart.response.Response;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "productmanufacturer", url = "localhost:8080")


//@FeignClient(name = "productmanufacturer")
@FeignClient(name = "apigateway-service")
@RibbonClient(name = "productmanufacturer")
public interface FProductManufacturerProxy {
	@GetMapping("/productmanufacturer/getallproduct")
	//@GetMapping("/getallproduct")
	public Response getuserDetailsFromUserService();

}
