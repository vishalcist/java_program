package com.stream.api;

import com.stream.api.model.Employee;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class FindHighSalaryPerDepartment {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1L, "Alice", "HR", 50000.0),
                new Employee(2L, "Bob", "IT", 60000.0),
                new Employee(3L, "Charlie", "HR", 70000.0),
                new Employee(4L, "David", "IT", 80000.0),
                new Employee(5L, "Eve", "Finance", 90000.0),
                new Employee(6L, "Stive", "Finance", 10000.0)
        };

        Map<String, Optional<Employee>> emps = Arrays.stream(employees)
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(
                                        Comparator.comparing(Employee::getSalary)
                                )
                        )
                );
        emps.forEach((dept, emp) -> System.out.println(
                dept + " : "+ emp.get().getId() + ", " + emp.get().getName() + " : " + emp.get().getSalary()
        ));
    }
}
