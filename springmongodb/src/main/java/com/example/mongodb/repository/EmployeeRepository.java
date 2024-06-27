package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	 Employee findByEmployeeId(String employeeId);
}
