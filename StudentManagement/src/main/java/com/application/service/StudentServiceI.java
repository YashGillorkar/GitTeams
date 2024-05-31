package com.application.service;

import com.application.model.Student;

public interface StudentServiceI {


	void deleteStudentById(int id);

	public Iterable<Student> getAllData();


}
