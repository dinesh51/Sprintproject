package com.attendance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.entities.Faculty;
import com.attendance.entities.UserEntity;
import com.attendance.service.FacultyService;
import com.attendance.service.UserEntityService;

@RestController
public class AdminController {
	@Autowired
	private UserEntityService serv;
	
	@Autowired
	private FacultyService facultyserv;
	
	  @PostMapping("/addAdmin")
		public UserEntity addAdmin(@RequestBody UserEntity user) {
			
			return serv.saveproduct(user);
		}
	
	  
	  @PostMapping("/addFaculty")
		public Faculty addFaculty(@RequestBody Faculty faculty) {
			
			return facultyserv.saveFaculty(faculty);
		}
	
	  
	    @GetMapping("/Faculty")
	    public List<Faculty> getFaculty() {
	        return facultyserv.getFaculty();
	    }

	
	    
	    @GetMapping("/updateFaculty")
	    public Faculty updatefaculty(@RequestBody Faculty faculty) {
	    	return facultyserv.updatefaculty(faculty);
	    }

	    
	
	  
	  
}
