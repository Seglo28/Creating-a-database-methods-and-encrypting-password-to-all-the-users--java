package com.practice.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import com.practice.entities.Employees;
import com.practice.hashpassword.Hashpassword;

@Component
public class EmployeeServiceImplement implements EmployeeService{

	@Autowired
	private EmployeeService employeeService;

	//Import
			Hashpassword password = new Hashpassword();
			
	public Employees save (Employees employees) {
		
		Employees newEmployee = new Employees();
		
		newEmployee.setFirtsName(employees.getFirtsName());
		newEmployee.setLastName(employees.getLastName());
		newEmployee.setEmail(employees.getEmail());
		newEmployee.setPassword(password.encodedPassword(employees.getPassword()));
		
		return employeeService.save(newEmployee);
	}


	

	@Override
	public <S extends Employees> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Employees> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterable<Employees> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterable<Employees> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Employees entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Employees> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Employees findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



}
