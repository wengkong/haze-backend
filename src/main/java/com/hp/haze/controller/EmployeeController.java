package com.hp.haze.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hp.haze.model.Employee;
import com.hp.haze.repository.EmployeeRepository;

@EnableAutoConfiguration
@RequestMapping("/employees")
@RestController
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Employee> findAll() {
		log.info("Find all");
		return employeeRepository.findAll();
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public Employee findOne(@PathVariable("employeeId") Long employeeId) {
		log.info("Find one " + employeeId);
		return employeeRepository.findOne(employeeId);
	}

	@RequestMapping(method = RequestMethod.GET, params = { "email" })
	public Employee findByEmail(@RequestParam("email") String email) {
		log.info("Find by email " + email);
		return employeeRepository.findByEmail(email);
	}

	@RequestMapping(method = RequestMethod.GET, params = { "fullName" })
	public Employee findByFullName(@RequestParam("fullName") String fullName) {
		log.info("Find by full name " + fullName);
		return employeeRepository.findByFullName(fullName);
	}
}
