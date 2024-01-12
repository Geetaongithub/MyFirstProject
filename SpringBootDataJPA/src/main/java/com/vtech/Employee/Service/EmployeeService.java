package com.vtech.Employee.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

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
	
	public void updateEmp(Employee e)
	{
		Employee temp=employeeRepository.findById(e.getId()).get();
		temp.setName(e.getName());
		temp.setCity(e.getCity());
		employeeRepository.save(temp);
	}
	
}
