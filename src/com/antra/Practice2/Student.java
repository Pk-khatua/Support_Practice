package com.antra.Practice2;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	private List<Course> courses=new ArrayList<>();
	public void registerCourse(Course course) {
		for(Course c:courses) {
			if(c.getPeriod()==course.getPeriod()) {
				throw new IllegalArgumentException("Student have obtained that period");
			}
			courses.add(course);
		}
	}

}
