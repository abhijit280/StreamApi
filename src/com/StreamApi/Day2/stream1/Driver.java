package com.StreamApi.Day2.stream1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}

    
}
public class Driver {

	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Rahul", "IT", 65000),
			    new Employee(102, "Amit", "IT", 55000),
			    new Employee(103, "Priya", "HR", 48000),
			    new Employee(104, "Rohit", "IT", 72000),
			    new Employee(105, "Sneha", "HR", 52000),
			    new Employee(106, "Rahul", "IT", 58000),
			    new Employee(107, "Aman", "Finance", 45000),
			    new Employee(108, "Neha", "HR", 39000),
			    new Employee(109, "Priya", "HR", 61000),
			    new Employee(110, "Vikas", "Finance", 68000),
			    new Employee(111, "Rohit", "Finance", 47000),
			    new Employee(112, "Ankit", "IT", 38000),
			    new Employee(113, "Sneha", "Finance", 55000),
			    new Employee(114, "Karan", "HR", 43000),
			    new Employee(115, "Aman", "Finance", 42000)
			);
		
//		
//		1. Consider only employees whose salary is *greater than 40,000*.
//		2. Group the employees by department.
//		3. For each department:
//
//		   * Extract employee names.
//		   * Convert names to uppercase.
//		   * Remove duplicate names.
//		   * Sort names by *length in descending order*.
//		   * If two names have the same length, sort them *alphabetically*.
//		   * Skip the first name.
//		   * Take at most *2 names*.
//		4. Print the result in this format:
		
		Map<String,List<String>> data = employees.stream().filter(a->a.getSalary()>40000).collect(Collectors.groupingBy(a->a.getDepartment(),Collectors.mapping(a->a.getName()
				.toUpperCase(),Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().distinct().sorted(Comparator.comparingInt(String :: length).reversed()
						.thenComparing(String:: compareTo)).skip(1).limit(2).collect(Collectors.toList())))));
		System.out.println(data);
	}
}
