package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee-management")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public EmployeeDto employeeDto(@RequestBody EmployeeDto employeeDto) {
		return employeeService.saveEmployee(employeeDto);
	}

	@GetMapping()
	public List<EmployeeDto> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/{id}")
	public EmployeeDto findEmployeeById(@PathVariable long id) {
		return employeeService.findEmpById(id);
	}

	@PutMapping("/updateEmp")
	public EmployeeDto updatEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.updatEmployeeDto(employeeDto);
	}


	@PutMapping("/inActive/{id}")
	public EmployeeDto deleteEmployeeInActive(@PathVariable long id) {
		return employeeService.deleteEmployeeInActive(id);
	}

	@PutMapping("/delete/{id}")
	public String deleteEmployeeFromDB(@PathVariable long id) {
		return employeeService.deleteEmployeeFromDB(id);
	}

}
