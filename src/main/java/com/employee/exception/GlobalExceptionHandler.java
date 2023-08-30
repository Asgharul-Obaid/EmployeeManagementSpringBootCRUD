package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.constant.EmployeeConstant;
import com.employee.vo.ErrorsDetailsVO;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmplException.class)
	public ResponseEntity<Object> handleEmployeeException(EmplException emplException,HttpServletRequest httpServletRequest){
	 ErrorsDetailsVO errorsDetailsVO = new ErrorsDetailsVO();
	 errorsDetailsVO.setErrorCode(errorsDetailsVO.getErrorCode());
	 errorsDetailsVO.setErrorMessage(errorsDetailsVO.getErrorMessage());
	 errorsDetailsVO.setResult(EmployeeConstant.RESULT);
	 errorsDetailsVO.setRequestURI(httpServletRequest.getRequestURI());
	 errorsDetailsVO.setHttpStatus(HttpStatus.BAD_REQUEST);
	return ResponseEntity.accepted().body(errorsDetailsVO) ;
	 	
	}
}
