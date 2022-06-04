package com.lt.bean;

public class Course {

	private String courseCode;
	private String courseName;
	private String isOffered;
	private String instructor;

	/**
	 * @return the isOffered
	 */
	public String getIsOffered() {
		return isOffered;
	}

	/**
	 * @param isOffered the isOffered to set
	 */
	public void setIsOffered(String isOffered) {
		this.isOffered = isOffered;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
