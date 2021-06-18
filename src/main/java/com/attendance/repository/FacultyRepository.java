package com.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attendance.entities.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

	
	
}