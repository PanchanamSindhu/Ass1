package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Report;

/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface StudentService {

	public void registerCourse(String input);

	public Report viewreportcard(int id);

	public List<Course> viewCatalog();

	public void payFee();

	public void course();
	
	public void viewStudents();
	

}
