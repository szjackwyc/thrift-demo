package com.test.service;

import java.util.List;

import com.test.model.OrderAddress;
import com.test.model.OrderAddressExample;

public interface OrderAddressService {

	
	OrderAddress selectByPrimaryKey(Long id);
	
	List<OrderAddress> selectByExample(OrderAddressExample example);
	
	int updateByPrimaryKeySelective(OrderAddress record);
}
