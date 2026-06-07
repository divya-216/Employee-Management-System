package com.employee.management.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.management.Entity.Employees;
@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Integer> {

	List<Employees> findAll();
	
}
