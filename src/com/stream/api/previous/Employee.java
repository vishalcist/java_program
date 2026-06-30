package com.check.stream;

public class Employee {
	String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name2, String department, double i) {
		this.name = name2;
		this.department = department;
		this.salary = i;
	}

	@Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
    
}
