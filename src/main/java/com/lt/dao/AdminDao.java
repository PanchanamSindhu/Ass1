package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Report;

@Repository
public class AdminDao implements AdminDaoInterface {

	@Autowired
	private StudentDao studentDao;
	
	static List<Course> courseList = new ArrayList<Course>();

	/**
	 * 
	 * This method allow to add professors .
	 * return nothing
	 */
	@Override
	public List<Professor> addProfessor(List<Professor> pf) {

		List<Professor> prof = new ArrayList<Professor>();
		for (Professor p : pf) {

			prof.add(p);
		}
		return prof;
	}

	@Override
	public void approveStudents() {

	}

	/**
	 * 
	 * This method allows user to generate ReportCard .
	 * return nothing
	 */
	@Override
	public Report generateReportCard(int id) {

		Report report= studentDao.viewreportcard(id);
		return report;

	}

	/**
	 * 
	 * This method allows user to add course . 
	 * return List
	 */
	@Override
	public List<Course> addCourse(List<Course> cList) {

		for (Course course : cList) {
			Course courseObj=new Course();
			courseObj.setCourseCode(course.getCourseCode());
			courseObj.setCourseName(course.getCourseName());
			courseObj.setIsOffered(course.getIsOffered());
			courseObj.setInstructor(course.getInstructor());
			courseList.add(courseObj);
		}
		return courseList;
	}

	/**
	 * 
	 * This method allows user to remove course . 
	 * return nothing
	 */
	@Override
	public String removeCourse(String courseCode) {
		
		List<Course> cList=courseList.stream().filter(n->n.getCourseCode().equals(courseCode)).collect(Collectors.toList());
		courseList.removeAll(cList);
		return "Removed Succesfully";
	}

	@Override
	public List<Course> courses() {
		
		return courseList;
	}

}
