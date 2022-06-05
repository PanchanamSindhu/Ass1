/**
 * 
 */
package com.lt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Student;

/**
 * @author user211
 *
 */
@Repository
public class ProfessorDao implements ProfessorDaoInterface {

	@Autowired
	private AdminDao adminDao;

	@Override
	public Student addGrades(int studentID, Student student) {
		Student studentObj = new Student();
		for (Student s : adminDao.viewStudents()) {
			if (s.getStudentId() == studentID) {
				s.setGrade(student.getGrade());
				studentObj = s;
			}
		}
		return studentObj;
	}

}
