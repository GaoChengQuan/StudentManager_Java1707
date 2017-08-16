package com.situ.student.service;

import java.util.List;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoMySqlImpl;
import com.situ.student.pojo.Student;

public class StudentServiceImpl implements IStudentService{
	private IStudentDao studentDao = new StudentDaoMySqlImpl();
			
	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

}
