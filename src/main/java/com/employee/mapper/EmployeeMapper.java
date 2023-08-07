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
		employeeDto.setFirstNmae(employeeManagment.getFirstNmae());
		employeeDto.setLastName(employeeManagment.getLastName());
		employeeDto.setEmail(employeeDto.getEmail());
		employeeDto.setCity(employeeDto.getCity());
		employeeDto.setAddress(employeeManagment.getAddress());
		employeeDto.setContact(employeeManagment.getContact());
		employeeDto.setIsActive(employeeManagment.getIsActive());
		employeeDto.setCreatedOn(employeeManagment.getCreatedOn());
		
		return employeeDto;
	}
	public static EmployeeManagment employeeManagementDtoToEntity(EmployeeDto employeeDto) {
		
		if (Objects.isNull(employeeDto)) {
			return null;
		}
		EmployeeManagment managment = new EmployeeManagment();
		managment.setId(employeeDto.getId());
		managment.setFirstNmae(employeeDto.getFirstNmae());
		managment.setLastName(employeeDto.getLastName());
		managment.setEmail(employeeDto.getEmail());
		managment.setCity(employeeDto.getCity());
		managment.setAddress(employeeDto.getAddress());
		managment.setContact(employeeDto.getContact());
		managment.setIsActive(employeeDto.getIsActive());
		managment.setCreatedOn(employeeDto.getCreatedOn());
		
		return managment;
	}
}
