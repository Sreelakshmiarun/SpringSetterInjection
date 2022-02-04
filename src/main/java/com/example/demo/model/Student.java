package com.example.demo.model;

public class Student {
	
	private int id;
	private String studentName;
	
	
	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method is called"+"  set id");
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter method s called"+"  set name");
	}

	
	void display()
	{
		System.out.println("Student name is:"+ studentName +" and id is:"+id );
	}

}
