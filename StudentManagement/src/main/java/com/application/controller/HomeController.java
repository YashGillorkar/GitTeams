package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Student;
import com.application.service.StudentServiceI;

@RestController
public class HomeController {
	
	@Autowired StudentServiceI ssi;
	
	@PostMapping("/createStudent")
	public ResponseEntity<Student>  createStudent(@RequestBody Student stu){
		
		
		Student student = ssi.saveStudent(stu);
		
		
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
		
	}
}
