package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.OrderAddressMapper;
import com.test.model.OrderAddress;
import com.test.model.OrderAddressExample;
import com.test.service.OrderAddressService;

@Service("orderAddressService")
public class OrderAddressServiceImpl implements OrderAddressService {
	
	@Autowired
	private OrderAddressMapper orderAddressMapper;

	public OrderAddress selectByPrimaryKey(Long id) {
		return orderAddressMapper.selectByPrimaryKey(id);
	}

	public List<OrderAddress> selectByExample(OrderAddressExample example) {
		return orderAddressMapper.selectByExample(example);
	}

	public int updateByPrimaryKeySelective(OrderAddress record) {
		return orderAddressMapper.updateByPrimaryKeySelective(record);
	}

}
