package com.hp.haze;

import com.hp.haze.model.Employee;
import com.hp.haze.repository.EmployeeRepositoryImpl;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmail("sharifah-nur-ain-zulikha.syed-othman@hpe.com");
		
		EmployeeRepositoryImpl i = new EmployeeRepositoryImpl();
		i.isManager(e);
		
	}

}
