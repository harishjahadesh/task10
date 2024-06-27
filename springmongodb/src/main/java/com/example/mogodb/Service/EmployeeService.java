package com.example.mogodb.Service;
import com.example.mongodb.model.Employee;
import com.example.mongodb.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	

	@Service
	public class EmployeeService {

		@Autowired
	    private EmployeeRepository employeeRepository;

	    public Employee saveEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    public Employee getEmployeeById(String employeeId) {
	        return employeeRepository.findByEmployeeId(employeeId);
	    }
	}
