package com.application.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Student;
import com.application.repostiory.StudentRepo;
import com.application.service.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired StudentRepo sr;
	
	
	@Override
	public Student saveStudent(Student stu) {

		Student save = sr.save(stu);
		
		return save;
	}

	
	
	
	
}
