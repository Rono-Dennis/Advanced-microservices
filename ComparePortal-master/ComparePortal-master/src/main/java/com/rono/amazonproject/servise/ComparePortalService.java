package com.rono.amazonproject.servise;

import java.util.List;

import com.rono.amazonproject.swagger.to.ComparePortalTO;

public interface ComparePortalService {

	public String addProductFromManufacturer(List<ComparePortalTO> manufacturerProductDetails);
	public List<ComparePortalTO> getProductID();
}
