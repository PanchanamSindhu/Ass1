package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Course;
import com.lt.bean.RegisteredCourse;
import com.lt.bean.Student;
import com.lt.service.impl.StudentServiceImpl;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	@PostMapping("/registerStudent")
	public ResponseEntity<String> StudentRegistration(@RequestBody Student student) {

		studentService.registerStudent(student);
		return new ResponseEntity<String>("Registration Sucessfull", HttpStatus.OK);

	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/viewcatalog")
	@ResponseBody
	public ResponseEntity<List<Course>> viewCatalog() {
		List<Course> allCourses = studentService.viewCatalog();
		return new ResponseEntity<List<Course>>(allCourses, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/registerCourse/{id}", method = RequestMethod.PUT, consumes = "application/json")
	@ResponseBody
	public String registerCourse(@PathVariable("id") int id, @RequestBody Student student) {

		return studentService.registerCourse(id, student);

	}
	
	
	
}
