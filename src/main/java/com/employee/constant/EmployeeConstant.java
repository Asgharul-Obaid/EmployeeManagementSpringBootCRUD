package com.employee.constant;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.util.CollectionUtils;

public class EmployeeConstant {

	public static final Timestamp CURRENT_TIME = Timestamp.valueOf(LocalDateTime.now());
	
	public static final String RESULT="Failure";

	public static final String YES_FLAG = "Y";
	
	public static final String NO_FLAG = "Y";
	
	public static final String DELETE_MESSAGE_RESPONSE = "has been deleted Successfully !!";

	public static boolean checkListNullOrEmpty(List<?> list) {
		if(!CollectionUtils.isEmpty(list)) {
			return true;
		}
		return false;

	}
}
