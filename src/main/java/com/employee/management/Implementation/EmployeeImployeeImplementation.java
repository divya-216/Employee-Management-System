package com.employee.management.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.Entity.Employees;
import com.employee.management.Repository.EmployeeRepository;
import com.employee.management.Service.EmployeeService;
@Service("EmployeeService")
public class EmployeeImployeeImplementation implements EmployeeService {

	@Autowired EmployeeRepository employeeRepository;
	
	@Override
	public List<Employees> getAllEmployees() {
		
		List<Employees> list = employeeRepository.findAll();

//		try {
//			List<Employees> list = employeeRepository.findAllEmployees();
//		}catch (Exception e) {
//			System.out.println("error message :" + e.getMessage());
//		}
		return list;
	}

	@Override
	public Employees createEmployee(Employees employee) {
		return employeeRepository.save(employee);
	}

}
