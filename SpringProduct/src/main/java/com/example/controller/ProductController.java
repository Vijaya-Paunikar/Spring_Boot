package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProductDao;
import com.example.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController 
{
@Autowired
	private ProductDao dao;
@PostMapping("/addproducts")
	public String addProducts(@RequestBody List<Product> products)
	{
		dao.saveAll(products);
		return "product added:"+products.size();
	}
@GetMapping("/getProducts")
	public List<Product> getProducts()
	{
		return (List<Product>)dao.findAll();
	}
}
