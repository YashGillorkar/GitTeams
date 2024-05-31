package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Student;
import com.application.service.StudentServiceI;

@RestController
public class HomeController {

	@Autowired
	StudentServiceI ssi;
       
	@GetMapping("/getAllData")
	public Iterable<Student> getAllData(){
		Iterable<Student> list=ssi.getAllData();
		return list;
	}
}
