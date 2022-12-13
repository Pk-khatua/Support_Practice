package com.antra.Practice2;

import java.util.ArrayList;
import java.util.List;

public class College {
	private List<Course> courses=new ArrayList<>();
	private List<Student> students=new ArrayList<>();
	private List<Instructor> instructors=new ArrayList<>();
	public void addStudent(Student student) {
		students.add(student);
	}
	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}
	public void addCourse(Course course) {
		courses.add(course);
	}
	public String toString() {
		return "College:[corses="+courses+", instructors="+instructors+", students="+students+"]";
	}

}
