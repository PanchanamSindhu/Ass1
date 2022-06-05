package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.RegisteredCourse;
import com.lt.bean.Report;
import com.lt.bean.Student;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface StudentService {

	public String registerCourse(int studentId,Student student);

	public Report viewreportcard(int id);

	public List<Course> viewCatalog();

	public void payFee();

	public void course();
	
	public void registerStudent(Student student);
	

}
