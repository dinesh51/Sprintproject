package com.attendance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.entities.StudentEntity;
import com.attendance.entities.Subject;
import com.attendance.exception.RecordNotFoundException;
import com.attendance.service.StudentService;
import com.attendance.service.SubjectService;




@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	  @PostMapping("/addstudent")
			public StudentEntity addAdmin(@RequestBody StudentEntity student) {
				
				return studentservice.savestudent(student);
			}
	  @GetMapping("/getStudents")
		public List<StudentEntity>getStudents(){
			return studentservice.getAllStudents();
		}
	  @PutMapping("/updateStudent")
		public ResponseEntity<StudentEntity> updateStudent(@Validated @RequestBody StudentEntity entity) {
		try {
			return new ResponseEntity<StudentEntity>(studentservice.update(entity),HttpStatus.OK);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	  @GetMapping("/deleteStudent/{id}")
		public ResponseEntity<StudentEntity> deleteStudent(@PathVariable("id") int id) {
			StudentEntity entity = studentservice.findByPk(id);
			try {
				return new ResponseEntity<StudentEntity>(studentservice.delete(entity),HttpStatus.OK);
			} catch (RecordNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
//	  @GetMapping("/getbyname/{name}")
//		public ResponseEntity<StudentEntity>  getByName(@PathVariable("name") String name ) {
//		System.out.println(name);
//		return new ResponseEntity<StudentEntity>(studentservice.findByName(name),HttpStatus.OK);
//	}
	  
	  @GetMapping("/getStudent/{id}")
		public ResponseEntity<StudentEntity>  getStudent(@PathVariable("id") int id) {
			
			return new ResponseEntity<StudentEntity>(studentservice.findByPk(id),HttpStatus.OK);
		}
	  
	
}
