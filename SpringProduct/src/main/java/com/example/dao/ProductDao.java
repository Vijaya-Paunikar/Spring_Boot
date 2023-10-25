package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Product;

public interface ProductDao extends CrudRepository<Product,Integer>
{

}
