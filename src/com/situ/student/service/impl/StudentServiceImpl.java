package com.situ.student.service.impl;

import java.util.List;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoMySqlImpl;
import com.situ.student.exception.NameRepeatException;
import com.situ.student.pojo.Student;
import com.situ.student.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	private IStudentDao studentDao = new StudentDaoMySqlImpl();
			
	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public boolean add(Student student) throws NameRepeatException {
		//1.判断这个学生是否已经存在
		if (studentDao.checkName(student.getName())) {//用户已经存在
			//System.out.println("用户名已经存在");
			// return false;
			throw new NameRepeatException("用户名已经存在");
		} else {//用户不存在
			// return studentDao.add(student) > 0 ? true : false;
			int result = studentDao.add(student);
			if (result > 0) {
				return true;
			} else {
				return false;
			}
		}
	}

}
