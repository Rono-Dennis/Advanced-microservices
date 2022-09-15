package com.rono.amazonproject.feign;

import com.rono.amazonproject.response.ComparePortalResponse;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "flipkart", url = "http://localhost:8081")
@RibbonClient(name = "flipkart")
public interface CFlipkartProxy {
	@GetMapping("getFlipkartProducts")
	public ComparePortalResponse getProductInFlipkart();
}
