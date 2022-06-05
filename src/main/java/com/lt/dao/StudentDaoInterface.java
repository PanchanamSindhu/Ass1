package com.lt.dao;

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
public interface StudentDaoInterface {

	public void registerCourse(int id, Student student);

	public Report viewreportcard(int i);

	public void payFee(int i);

	public void viewFee();

	public ArrayList course();
	
	public void registerStudent(Student student);
	


}
