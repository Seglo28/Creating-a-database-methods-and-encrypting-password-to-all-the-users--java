package com.practice.hashpassword;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//Class with methods to use the encryption.
public class Hashpassword {

	//Encoded a password
	public String encodedPassword(String parameter) {
		String result = "";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		result = passwordEncoder.encode(parameter);
		return result;
	}
	
	//Read a password
}
