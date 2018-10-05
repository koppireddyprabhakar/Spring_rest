package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javainuse.domain.Employee;
import com.javainuse.service.EmployeeService;

@Controller
public class DisplayEmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/viewEmployee/{id}")
	@ResponseBody
	public Employee viewAllItems(@PathVariable String id) {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return allEmployees.get(Integer.parseInt(id) - 1);
	}
}