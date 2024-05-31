package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.StudentServiceI;

@RestController
public class HomeController {

	@Autowired StudentServiceI ssi;
	
	
	@DeleteMapping("deleteOp/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        ssi.deleteStudentById(id);
        return new ResponseEntity<String>("Deleted succcessfully", HttpStatus.OK);
    }
}
