package com.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private double marks;
	private String review;

}
