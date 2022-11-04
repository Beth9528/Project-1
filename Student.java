package com.spring.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	 private int id;
	 private String first_name;
	 private String email;
	 private String gender;
	 @Autowired
	 private Course course;
	 
	public Student(int id, String first_name, String email, String gender, Course course) {
		this.id = id;
		this.first_name = first_name;
		this.email = email;
		this.gender = gender;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
		
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", email=" + email + ", gender=" + gender
				+ ", course=" + course.getCourse_no() + "" + course.getGrade() + "" + course.getCredit_hours() + "]";
	}
	
}
		
		
		
		
	
	
	
	
	 


