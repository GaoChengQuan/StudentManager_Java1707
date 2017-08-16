package com.situ.student.dao;

import java.util.List;

import org.junit.validator.PublicClassValidator;

import com.situ.student.pojo.Student;

public interface IStudentDao {

	/**
	 * 添加学生到数据库
	 * @param student
	 * @return
	 */
	public int add(Student student);
	
	/**
	 * 根据id删除指定的学生
	 * @param id
	 * @return
	 */
	public int deleteById(int id);
	
	/**
	 * 跟新学生信息
	 * @param student
	 * @return
	 */
	public int update(Student student);
	
	/**
	 * 返回所有学生信息
	 * @return
	 */
	public List<Student> findAll();
	
	/**
	 * 根据名字查询学生信息
	 * @param name
	 * @return
	 */
	public List<Student> findByName(String name);
	
	/**
	 * 根据性别查询学生信息
	 * @param name
	 * @return
	 */
	public List<Student> findByGender(String gender);
	
	/**
	 * 判断指定的用户名在数据库中是否存在
	 * @param name
	 * @return
	 */
	public boolean checkName(String name);
}
