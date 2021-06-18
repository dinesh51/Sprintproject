package com.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attendance.entities.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {

	
	
}





