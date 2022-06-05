package com.lt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.bean.Course;
import com.lt.bean.RegisteredCourse;
import com.lt.bean.Report;
import com.lt.bean.Student;
import com.lt.dao.AdminDao;
import com.lt.dao.StudentDao;
import com.lt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public List<Course> viewCatalog() {
		return adminDao.courses();

	}
	
	@Override
	public String registerCourse(int StudentID, Student student) {
		
		studentDao.registerCourse(StudentID,student);
		return "Course Registered Succesful !!!";

	}

	@Override
	public Report viewreportcard(int id) {

		return studentDao.viewreportcard(id);
		
	}

	@Override
	public void registerStudent(Student student) {
		
		studentDao.registerStudent(student);
	}

	@Override
	public void payFee() {
		// TODO Auto-generated method stub
		
		//studentDao.payFee(i);

	}

	@Override
	public void course() {
		// TODO Auto-generated method stub
	
		ArrayList a = new ArrayList();
		a = studentDao.course();

	}


	

}
