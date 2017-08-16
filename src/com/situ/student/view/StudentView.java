package com.situ.student.view;

import java.util.List;
import java.util.Scanner;

import com.situ.student.controller.StudentController;
import com.situ.student.pojo.Student;

public class StudentView {
	private StudentController studentController = new StudentController();;
	
	public void showView() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------学生信息管理系统----------");
		System.out.println("1、查询所有");
		System.out.println("2、添加");
		System.out.println("3、修改");
		System.out.println("4、删除");
		System.out.println("0、退出");
		System.out.println("请选择");
		int selected = scanner.nextInt();
		
		switch (selected) {
		case 1://查询所有
			findAll();
			break;
		case 2://添加

			break;
		case 3://修改

			break;
		case 4://删除

			break;

		default:
			break;
		}
	}

	private void findAll() {
		List<Student> list = studentController.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
}
