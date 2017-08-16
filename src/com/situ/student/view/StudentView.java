package com.situ.student.view;

import java.util.List;
import java.util.Scanner;

import com.situ.student.controller.StudentController;
import com.situ.student.exception.NameRepeatException;
import com.situ.student.pojo.Student;
/**
 * UI层的界面
 * @author GaoMatrix
 *
 */
public class StudentView {
	private StudentController studentController = new StudentController();;
	private Scanner scanner = new Scanner(System.in);
	
	public void showView() {
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
			add();
			break;
		case 3://修改

			break;
		case 4://删除

			break;

		default:
			break;
		}
	}

	private void add() {
		while (true) {
			System.out.println("请输入学生姓名：");
			String name = scanner.next();
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生性别：");
			String gender = scanner.next();
			System.out.println("请输入学生地址：");
			String address = scanner.next();
			boolean result = false;
			try {
				result = studentController.add(name, age, gender, address);
			} catch (NameRepeatException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			if (result) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
			
			System.out.println("是否继续输入：1：继续  0：退出");
			int quit = scanner.nextInt();
			if (quit == 0) {
				break;
			}
		}
	}

	private void findAll() {
		List<Student> list = studentController.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
}
