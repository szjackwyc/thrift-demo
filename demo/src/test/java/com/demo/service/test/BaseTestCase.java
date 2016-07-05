package com.demo.service.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = "classpath*:/spring-mybatis.xml")
public class BaseTestCase {
	{
        System.setProperty("druid.log.stmt.executableSql", "true");
    }
}
