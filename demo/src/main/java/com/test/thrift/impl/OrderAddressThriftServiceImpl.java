package com.test.thrift.impl;

import java.util.List;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Lists;
import com.test.model.OrderAddress;
import com.test.model.OrderAddressExample;
import com.test.model.OrderAddressExample.Criteria;
import com.test.service.OrderAddressService;
import com.test.thrift.OrderAddressItem;

/**
 * 
 ************************************************************
 * @类名 : OrderAddressThriftServiceImpl.java
 *
 * @DESCRIPTION : thrift 接口实现
 * @AUTHOR : meila-jacky
 * @DATE : 2016年7月5日
 ************************************************************
 */
public class OrderAddressThriftServiceImpl implements com.test.thrift.OrderAddressService.Iface {

	@Autowired
	private OrderAddressService orderAddressService;

	public List<OrderAddressItem> select_by_order_id(int order_id) throws TException {
		OrderAddressExample example = new OrderAddressExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderIdEqualTo(Long.valueOf(order_id));
		List<OrderAddress> list = orderAddressService.selectByExample(example);
		OrderAddressItem addressItem = new OrderAddressItem();
		if (!list.isEmpty() && list.get(0) != null) {
			OrderAddress address = list.get(0);
			addressItem.setId(address.getId().intValue());
			addressItem.setOrder_id(address.getOrderId().intValue());
			addressItem.setZone_id(address.getZoneId().intValue());
			addressItem.setStreet(address.getStreet());
			addressItem.setConsignee(address.getConsignee());
			addressItem.setPhone(address.getPhone());
			addressItem.setWeixin_id(address.getWeixinId());
			addressItem.setArchive(address.getArchive());
			addressItem.setCreated_at((int) address.getCreatedAt().getTime());
			addressItem.setUpdated_at((int) address.getUpdatedAt().getTime());
			addressItem.setId_card(address.getIdCard());
		}
		return Lists.newArrayList(addressItem);
	}

	public List<OrderAddressItem> select_by_id(int id) throws TException {
		OrderAddress address = orderAddressService.selectByPrimaryKey(Long.valueOf(id));
		OrderAddressItem addressItem = new OrderAddressItem();
		if (address != null) {
			addressItem.setId(address.getId().intValue());
			addressItem.setOrder_id(address.getOrderId().intValue());
			addressItem.setZone_id(address.getZoneId().intValue());
			addressItem.setStreet(address.getStreet());
			addressItem.setConsignee(address.getConsignee());
			addressItem.setPhone(address.getPhone());
			addressItem.setWeixin_id(address.getWeixinId());
			addressItem.setArchive(address.getArchive());
			addressItem.setCreated_at((int) address.getCreatedAt().getTime());
			addressItem.setUpdated_at((int) address.getUpdatedAt().getTime());
			addressItem.setId_card(address.getIdCard());
		}
		return Lists.newArrayList(addressItem);
	}

	public int update_address(OrderAddressItem req) throws TException {
		return 0;
	}

}
