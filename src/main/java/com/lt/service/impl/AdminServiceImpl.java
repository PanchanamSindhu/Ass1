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

	Admin admin = new Admin();
	List<Course> course=new ArrayList<Course>();
	
	@Autowired
	private AdminDao adminDao;

	/**
	 * This method allows user to add  professor. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public List<Professor> addProfessor(List<Professor> pf ) {
		 List<Professor> pList=new ArrayList<Professor>();
		
		pList.addAll(adminDao.addProfessor(pf));
		return  pList;
	}

	/**
	 * This method allows user to approve  Students. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public void approveStudents() {
		// TODO Auto-generated method stub
		// adminDao.approveStudents();
		AdminDao adminDao = new AdminDao();
		adminDao.approveStudents();
	}

	/**
	 * This method allows user to generate  reportCard. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public Report generateReportCard(int id) {
		// TODO Auto-generated method stub
		return adminDao.generateReportCard(id);
		
	}

	/**
	 * This method allows user to add  courses. 
	 * @param unused
	 * @return List.
	 */
	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		
		AdminDao adminDao = new AdminDao();
		course.addAll(adminDao.addCourse());
		System.out.println(" COURSES ADDED :");
		course.stream().forEach(System.out::println);
		//System.out.println("courses :"+course);
		loginList();

	}
	/**
	 * This method displays admin menu. 
	 * @param unused
	 * @return nothing.
	 */
	
	@Override
	public void loginList() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1 - Add Professor ");
		System.out.println(" 2 - Approve Students");
		System.out.println(" 3 - Generate Report Card ");
		System.out.println(" 4 - Add Course ");
		System.out.println(" 5 - Remove Course ");
		System.out.println(" 6 - Logout ");
		int a = sc.nextInt();
		List<Course> course=new ArrayList<Course>();

		if (a == 1) {
			//addProfessor();
		} else if (a == 2) {
			approveStudents();
		} else if (a == 3) {
			//generateReportCard();
		} else if (a == 4) {
			addCourse();
		} else if (a == 5) {

			removeCourse();
		}
		else if (a == 6) {

			//CRSApplication.optionSelect();
		}

	}

	/**
	 * This method allows user to remove  courses. 
	 * @param unused
	 * @return List.
	 */
	@Override
	public void removeCourse() {
		AdminDao adminDao = new AdminDao();
		adminDao.removeCourse(course);

	}

}
