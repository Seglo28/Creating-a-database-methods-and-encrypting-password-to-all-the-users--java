package com.practice.hashpassword;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.practice.entities.Employees;
import com.practice.service.EmployeeService;
import com.practice.service.EmployeeServiceImplement;

@Service
//Class with methods to use the encryption.
public class Hashpassword {
	
	
	@Autowired
	private final EmployeeServiceImplement serviceImplement;
	
	
	   public Hashpassword(@Lazy EmployeeServiceImplement serviceImplement) {
	      this.serviceImplement = serviceImplement;
	   }
	
	public Hashpassword() {
		this.serviceImplement = null;
		// TODO Auto-generated constructor stub
	}

	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	//Encoded a password
	public String encodedPassword(String parameter) {
		String result = "";
		result = passwordEncoder.encode(parameter);
		return result;
	}
	
	//Read a password
	public Employees validatePassword(String email, String rawPassword) {
		
		String dataPassword = this.employeeData(email).getPassword();
		int employeeId = this.employeeData(email).getId();
		
		Employees employee = serviceImplement.findById(employeeId).get();
		
			if (passwordEncoder.matches(rawPassword, dataPassword)){
				employee.getFirtsName();
				employee.getLastName();
				employee.getEmail();
			}
			return employee;
	}
	
	private Employees employeeData(String email) {
		Employees employeeData = serviceImplement.findByEmail(email).get();
		System.out.println(employeeData);
		return employeeData;
    }
}