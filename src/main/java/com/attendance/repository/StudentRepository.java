package com.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attendance.entities.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
