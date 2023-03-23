package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entities.Employees;
import com.practice.service.EmployeeServiceImplement;


@RestController
@RequestMapping("/controller")
public class controller {
	
	
	@Autowired
	private EmployeeServiceImplement serviceImplement;
	
	@PostMapping("/save")
		public void save(@RequestBody Employees e) { 
		serviceImplement.save(e);
	}
	

}
