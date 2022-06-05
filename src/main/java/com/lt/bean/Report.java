package com.lt.bean;


public class Report {

	private int studentId;
	private Integer semester;
	private float cgpa;
	private RegisteredCourse registeredCourses;

	
	/**
	 * @return the registeredCourses
	 */
	public RegisteredCourse getRegisteredCourses() {
		return registeredCourses;
	}

	/**
	 * @param registeredCourses the registeredCourses to set
	 */
	public void setRegisteredCourses(RegisteredCourse registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	

}