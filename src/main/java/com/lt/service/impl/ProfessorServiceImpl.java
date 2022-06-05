package com.lt.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.bean.Student;
import com.lt.dao.ProfessorDao;
import com.lt.service.ProfessorService;

/**
 * The class that implements from ProfessorService interface to provide body for unimplemented methods .
 * 
 * @author Group5
 * @since 05-31-2022
 */
@Service
public class ProfessorServiceImpl implements ProfessorService {
	
	@Autowired
	private ProfessorDao professorDao;

	@Override
	public Student addGrades(int studentID, Student student) {

		return professorDao.addGrades(studentID, student);

	}
	
	/**
	 * This method allows user to view  registered students. 
	 * @param unused
	 * @return nothing.
	 */
	@Override
	public void viewRegisteredStudents() {
		

	}

	/**
	 * This method allows user to select  course. 
	 * @param unused
	 * @return nothing.
	 */
	

}
