package com.employee.management.Service;

import java.util.List;

import com.employee.management.Entity.Employees;

public interface EmployeeService {

	
	public List<Employees> getAllEmployees();
	
	public Employees createEmployee(Employees employee);
}
