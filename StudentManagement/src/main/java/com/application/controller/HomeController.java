package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Student;
import com.application.service.StudentServiceI;

@RestController
public class HomeController {


	@Autowired StudentServiceI ssi;
	
	@PostMapping("/createStudent")
	public ResponseEntity<Student>createStudent(@RequestBody Student stu){
		
		Student student = ssi.saveStudent(stu);
		
		System.out.println(student);
		
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}
	
	
	
	
	@DeleteMapping("deleteOp/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        ssi.deleteStudentById(id);
        return new ResponseEntity<String>("Deleted succcessfully", HttpStatus.OK);
    }

	
       
	@GetMapping("/getAllData")
	public Iterable<Student> getAllData(){
		Iterable<Student> list=ssi.getAllData();
		return list;
	}
	
	public void m1() {
		System.out.println("m1_____yash");
	}

}

