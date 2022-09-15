package com.rono.amazonproject.feign;

import com.rono.amazonproject.response.ComparePortalResponse;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(contextId = "CProductManufacturerProxy",name = "apigateway-service")
@RibbonClient(name = "productmanufacturer")
public interface CProductManufacturerProxy {
	@GetMapping("/productmanufacturer/getallproduct")
	public ComparePortalResponse getFromWarehouseService();
}
