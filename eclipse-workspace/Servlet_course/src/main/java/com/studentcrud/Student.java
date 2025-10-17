package com.studentcrud;

public class Student {

	private int id;
	private String name;
	private String email;
	private String course;
	
	// this is called model class.
	Student(int id, String name, String email, String course){
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}
	
	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//name	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//email	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 // course
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
