package com.attendance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.attendance.entities.Subject;
import com.attendance.service.implementation.SubjectService;

@RestController
public class SubjectController {

	
	
	@Autowired
	private SubjectService subjectservice;
	
	  @PostMapping("/addsubject")
			public Subject addAdmin(@RequestBody Subject subject) {
				
				return subjectservice.saveSubject(subject);
			}
}
