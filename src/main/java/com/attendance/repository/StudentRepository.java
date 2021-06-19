package com.attendance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attendance.entities.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
