package com.lt.bean;

import java.util.List;
import java.util.Map;

public class Student {

	private int studentId;
	private String studentName;
    private List<String> courses;
	private Map<String,String> grade;
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the courses
	 */
	public List<String> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	/**
	 * @return the grade
	 */
	public Map<String, String> getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Map<String, String> grade) {
		this.grade = grade;
	}
	
	
}	