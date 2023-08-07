package com.employee.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private long id;
	
	private String firstNmae;
	
	private String  lastName;
	
	private String email;
	
	private String city;
	
	private String address;
	
	private String contact;
	
	private String isActive;
	
	private Timestamp createdOn;
	
	private Timestamp updatedOn;
}
