package com.antra.Practice2;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	private List<Course> courses=new ArrayList<>();
	public void instructorForCourse(Course course) {
		for(Course c:courses) {
			if(c.getPeriod()==course.getPeriod()) {
				throw new IllegalArgumentException("Instructor have obtained period");
			}
			courses.add(course);
		}
	}

}
