package com.hp.haze.repository;

import org.springframework.data.repository.CrudRepository;

import com.hp.haze.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>, EmployeeRepositoryCustom {
	Employee findByEmail(String email);
	Employee findByFullName(String fullName);	
}
