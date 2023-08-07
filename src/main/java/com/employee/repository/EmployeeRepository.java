package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeManagment;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeManagment, Long>{

}
