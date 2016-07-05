package com.thrift.test;

import java.util.List;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.alibaba.fastjson.JSONObject;
import com.test.thrift.OrderAddressItem;
import com.test.thrift.OrderAddressService;

/**
 * 
 ************************************************************
 * @类名 : ThriftServerClient.java
 *
 * @DESCRIPTION : thrift client callback
 * @AUTHOR : meila-jacky
 * @DATE : 2016年7月5日
 ************************************************************
 */
public class ThriftServerClient {

	public static void main(String[] args) {
		try {
			TTransport transport = new TSocket("localhost", 8888);
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			// 设置传输协议为TBinaryProtocol
			OrderAddressService.Client client = new OrderAddressService.Client(protocol);
			try {
				List<OrderAddressItem> list = client.select_by_id(999);
				System.out.println(JSONObject.toJSONString(list));
			} catch (TException e) {
				e.printStackTrace();
			}
			transport.close();
		} catch (TTransportException e) {
			// Tasks Auto-generated catch block
			e.printStackTrace();
		}
	}
}
