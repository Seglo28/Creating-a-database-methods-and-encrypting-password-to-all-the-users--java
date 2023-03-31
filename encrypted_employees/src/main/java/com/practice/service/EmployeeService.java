package com.practice.service;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.practice.entities.Employees;

@Repository("employeeservice")
public interface EmployeeService extends CrudRepository<Employees, Integer>{
	
	public Optional<Employees> findByEmail(String email);
	
}
