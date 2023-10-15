package com.golden.employee.services;

import com.golden.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getByEmployeeId(Long id);
    List<Employee> getAllEmployees();
    void deleteEmployee(Long id);
    Employee updateEmployee(Long id, Employee employee);
}
