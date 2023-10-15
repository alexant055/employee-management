package com.golden.employee.services;

import com.golden.employee.model.Employee;
import com.golden.employee.repository.DatabaseData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final DatabaseData databaseData;

    public EmployeeServiceImpl(DatabaseData databaseData) {
        this.databaseData = databaseData;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return databaseData.addEmployee(employee);
    }

    @Override
    public Employee getByEmployeeId(Long id) {
        return databaseData.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return databaseData.getEmployees();
    }

    @Override
    public void deleteEmployee(Long id) {
        databaseData.deleteEmployee(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        return databaseData.updateEmployee(id, employee);
    }
}
