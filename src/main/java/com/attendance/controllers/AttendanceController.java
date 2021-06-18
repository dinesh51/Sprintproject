package com.attendance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.entities.AttendanceEntity;
import com.attendance.entities.StudentEntity;
import com.attendance.service.AttendanceService;
import com.attendance.service.StudentService;

@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService attend;
	
	  @PostMapping("/addattendance")
			public AttendanceEntity addattendance(@RequestBody AttendanceEntity attendance) {
				
		    return attend.saveAttendance(attendance);
			}
	
	
	
}
