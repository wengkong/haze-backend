package com.hp.haze.repository;

import com.hp.haze.model.Employee;

public interface EmployeeRepositoryCustom {
	Employee findByQuery(String query);
}
