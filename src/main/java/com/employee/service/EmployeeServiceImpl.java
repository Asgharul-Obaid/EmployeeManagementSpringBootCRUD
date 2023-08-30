package com.employee.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.employee.constant.EmployeeConstant;
import com.employee.dto.EmployeeDto;
import com.employee.entity.EmployeeManagment;
import com.employee.exception.EmplException;
import com.employee.mapper.EmployeeMapper;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@org.springframework.beans.factory.annotation.Value("{${ems.employee.not.found.code}")
	private String empNotFoundCode;

	@org.springframework.beans.factory.annotation.Value("${ems.employee.not.found.message}")
	private String empNotFoundMessage;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		employeeDto.setCreatedOn(EmployeeConstant.CURRENT_TIME);
		EmployeeManagment empolyee = employeeRepository.save(EmployeeMapper.employeeManagementDtoToEntity(employeeDto));
		return EmployeeMapper.entityToEmployeeManagementDto(empolyee);
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<EmployeeManagment> employees = employeeRepository.findAll();
//		List<EmployeeDto> activeEmployee = new ArrayList<>();

		/*
		 * if (EmployeeConstant.checkListNullOrEmpty(employees)) { for(EmployeeManagment
		 * employeeManagment : employees) { ifō
		 * (employeeManagment.getIsActive().equalsIgnoreCase(EmployeeConstant.YES_FLAG))
		 * { activeEmployee.add(EmployeeMapper.entityToEmployeeManagementDto(
		 * employeeManagment)); } } } return activeEmployee;
		 */

		return employees.stream().filter(employee -> employee.getIsActive().equalsIgnoreCase(EmployeeConstant.YES_FLAG))
				.map(EmployeeMapper::entityToEmployeeManagementDto).collect(Collectors.toList());

	}

	@Override
	public EmployeeDto findEmpById(long id) {
		Optional<EmployeeManagment> employeeManagent = employeeRepository.findById(id);
		if (employeeManagent.isEmpty()) {
			throw new EmplException(empNotFoundCode, empNotFoundMessage, HttpStatus.NOT_FOUND);
		}
		return EmployeeMapper.entityToEmployeeManagementDto(employeeManagent.get());
	}

	@Override
	public EmployeeDto updatEmployeeDto(EmployeeDto employeeDto) {
		Optional<EmployeeManagment> employeeManagentOptional = employeeRepository.findById(employeeDto.getId());
		if (employeeManagentOptional.isEmpty()) {
			throw new EmplException(empNotFoundCode, empNotFoundMessage, HttpStatus.NOT_FOUND);
		}
		EmployeeManagment employeeManagment = employeeManagentOptional.get();
		employeeManagment = EmployeeMapper.employeeManagementDtoToEntity(employeeDto);
		employeeManagment.setCreatedOn(employeeManagentOptional.get().getCreatedOn());
		employeeManagment.setUpdatedOn(EmployeeConstant.CURRENT_TIME);
		return new EmployeeDto(employeeRepository.save(employeeManagment));

	}

	// in active employee
	@Override
	public EmployeeDto deleteEmployeeInActive(long id) {
		Optional<EmployeeManagment> employeeManagementOptional = employeeRepository.findById(id);
		if (employeeManagementOptional.isEmpty()) {
			throw new EmplException(empNotFoundCode, empNotFoundMessage, HttpStatus.NOT_FOUND);
		}
		EmployeeManagment employeeManagment = employeeManagementOptional.get();
		employeeManagment.setIsActive(EmployeeConstant.NO_FLAG);
		employeeManagment.setCreatedOn(employeeManagementOptional.get().getCreatedOn());
		employeeManagment.setUpdatedOn(EmployeeConstant.CURRENT_TIME);
		return new EmployeeDto(employeeRepository.save(employeeManagment));
	}

	// delete permanently records
	@Override
	public String deleteEmployeeFromDB(long id) {
		Optional<EmployeeManagment> employeeManagementOptional = employeeRepository.findById(id);
		if (employeeManagementOptional.isEmpty()) {
			throw new EmplException(empNotFoundCode, empNotFoundMessage, HttpStatus.NOT_FOUND);
		}
		employeeRepository.deleteById(id);
		return id + EmployeeConstant.DELETE_MESSAGE_RESPONSE;
	}

}
