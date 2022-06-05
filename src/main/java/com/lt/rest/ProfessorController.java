package com.lt.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Student;
import com.lt.service.impl.ProfessorServiceImpl;

@RestController
@CrossOrigin
public class ProfessorController {
	
	@Autowired
	private ProfessorServiceImpl professor;
	
	@PutMapping("/addGrades/{sid}")
	public ResponseEntity<Student> addGrades(@PathVariable("sid") int sid,
			@RequestBody Student student) {
		professor.addGrades(sid, student);
		return new ResponseEntity<Student>(professor.addGrades(sid, student), HttpStatus.OK);
	}

}
