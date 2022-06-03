package com.lt.service;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Report;



/**
 * Interface class that has the following methods.
 * 
 * @author Group5
 * @since 05-31-2022
 */
public interface AdminService {

	public List<Professor> addProfessor(List<Professor> pf);

	public void approveStudents();

	public Report generateReportCard(int id);

	public void addCourse();
	
	public void removeCourse();
	
	public void loginList();

}
