package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.service.impl.StudentServiceImpl;

/**
 * This is the Controller uses @RestController annotation and 
 * allows the class to handle the requests made by the client.
 * 
 * @param args unused.
 * @return Nothing.
 * 
 */
@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	/**
	 * This method uses @PostMapping annotation it handles the 
	 * HTTP POST requests matched with given URI expression
	 * 
	 * @param args unused.
	 * @return ResponseEntity<String>.
	 */
	@PostMapping("/registerStudent")
	public ResponseEntity<String> StudentRegistration(@RequestBody Student student) {

		studentService.registerStudent(student);
		return new ResponseEntity<String>("Registration Sucessfull", HttpStatus.OK);

	}
	
	@PostMapping("/loginStudent/{studentId}")
	public ResponseEntity<String> loginStudent(@PathVariable("studentId") int studentId ,@RequestBody Student student) {

		studentService.login(studentId,student);
		return new ResponseEntity<String>(studentService.login(studentId,student), HttpStatus.OK);

	}
	
	/**
	 * This method uses @GetMapping annotation it handles the 
	 * HTTP POST requests matched with given URI expression
	 * 
	 * @param args unused.
	 * @return ResponseEntity<List<Course>>.
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/viewcatalog")
	@ResponseBody
	public ResponseEntity<List<Course>> viewCatalog() {
		List<Course> allCourses = studentService.viewCatalog();
		return new ResponseEntity<List<Course>>(allCourses, HttpStatus.OK);
	}
	
	/**
	 * This method uses @PutMapping annotation it handles the 
	 * HTTP POST requests matched with given URI expression
	 * 
	 * @param args unused.
	 * @return String.
	 */
	@RequestMapping(value = "/registerCourse/{id}", method = RequestMethod.PUT, consumes = "application/json")
	@ResponseBody
	public String registerCourse(@PathVariable("id") int id, @RequestBody Student student) {

		return studentService.registerCourse(id, student);

	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/deleteCourse/{courseCode}/{id}")
	@ResponseBody
	public ResponseEntity<Student> deleteCourse(@PathVariable("courseCode") String courseCode ,@PathVariable("id") int studentId)  {
		Student s=studentService.removeCourse(courseCode,studentId);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}
	
	
	
}
