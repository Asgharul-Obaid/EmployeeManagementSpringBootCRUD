package com.employee.constant;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class EmployeeConstant {

	public static final Timestamp CURRENT_TIME=Timestamp.valueOf(LocalDateTime.now());
	
	public static final String YES_FLAG="Y";
}
