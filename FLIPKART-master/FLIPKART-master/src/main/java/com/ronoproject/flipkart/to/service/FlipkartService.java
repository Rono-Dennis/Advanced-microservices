package com.ronoproject.flipkart.to.service;

import java.util.List;

import com.ronoproject.flipkart.request.FlipkartRequest;
import com.ronoproject.flipkart.to.FlipkartTO;

public interface FlipkartService {

	public String addProductFromManufacturer(List<FlipkartTO> manufacturerProductDetails);

	public List<FlipkartTO> getByIDProductInFlipkart(int id);

	public List<FlipkartTO> getAllProductInFlipkart();

	public String addProductInFlipkart(List<FlipkartRequest> request);

	public String updateProductInFlipkart(FlipkartRequest request);

	public boolean deleteProductInFlipkart(int id);
}
