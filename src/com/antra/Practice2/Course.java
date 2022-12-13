package com.antra.Practice2;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int period;
	private int max_student;
	private List<Student> students=new ArrayList<>();
	public Course(int period,int max_student) {
		super();
		this.period=period;
		this.max_student=max_student;
	}
	public int getPeriod() {
		return period;
	}
	public void addStudent(Student student) {
		if(students.size()>=max_student) {
			throw new IllegalArgumentException("Maximum Student Exced");
		}
		students.add(student);
	}

}
