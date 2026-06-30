package com.check.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgramm {
	
	public static void main(String[] args) {
		StreamProgramm sp = new StreamProgramm();
		List<Employee> emp = sp.getEmployees();
		// count employee department wise
		sp.employeeCountDepartmentWise(emp);

		
	}

	public void employeeCountDepartmentWise(List<Employee> emps) {
		emps.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(
				data -> {
					System.out.println("\n\n");
					System.out.println(data.getKey());
					System.out.println("======================\n");
					for(int i =0; i< data.getValue().size(); i++) {
						System.out.println(data.getValue().get(i).getName()+":"+data.getValue().get(i).getSalary());
					}
				});
	}
	
	public List<Employee> getEmployees() {
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "IT", 60000),
	            new Employee("Bob", "HR", 55000),
	            new Employee("Charlie", "Finance", 65000),
	            new Employee("David", "Sales", 50000),
	            new Employee("Emma", "Marketing", 62000),
	            new Employee("Frank", "IT", 70000),
	            new Employee("Grace", "HR", 52000),
	            new Employee("Henry", "Finance", 68000),
	            new Employee("Ivy", "Sales", 49000),
	            new Employee("Jack", "Marketing", 63000),
	            new Employee("Karen", "IT", 75000),
	            new Employee("Leo", "HR", 56000),
	            new Employee("Mia", "Finance", 70000),
	            new Employee("Nathan", "Sales", 48000),
	            new Employee("Olivia", "Marketing", 64000),
	            new Employee("Paul", "IT", 72000),
	            new Employee("Quinn", "HR", 57000),
	            new Employee("Ryan", "Finance", 69000),
	            new Employee("Sophia", "Sales", 46000),
	            new Employee("Tom", "Marketing", 61000),
	            new Employee("Ursula", "IT", 74000),
	            new Employee("Victor", "HR", 58000),
	            new Employee("Wendy", "Finance", 71000),
	            new Employee("Xavier", "Sales", 47000),
	            new Employee("Yvonne", "Marketing", 65000),
	            new Employee("Zack", "IT", 77000),
	            new Employee("Adam", "HR", 59000),
	            new Employee("Bella", "Finance", 73000),
	            new Employee("Carl", "Sales", 45000),
	            new Employee("Diana", "Marketing", 62000),
	            new Employee("Ethan", "IT", 78000),
	            new Employee("Fiona", "HR", 60000),
	            new Employee("George", "Finance", 74000),
	            new Employee("Hannah", "Sales", 44000),
	            new Employee("Isaac", "Marketing", 63000),
	            new Employee("Julia", "IT", 79000),
	            new Employee("Kevin", "HR", 61000),
	            new Employee("Liam", "Finance", 75000),
	            new Employee("Megan", "Sales", 43000),
	            new Employee("Noah", "Marketing", 64000),
	            new Employee("Oscar", "IT", 80000),
	            new Employee("Penny", "HR", 62000),
	            new Employee("Quincy", "Finance", 76000),
	            new Employee("Rita", "Sales", 42000),
	            new Employee("Samuel", "Marketing", 65000),
	            new Employee("Tina", "IT", 81000),
	            new Employee("Uma", "HR", 63000),
	            new Employee("Victor", "Finance", 77000),
	            new Employee("Willa", "Sales", 41000),
	            new Employee("Xander", "Marketing", 66000)
	        );
		
		return employees;
	}

}
