package com.lt.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.RegisteredCourse;
import com.lt.bean.Report;
import com.lt.bean.Student;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.PaymentDeclineException;
import com.lt.exception.StudentNotFoundException;
import com.lt.service.impl.StudentServiceImpl;

@Repository
public class StudentDao implements StudentDaoInterface {
	
	@Autowired
	 AdminDao adminDao;

	static List<RegisteredCourse> registeredCourse;

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
	public void payFee(int i) {}

	@Override
	public void viewFee() {
		// TODO Auto-generated method stub
		System.out.println("Fee Paied Succesfully!!");

	}
	@Override
	public void registerStudent(Student student) {
		adminDao.addStudent(student);
		
	}

	@Override
	public ArrayList course() {
		return null;
		
	}

}
