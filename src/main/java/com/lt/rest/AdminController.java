package com.lt.rest;

import java.util.ArrayList;
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
import com.lt.bean.Professor;
import com.lt.bean.Report;
import com.lt.service.impl.AdminServiceImpl;

@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminServiceImpl adminService;

	List<Course> pl = new ArrayList<Course>();

	@PostMapping(value = "/post/professor")
	public ResponseEntity<List<Professor>> addProfessor(@RequestBody List<Professor> professor) {

		List<Professor> pl = adminService.addProfessor(professor);
		return new ResponseEntity<List<Professor>>(pl, HttpStatus.OK);

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/reportCard/{id}")
	@ResponseBody
	public ResponseEntity<Report> generateReportCard(@PathVariable("id") int id) {
		Report report = adminService.generateReportCard(id);
		return new ResponseEntity<Report>(report, HttpStatus.OK);
	}

	@PostMapping(value = "/post/course")
	public ResponseEntity<List<Course>> addCourse(@RequestBody List<Course> course) {

		pl.addAll(adminService.addCourse(course));
		return new ResponseEntity<List<Course>>(pl, HttpStatus.OK);

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/removeCourse/{courseCode}")
	@ResponseBody
	public ResponseEntity<String> removeCourse(@PathVariable("courseCode") String courseCode) {
		String msg = adminService.removeCourse(courseCode);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/courses")
	@ResponseBody
	public ResponseEntity<List<Course>> courses() {
		List<Course> allCourses = adminService.courses();
		return new ResponseEntity<List<Course>>(allCourses, HttpStatus.OK);
	}

}
