package com.duygu.employeeservice.repositories;

import com.duygu.employeeservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
