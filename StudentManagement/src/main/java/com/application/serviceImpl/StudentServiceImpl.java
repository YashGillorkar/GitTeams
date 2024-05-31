package com.application.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Student;
import com.application.repostiory.StudentRepo;
import com.application.service.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired StudentRepo sr;
	
	public void tryMehtod() {
		System.out.println("push");
	}

	@Override

	public void deleteStudentById(int id) {
		sr.deleteById(id);
	}	

	public Iterable<Student> getAllData() {
		Iterable<Student> list=sr.findAll();
		return list;

	}

}
