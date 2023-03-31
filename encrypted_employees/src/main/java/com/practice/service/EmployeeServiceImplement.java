package com.practice.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.practice.entities.Employees;
import com.practice.hashpassword.Hashpassword;

@Service
public class EmployeeServiceImplement implements EmployeeService{

	@Autowired
	private EmployeeService employeeService;
	
	
	   public EmployeeServiceImplement(@Lazy EmployeeService EmployeeService) {
	      this.employeeService = EmployeeService;
	   }

	//Import
	
	Hashpassword passwordDetails = new Hashpassword();
			
	public Employees save (Employees employees) {
		Employees newEmployee = new Employees();
		newEmployee.setFirtsName(employees.getFirtsName());
		newEmployee.setLastName(employees.getLastName());
		newEmployee.setEmail(employees.getEmail());
		newEmployee.setPassword(passwordDetails.encodedPassword(employees.getPassword()));
		employeeService.save(newEmployee);
		return newEmployee;
	}
	
	public Employees login (Employees emp) {
		Employees data = new Employees();
		System.out.println("METODO LOGIN DE IMPLEMENTS");
		if(this.findByEmail(emp.getEmail()).isPresent()) {
			System.out.println("METODO LOGIN DE IMPLEMENTS: VALIDO EL EMAIL");
			data = passwordDetails.validatePassword(emp.getEmail(), emp.getPassword());
			System.out.println("METODO LOGIN DE IMPLEMENTS: VALIDO LA PASSWORD");
		}else {
			System.out.println("EL CORREO NO EXISTE");
		}
		return data;
	}

	@Override
	public <S extends Employees> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Employees> findById(Integer id) {
		return employeeService.findById(id);
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
	public Optional<Employees> findByEmail(String email) {
		return employeeService.findByEmail(email);
	}



}
