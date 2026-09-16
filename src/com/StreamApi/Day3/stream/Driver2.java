package com.StreamApi.Day3.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Driver2 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("abhi", 30000), new Employee("asish", 40000),
				new Employee("dev", 50000), new Employee("ashu", 55000), new Employee("ashu", 55000));
		int result = employees.stream().sorted((a,b)-> Integer.compare(b.getSalary(), a.getSalary())).map(Employee::getSalary).distinct().skip(1).findFirst().get();
		System.out.println(result);
//		stream use a single thread to process the pipeline---------parallelstream use multiple thread for execution the pipeline its just faster execution 
		Employee output = employees.parallelStream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toMap(Employee::getSalary, a -> a, (b, c) -> b, LinkedHashMap::new)).values().stream().skip(1).findFirst().get();
		System.out.println(output.getName() + " : " + output.getSalary());
	
		Set<Integer> unique = new HashSet<Integer>();
		Employee result1 = employees.stream().filter(a->unique.add(a.getSalary())).sorted((a,b)->b.getSalary()-a.getSalary()).skip(1).findFirst().get();
		System.out.println(result1);
	}
}
