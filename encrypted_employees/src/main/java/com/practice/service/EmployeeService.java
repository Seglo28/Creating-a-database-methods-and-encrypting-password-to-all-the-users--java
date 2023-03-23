package com.practice.service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.practice.entities.Employees;

@Repository("employeeservice")
public interface EmployeeService extends CrudRepository<Employees, Integer>{
	
	public Employees findByEmail(String email);
	
}
