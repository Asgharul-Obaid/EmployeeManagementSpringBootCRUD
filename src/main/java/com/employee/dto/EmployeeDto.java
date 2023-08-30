package com.employee.dto;

import java.sql.Timestamp;

import org.springframework.beans.BeanUtils;

import com.employee.entity.EmployeeManagment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	
	public EmployeeDto(EmployeeManagment employeeManagment) {
		BeanUtils.copyProperties(employeeManagment, this);
	}

    private long id;
	
	private String firstName;
	
	private String  lastName;
	
	private String email;
	
	private String city;
	
	private String address;
	
	private String contact;
	
	private String isActive;
	
	private Timestamp createdOn;
	
	private Timestamp updatedOn;
	
	private Double salary;
	
}

