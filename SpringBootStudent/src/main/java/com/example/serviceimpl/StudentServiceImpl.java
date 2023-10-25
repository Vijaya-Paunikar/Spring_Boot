package com.example.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{

	//it will take all getters setters of repository class automatically
	@Autowired
	StudentRepository trepo;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return trepo.save(student);
	}

}
