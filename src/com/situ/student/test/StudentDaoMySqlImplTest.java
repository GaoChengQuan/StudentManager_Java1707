package com.situ.student.test;


import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoMySqlImpl;
import com.situ.student.pojo.Student;

public class StudentDaoMySqlImplTest {
	
	@Test
	public void testAdd() {
		Student student = new Student("张三222", 30, "男", "北京", new Date());
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		int result = studentDao.add(student);
		if (result > 0) {
			System.out.println("插入成功");
		} else {
			System.out.println("插入失败");
		}
	}
	
	@Test
	public void testFindAll() {
		IStudentDao studentDao = new StudentDaoMySqlImpl();
		List<Student> list = studentDao.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
