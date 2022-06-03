package com.lt.exception;

/**
 * This is the Exception class which returns exception message.
 * 
 * @param args Unused.
 * @return Nothing.
 * 
 */
public class CourseNotFoundException extends RuntimeException {
	/**
	 * 
	 * This method return exception message .
	 * return CourseNotFoundException
	 */

	public CourseNotFoundException(String errorMessage) {  
	    super(errorMessage); 

}
}
