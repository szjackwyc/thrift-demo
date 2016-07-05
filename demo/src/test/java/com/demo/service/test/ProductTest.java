package com.demo.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.test.model.Product;
import com.test.service.ProductService;

public class ProductTest extends BaseTestCase {

	@Autowired
	private ProductService productService;

	@Test
	public void loadByIdTest() {
		Long productId = 10987L;
		Product product = productService.loadById(productId);
		System.out.println(JSONObject.toJSONString(product));

	}
}
