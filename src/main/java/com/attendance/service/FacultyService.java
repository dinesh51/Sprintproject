package com.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entities.Faculty;
import com.attendance.repository.FacultyRepository;

@Service
public class FacultyService {

	
	
	@Autowired
	public FacultyRepository repof;
	
	public Faculty saveFaculty(Faculty faculty) {
		
		return	repof.save(faculty);
}
	
	
	
	public  List<Faculty> getFaculty(){
		
		return	repof.findAll();
			
	}
	
	/*	private long id;
	private String Name;
	private String mobileNo;
	private int roleId;
	private String gender;
	private String password;
	private String confirmPassword;
	subject;
	*/
	
	
	   public  Faculty updatefaculty(Faculty faculty){
	    	
	    	Faculty existing=repof.findById((int) faculty.getId()).orElse(null);
	    	existing.setName(faculty.getName());
	    	existing.setMobileNo(faculty.getMobileNo());
	    	existing.setRoleId(faculty.getRoleId());
	    	
	    	existing.setGender(faculty.getGender());
	    	existing.setPassword(faculty.getPassword());
	    	existing.setConfirmPassword(faculty.getConfirmPassword());

	    	existing.setSubject(faculty.getSubject());
	    	return repof.save(existing);
	    	
	    	
	    }
}
