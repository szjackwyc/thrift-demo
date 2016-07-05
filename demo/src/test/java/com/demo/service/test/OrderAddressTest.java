package com.demo.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.test.model.OrderAddress;
import com.test.service.OrderAddressService;

public class OrderAddressTest extends BaseTestCase {

	@Autowired
	private OrderAddressService orderAddressService;

	@Test
	public void selectByPrimaryKey() {
		Long id = 999L;
		OrderAddress address = orderAddressService.selectByPrimaryKey(id);
		System.out.println(JSONObject.toJSONString(address));
	}

}
