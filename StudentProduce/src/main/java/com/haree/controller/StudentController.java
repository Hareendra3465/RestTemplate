package com.haree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haree.model.Student;

@RestController
public class StudentController {
	
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public Student firstPage() {
		
		Student st = new Student();
		st.setName("Haree");
		st.setSport("Football");
		st.setLevel("High School");
		
		return st;
	}

}
