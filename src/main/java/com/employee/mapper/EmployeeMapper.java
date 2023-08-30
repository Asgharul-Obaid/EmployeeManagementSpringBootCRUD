package com.employee.mapper;

import java.util.Objects;

import com.employee.dto.EmployeeDto;
import com.employee.entity.EmployeeManagment;

public class EmployeeMapper {
	


	public static EmployeeDto entityToEmployeeManagementDto(EmployeeManagment employeeManagment) {
		if (Objects.isNull(employeeManagment)) {
			return null;
		}	
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(employeeManagment.getId());
		employeeDto.setFirstName(employeeManagment.getFirstName());
		employeeDto.setLastName(employeeManagment.getLastName());
		employeeDto.setEmail(employeeManagment.getEmail());
		employeeDto.setCity(employeeManagment.getCity());
		employeeDto.setAddress(employeeManagment.getAddress());
		employeeDto.setContact(employeeManagment.getContact());
		employeeDto.setIsActive(employeeManagment.getIsActive());
		employeeDto.setCreatedOn(employeeManagment.getCreatedOn());
		employeeDto.setUpdatedOn(employeeManagment.getUpdatedOn());
		employeeDto.setSalary(employeeManagment.getSalary());
		
		return employeeDto;
	}
	public static EmployeeManagment employeeManagementDtoToEntity(EmployeeDto employeeDto) {
		
		if (Objects.isNull(employeeDto)) {
			return null;
		}
		EmployeeManagment managment = new EmployeeManagment();
		managment.setId(employeeDto.getId());
		managment.setFirstName(employeeDto.getFirstName());
		managment.setLastName(employeeDto.getLastName());
		managment.setEmail(employeeDto.getEmail());
		managment.setCity(employeeDto.getCity());
		managment.setAddress(employeeDto.getAddress());
		managment.setContact(employeeDto.getContact());
		managment.setIsActive(employeeDto.getIsActive());
		managment.setCreatedOn(employeeDto.getCreatedOn());
		managment.setUpdatedOn(employeeDto.getUpdatedOn());	
		managment.setSalary(employeeDto.getSalary());
		return managment;
	}
}
