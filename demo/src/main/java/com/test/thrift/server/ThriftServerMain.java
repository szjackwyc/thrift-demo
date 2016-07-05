package com.test.thrift.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThriftServerMain {

	private static volatile boolean running = true;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-mybatis.xml");
		context.start();
		ThriftServerProxy thriftServerProxy = (ThriftServerProxy) context.getBean("thriftServerProxy");
		thriftServerProxy.publish();
		System.out.println("Thrift Service started.....");
		synchronized (ThriftServerMain.class) {
			while (running) {
				try {
					ThriftServerMain.class.wait();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
	}
}
