package com.lt.service;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Report;
import com.lt.bean.Student;



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

	public List<Course> addCourse(List<Course> course);
	
	public String removeCourse(String courseId);
	
	public List<Course> courses();
	
	public int addStudent(Student student);

	public List<Student> viewStudents();
}
