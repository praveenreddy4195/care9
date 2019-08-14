package com.izatech.care9.student;

import java.util.List;

import org.springframework.stereotype.Service;


public interface StudentService {
	
	public List<Student> findout();
	
	public Student findbyId(int id);
	
	public void save(Student student);
	
	public void delete(int id);
	
	

}
