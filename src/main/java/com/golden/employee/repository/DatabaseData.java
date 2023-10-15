package com.golden.employee.repository;

import com.golden.employee.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseData {
    private List<Employee> employees;

    public DatabaseData() {
        employees = new ArrayList<>() {{
            add(new Employee(1, "Alexander","Antony","iCIMS"));
            add(new Employee(2, "Alexander","Maria Antony","TCS"));
            add(new Employee(3, "Alexander","Antony","EPAM"));
        }};
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public void deleteEmployee(Long id) {
        employees = employees.stream().filter(employee -> employee.getId() != id).toList();
    }

    public Employee updateEmployee(Long id, Employee employee) {
        employees.forEach(emp -> {
            if (emp.getId() == id) {
                emp.setCompany(employee.getCompany());
                emp.setFirstName(employee.getFirstName());
                emp.setLastName(employee.getLastName());
            }
        });
        employee.setId(id);
        return employee;
    }

    public Employee getEmployeeById(Long id) {
        return employees.stream().filter(employee -> employee.getId() == id).toList().get(0);
    }
}
