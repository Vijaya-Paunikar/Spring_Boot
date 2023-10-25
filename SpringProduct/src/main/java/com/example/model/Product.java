package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product 
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double amount;
	private String category;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
