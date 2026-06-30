package com.check.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHigestSalarayEmployee {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Alice", 90000, "IT"), new Employee("Bob", 80000, "IT"),
				new Employee("Charlie", 85000, "IT"), new Employee("David", 70000, "HR"),
				new Employee("Eve", 75000, "HR"), new Employee("Frank", 60000, "HR"));

		Map<String, Optional<Employee>> secondHigh = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.toList(),
								list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
										.skip(1).findFirst())));

	}

}
