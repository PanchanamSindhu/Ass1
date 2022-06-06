package com.lt.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Report;
import com.lt.bean.Student;
import com.lt.exception.CourseNotFoundException;



@Repository
public class StudentDao implements StudentDaoInterface {
	
	@Autowired
	 AdminDao adminDao;

	@Override
	public void registerCourse(int id, Student stundet) {
		for (Student s : adminDao.viewStudents()) {
			if (s.getStudentId() == id) {
				s.setCourses(stundet.getCourses());
			}
		}
	}

	@Override
	public Report viewreportcard(int i) {
		Report report = new Report();
		if (i == 1) {
			report.setStudentId(i);
			report.setCgpa(9.6f);
			report.setSemester(1);
			report.setRegisteredCourses(null);

		}
		if (i == 2) {
			report.setStudentId(i);
			report.setCgpa(7.5f);
			report.setSemester(2);
			report.setRegisteredCourses(null);
		}
		if (i == 3) {
			report.setStudentId(i);
			report.setCgpa(9.6f);
			report.setSemester(1);
			report.setRegisteredCourses(null);
		}
		if (i == 4) {
			report.setStudentId(i);
			report.setCgpa(8.2f);
			report.setSemester(2);
			report.setRegisteredCourses(null);
		}
		
		return report;

	}
	
	@Override
	public void registerStudent(Student student) {
		adminDao.addStudent(student);
		
	}
	

	@Override
	public Student removeCourse(String courseID,int  studentID) {
		Student s1=new Student();
		for(Student s:adminDao.viewStudents()) {
			if(s.getStudentId()==studentID) {
				
				s.getCourses().remove(courseID);
				s1=s;
			}else {
				throw new CourseNotFoundException("Invalid Course Code .please Enter valid code" );
			}
		}
		return s1;
		
	}

	@Override
	public String login(int id, Student student) {
		String msg="";
		for (Student s : adminDao.viewStudents()) {
			if (s.getStudentId() == id) {
				if (s.getPassword().equals(student.getPassword())) {
					msg = "Login succesfull";
				} else {
					msg = "Invalid creditentials.Please Enter valid username and Password";
				}
			}else {
				msg = "Please Enter Correct ID";
			}
		}
		return msg;
		
	}

}
