package com.application.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
