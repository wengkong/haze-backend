package com.hp.haze.repository;

import com.hp.haze.model.Employee;

public class EmployeeRepositoryImpl {
	public void findByQuery(String query) {
		//EntityManager.fdgdfgfdgdfg
	}
	
	public boolean isManager(Employee employee) {
		boolean isManager = false;
		//TODO
		//check list of employee entry that has manager_id equals to this employee_id
		employee.setManager(isManager);
		return isManager;
	}
}
