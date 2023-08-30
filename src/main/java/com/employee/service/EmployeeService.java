package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	List<EmployeeDto> getAllEmployee();

	EmployeeDto findEmpById(long id);
	
	EmployeeDto updatEmployeeDto(EmployeeDto employeeDto);
	
	EmployeeDto deleteEmployeeInActive(long id);
	
	String deleteEmployeeFromDB(long id);
	
	
}
