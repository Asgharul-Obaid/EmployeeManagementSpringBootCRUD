package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.employee.dto.EmployeeDto;
import com.employee.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		
		employeeRepository.findByFirstNameAndLastNameAndIsActive("Obaid k", "sidd", "Y");
	}

}
