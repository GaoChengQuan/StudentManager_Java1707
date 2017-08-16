package com.situ.student.controller;

import java.util.List;

import com.situ.student.exception.NameRepeatException;
import com.situ.student.pojo.Student;
import com.situ.student.service.IStudentService;
import com.situ.student.service.impl.StudentServiceImpl;
/**
 * controller层作用: 控制层, 获取界面上的数据,为界面设置数据; 将要实现的功能交给业务层处理
 * 后期这一块是SpringMVC帮助我们管理
 * @author GaoMatrix
 *
 */
public class StudentController {
	private IStudentService studentService = new StudentServiceImpl();

	public List<Student> findAll() {
		return studentService.findAll();
	}

	public boolean add(String name, int age, String gender, String address) throws NameRepeatException {
		Student student = new Student(name, age, gender, address);
		return studentService.add(student);
	}
	
}
