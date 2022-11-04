package com.spring.project1;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private String course_no;
	private String grade;
	private int credit_hours;
	
	public Course(String course_no, String grade, int credit_hours) {
		this.course_no = course_no;
		this.grade = grade;
		this.credit_hours = credit_hours;
	}

	public String getCourse_no() {
		return course_no;
	}

	public void setCourse_no(String course_no) {
		this.course_no = course_no;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getCredit_hours() {
		return credit_hours;
	}

	public void setCredit_hours(int credit_hours) {
		this.credit_hours = credit_hours;
	}

	@Override
	public String toString() {
		return "Course [course_no=" + course_no + ", grade=" + grade + ", credit_hours=" + credit_hours + "]";
	}
	
	
	

}
