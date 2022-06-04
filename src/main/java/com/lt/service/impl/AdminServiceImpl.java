package com.lt.service.impl;

import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lt.bean.Admin;
import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Report;
import com.lt.dao.AdminDao;
import com.lt.service.AdminService;


/**
 * The class that implements from AdminService interface to provide body for unimplemented methods .
 * 
 * @author Group5
 * @since 05-31-2022
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	static List<Course> CourseList=new ArrayList<Course>();

	/**
	 * This method allows user to add  professor. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public List<Professor> addProfessor(List<Professor> pf) {
		List<Professor> pList = new ArrayList<Professor>();

		pList.addAll(adminDao.addProfessor(pf));
		return pList;
	}

	/**
	 * This method allows user to approve  Students. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public void approveStudents() {
		
	}

	/**
	 * This method allows user to generate  reportCard. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public Report generateReportCard(int id) {

		return adminDao.generateReportCard(id);

	}

	/**
	 * This method allows user to add  courses. 
	 * @param unused
	 * @return List.
	 */
	@Override
	public List<Course> addCourse(List<Course> course1) {

		CourseList.addAll(adminDao.addCourse(course1));
		return CourseList;

	}

	/**
	 * This method allows user to remove  courses. 
	 * @param unused
	 * @return String.
	 */
	@Override
	public String removeCourse(String courseId) {
		String msg = adminDao.removeCourse(courseId);
		return msg;

	}

	/**
	 * This method allows user to view all  courses. 
	 * @param unused
	 * @return List.
	 */
	@Override
	public List<Course> courses() {
		
		return adminDao.courses();
	}

}
