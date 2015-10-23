package com.hp.haze.repository;

import com.hp.haze.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

	@Override
	public boolean isManager(Employee employee) {
		boolean isManager = false;
		// TODO Auto-generated method stub
		// check is there any employee having the pass in employee manager's email
		//employee.setManager(isManager);
		return isManager;
	}

}
