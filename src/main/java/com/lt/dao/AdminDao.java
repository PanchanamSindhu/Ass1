package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Report;
import com.lt.bean.Student;

@Repository
public class AdminDao implements AdminDaoInterface {
	
	private static final Logger logger=LoggerFactory.getLogger(AdminDao.class);

	static List<Course> courseList = new ArrayList<Course>();
	static List<Student> StudentList = new ArrayList<Student>();
	static List<Professor> profList = new ArrayList<Professor>();

	/**
	 * 
	 * This method allow to add professors .
	 * return nothing
	 */
	@Override
	public List<Professor> addProfessor(List<Professor> pf) {

		for (Professor p : pf) {

			profList.add(p);
		}
		return profList;
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
		return null;

		

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
		logger.debug("List of Courses: "+courseList);
		logger.info("List of Courses");
		logger.error("List of Courses");
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

	@Override
	public int addStudent(Student student) {
		Student s1=new Student();
		s1.setStudentId(student.getStudentId());
		s1.setStudentName(student.getStudentName());
		s1.setPassword(student.getPassword());
		StudentList.add(s1);
		return s1.getStudentId();
	}

	@Override
	public List<Student> viewStudents() {
		// TODO Auto-generated method stub
		return StudentList;
	}

}
