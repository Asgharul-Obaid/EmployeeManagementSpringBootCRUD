package com.employee.vo;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorsDetailsVO {

	private String errorCode;
	private String errorMessage;
	private String result;
	private String requestURI;
	private HttpStatus httpStatus;

}
