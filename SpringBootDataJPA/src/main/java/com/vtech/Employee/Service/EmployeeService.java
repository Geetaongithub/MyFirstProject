package com.vtech.Employee.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.Employee.Model.Employee;
import com.vtech.Employee.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public ArrayList<Employee>  getAllEmp()
	{
		 return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	public void saveEmp(Employee e) {
		employeeRepository.save(e);
		
	}
	
	public List<Employee> findByCity(String city)
	{
		return employeeRepository.findByCity(city);
	}
}
