package com.employee.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmplException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1817712767785478316L;

	private String errorCode;
	
	private String errorStatus;
	
	private HttpStatus httpStatus;
	
	
}
