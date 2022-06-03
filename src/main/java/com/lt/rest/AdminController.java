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

import com.lt.bean.Professor;
import com.lt.bean.Report;
import com.lt.service.impl.AdminServiceImpl;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminService;
	
	@PostMapping(value = "/post/professor")
	public ResponseEntity<List<Professor>> addProfessor(@RequestBody List<Professor> professor) {
		
		List<Professor> pl = adminService.addProfessor(professor);
		return new ResponseEntity<List<Professor>>(pl, HttpStatus.OK);

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/reportCard/{id}")
	@ResponseBody
	public ResponseEntity<Report> generateReportCard(@PathVariable("id") int id) {
		Report report=adminService.generateReportCard(id);
		return new ResponseEntity<Report>(report, HttpStatus.OK);
	}
	
	
}
