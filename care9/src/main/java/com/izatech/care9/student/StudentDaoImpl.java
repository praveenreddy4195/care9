package com.izatech.care9.student;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	@Transactional
	public List<Student> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
