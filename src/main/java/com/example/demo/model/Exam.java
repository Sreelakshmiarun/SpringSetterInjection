package com.example.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("arun.xml");
		
		Student stu = context.getBean("student",Student.class);
		stu.display();
		
	    Student stud = context.getBean("dhas",Student.class);
	    stud.display();
	}

}
