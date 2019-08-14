package com.izatech.care9.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDaoImpl studentdao;

	@Override
	@Transactional
	public List<Student> findout() {
		return studentdao.findall();
	}

	

	@Override
	@Transactional
	public void save(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
