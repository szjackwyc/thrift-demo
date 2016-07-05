package com.test.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.ProductMapper;
import com.test.model.Product;
import com.test.service.ProductService;


@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productMapper;
	
	public Product loadById(Long id){
		return productMapper.selectByPrimaryKey(id);
	}
}
