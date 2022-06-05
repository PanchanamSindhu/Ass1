package com.lt.service;

import java.util.Map;

import com.lt.bean.Student;

public interface ProfessorService {

	public Student addGrades(int studentID, Student student);

	public void viewRegisteredStudents();

	
}
