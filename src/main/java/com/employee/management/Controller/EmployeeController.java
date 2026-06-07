package com.employee.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.Entity.Employees;
import com.employee.management.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired EmployeeService service;
	
	@PostMapping("/createEmployee")
	public Employees createUser(@RequestBody Employees employee) {
		return service.createEmployee(employee);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employees> getAllCandidates(){
		return service.getAllEmployees();
	}
	
	
}
