package com.employee.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "emp_management")
public class EmployeeManagment {
					
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
