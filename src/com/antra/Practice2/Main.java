package com.antra.Practice2;

public class Main {
	public static void main(String[] args) {
		College c=new College();
		Instructor i1=new Instructor();
		i1.setId(1);i1.setName("A");
		c.addInstructor(i1);
		Instructor i2=new Instructor();
		i2.setId(2);i2.setName("B");
		c.addInstructor(i2);
		Student s1=new Student();
		s1.setId(10);s1.setName("X");
		Student s2=new Student();
		s2.setId(11);s2.setName("Y");
		Student s3=new Student();
		s3.setId(13);s3.setName("Z");
		c.addStudent(s1);
		c.addStudent(s2);
		c.addStudent(s3);
		Course c1=new Course(1,10);
		Course c2=new Course(2,2);
		Course c3=new Course(1,5);
		i1.instructorForCourse(c1);
		i1.instructorForCourse(c3);
		i2.instructorForCourse(c2);
		i2.instructorForCourse(c1);
		c2.addStudent(s1);
		c2.addStudent(s2);
		c2.addStudent(s3);
		c1.addStudent(s1);
		c3.addStudent(s1);
		System.out.println(c);
		
	}

}
