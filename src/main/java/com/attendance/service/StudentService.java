package com.attendance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entities.StudentEntity;
import com.attendance.repository.StudentRepository;
import com.attendance.exception.RecordNotFoundException;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentrepo;
	

	public StudentEntity savestudent(StudentEntity student) {
	
	return	studentrepo.save(student);
	}
	
	public StudentEntity update(StudentEntity entity) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		Optional<StudentEntity> stuEntity = studentrepo.findById((int) entity.getRollNo());
		if(!stuEntity.isPresent()) {
			throw new RecordNotFoundException("No record found in the DataBase");
		}
		return studentrepo.save(entity);
	}
	public StudentEntity delete(StudentEntity entity) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		Optional<StudentEntity> stuEntity = studentrepo.findById((int) entity.getRollNo());
		if(!stuEntity.isPresent()) {
			throw new RecordNotFoundException("No record found in the DataBase");
		}
		studentrepo.delete(entity);
		return entity;
	}
	public List<StudentEntity> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}
	
	public StudentEntity findByPk(int id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id).get();
	}

//	
//	public StudentEntity findByName(String name) {
//		// TODO Auto-generated method stub
//      return studentrepo.findByName(name).get();
//	}

	
}
