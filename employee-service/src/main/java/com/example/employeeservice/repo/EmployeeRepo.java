package com.example.employeeservice.repo;

import com.example.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByEmployeeId(Integer id);
}
