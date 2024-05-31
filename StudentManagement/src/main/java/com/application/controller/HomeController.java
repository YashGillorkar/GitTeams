package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Student;
import com.application.service.StudentServiceI;

@RestController
public class HomeController {


	@Autowired StudentServiceI ssi;
	
	
	@DeleteMapping("deleteOp/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        ssi.deleteStudentById(id);
        return new ResponseEntity<String>("Deleted succcessfully", HttpStatus.OK);
    }

	@Autowired
	StudentServiceI ssi;
       
	@GetMapping("/getAllData")
	public Iterable<Student> getAllData(){
		Iterable<Student> list=ssi.getAllData();
		return list;
	}

}
