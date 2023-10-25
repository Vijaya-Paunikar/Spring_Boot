package com.example.course.bean;

public class Course 
{
	private int id;
	private String name;
	private String Trainer;
	
	public Course(int id, String name, String trainer) 
	{
		super();
		this.id = id;
		this.name = name;
		Trainer = trainer;
	}

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public String getTrainer() 
	{
		return Trainer;
	}

	@Override
	public String toString() 
	{
		return "Course [id=" + id + ", name=" + name + ", Trainer=" + Trainer + "]";
	}
	
}
