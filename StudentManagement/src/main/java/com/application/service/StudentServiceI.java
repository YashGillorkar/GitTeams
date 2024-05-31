package com.application.service;

import com.application.model.Student;

public interface StudentServiceI {

	public Student saveStudent(Student stu);
	
	public Iterable<Student> getAllData();

}
