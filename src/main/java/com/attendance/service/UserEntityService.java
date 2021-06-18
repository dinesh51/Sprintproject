package com.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entities.UserEntity;
import com.attendance.repository.UserEntityRepository;

@Service
public class UserEntityService {

	@Autowired
	public UserEntityRepository repo;
	
	public UserEntity saveproduct(UserEntity user) {
		
		return	repo.save(user);
			
	}

	
}
