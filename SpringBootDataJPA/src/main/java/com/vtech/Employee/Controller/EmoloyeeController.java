package com.vtech.Employee.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.Employee.Model.Employee;
import com.vtech.Employee.Service.EmployeeService;

@RestController
public class EmoloyeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/emp")
	public  ArrayList<Employee> getEmployees()
	{
		
		return  employeeService.getAllEmp();
	}
	
	@PostMapping("/emp")
	public String saveEmployee(@RequestBody Employee e)
	{
		employeeService.saveEmp(e);
		return "data saved ";
	}
	
	@GetMapping("/emp/{city}")
	public List<Employee> findByCity(@PathVariable String city){
		return employeeService.findByCity(city);
	}
	
}
