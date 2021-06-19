package com.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entities.UserEntity;
import com.attendance.repository.UserEntityRepository;

@Service
public class UserEntityService {

	@Autowired
	public UserEntityRepository userRepository;
	
	public UserEntity saveAdmin(UserEntity user) {
		
		return	userRepository.save(user);
			
	}
	
	
	public  List<UserEntity> getAdminList(){
		
		return	userRepository.findAllAdmins();
			
	}
	
	
	public  UserEntity updateAdmin(UserEntity user){
		
		UserEntity existing=userRepository.findById(user.getId()).orElse(null);
		existing.setName(user.getName());
		existing.setMobileNo(user.getMobileNo());
		existing.setRoleId(user.getRoleId());
		existing.setGender(user.getGender());
		existing.setPassword(user.getPassword());
		existing.setConfirmPassword(user.getConfirmPassword());
		return userRepository.save(existing);
		
		
	}
	
	public  String deleteAdmin(int id){
		
		userRepository.deleteById(id);	
		return "Admin deleted Successfully";
}


	public String login(String name, String password) {
		UserEntity user= userRepository.findByEmail(name);
		 if (user == null) {
	           return "not found";
	        }

		 else
		 {
			 return "found";
		 }
		
	}


		
	
	
}
