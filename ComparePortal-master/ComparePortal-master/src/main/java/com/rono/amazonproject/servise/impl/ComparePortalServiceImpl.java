package com.rono.amazonproject.servise.impl;

import java.util.ArrayList;
import java.util.List;

import com.rono.amazonproject.servise.ComparePortalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rono.amazonproject.dao.ComparePortalDAO;
import com.rono.amazonproject.model.ComparePortalProduct;
import com.rono.amazonproject.swagger.to.ComparePortalTO;

@Component
public class ComparePortalServiceImpl implements ComparePortalService {

	private final static Logger logger = LoggerFactory.getLogger(ComparePortalServiceImpl.class);

	@Autowired
	ComparePortalDAO dao;

	@Override
	public String addProductFromManufacturer(List<ComparePortalTO> manufacturerProductDetails) {
		logger.info("START- addProductFromManufacturer{}" + manufacturerProductDetails);
		String statusmsg = "";
		try {
			for (ComparePortalTO amazonTO : manufacturerProductDetails) {
				ComparePortalProduct comparePortalProduct = new ComparePortalProduct();
				comparePortalProduct.setId(amazonTO.getId());
				comparePortalProduct.setProductid(amazonTO.getWproductid());
				comparePortalProduct.setProductname(amazonTO.getWproductname());
				comparePortalProduct.setProductprice(amazonTO.getWproductprice());
				dao.save(comparePortalProduct);

			}
			statusmsg = "Data Inserted successfully";
		} catch (Exception e) {
			statusmsg = "Exception occured during data insertion";
			logger.error("-Exception{}", e);
		}
		return statusmsg;

	}

	@Override
	public List<ComparePortalTO> getProductID() {
		logger.info("START- getProductID{}");
		List<ComparePortalTO> listOfProductid = new ArrayList<ComparePortalTO>();
		String statusmsg = "";
		try {
			List<ComparePortalProduct> CompareProductList = dao.findAll();
			
			for (ComparePortalProduct amazonProduct : CompareProductList) {
				
				ComparePortalTO to = new ComparePortalTO();
				//to.setId(amazonProduct.getId());
				to.setWproductid(amazonProduct.getProductid());
				//to.setWproductname(amazonProduct.getProductname());
				//to.setWproductprice(amazonProduct.getProductprice());
				
				listOfProductid.add(to);
			}

		} catch (Exception e) {
			statusmsg = "Exception occured during getProductID()";
			logger.error("-Exception{}", statusmsg);
		}
		logger.info("***END--getProductID()" + listOfProductid);
		return listOfProductid;
	}

}
