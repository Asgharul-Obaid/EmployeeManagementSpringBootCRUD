package com.employee.entity;

import java.io.Serializable;
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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "emp_management")
public class EmployeeManagment implements Serializable{
					
	/**
	 * 
	 */
	private static final long serialVersionUID = -2250332995120466525L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
