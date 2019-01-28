package com.faheem.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.faheem.springboot.model.Employee;
import com.faheem.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/") //localhost:8080
	public ResponseEntity<Object> welcome(){
		return new ResponseEntity<>("hello",HttpStatus.OK);
	}
	
	@PostMapping(value = "/employee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		if(employeeService.addEmployee(employee))
			return new ResponseEntity<>("Employee added successfully",HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Unable to add Employee due to some exception",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
//	@DeleteMapping(value = "/employee/{employeeId}")
//		public ResponseEntity<Object> deleteEmployee(@PathVariable String employeeId) {
//			if(employeeService.)
//		}

	
	
	@GetMapping(value = "/employee")
	public ResponseEntity<Object> getAllEmpoyee() {
		return new ResponseEntity<>(employeeService.getEmployee(),HttpStatus.OK);
	}
}
