package com.golden.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
    private long id;
    private String firstName;
    private String lastName;
    private String company;
}
