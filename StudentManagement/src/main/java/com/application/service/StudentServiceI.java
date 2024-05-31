package com.application.service;

import com.application.model.Student;

public interface StudentServiceI {

	
	
	public Student saveStudent(Student stu);
	

	void deleteStudentById(int id);

	public Iterable<Student> getAllData();


}
