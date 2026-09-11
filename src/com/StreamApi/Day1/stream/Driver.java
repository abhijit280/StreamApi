package com.StreamApi.Day1.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	String name;
	int salary;
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
//	@Override
//	public String toString() {
//		return name;
//	}
}
public class Driver {

	public static void main(String[] args) {
//		 List<String> list = Arrays.asList("abhijit","ashu","deepak","ayush","daksh");
//		 Stream<String>stream = list.stream();
//		 //convert the list to stream and it return a stream
//		 Stream<String>filterStream = stream.filter(name -> name.startsWith("a"));
//		 //then filter is a method in stream and it filer the data as per condition an it return a stream also and its intermediate operation
//		 List<String>listStartsWithA = filterStream.collect(Collectors.toList());
//		 // then collect the data from stream AND  store in list to list is the method which given the list and the collect is a terminal operation
//		 System.out.println(listStartsWithA);
//		 
//		 
//		List<String> list1 = list.stream().filter(a->a.startsWith("a") && a.length()>5 ).map(a->a.concat(" Pradhan")).collect(Collectors.toList());
//		System.out.println(list1);
//		
//		List<String> output = list.stream().filter(a->a.startsWith("a") && a.length()==4 ).map(a->a.concat(" mallick")).collect(Collectors.toList());
//		System.out.println(output);
//		
//		List<List<String>> list2 = Arrays.asList(Arrays.asList("abhijit","ashu"),Arrays.asList("deepak","ayush"),Arrays.asList("daksh"));
//		System.out.println(list2);
//		List<String>names = list2.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
//		System.out.println(names);
		
		//Given a list of integers, use filter() to find all numbers greater than 50.
//		List<Integer> numbers = Arrays.asList(10, 25, 15, 30, 45, 20, 35, 50, 15, 40, 60, 25, 70, 30, 80, 90, 45, 55,100, 20);
//		numbers.stream().filter(a->a>50).forEach(a->System.out.println(a));
//		List<Employee>employee = new ArrayList<Employee>();
//		employee.add(new Employee("abhi"));
//		employee.add(new Employee("asu"));
//		employee.add(new Employee("abhijit"));
//		employee.add(new Employee("arijit"));
//		employee.add(new Employee("abhi_pradhan"));
//		
//		employee.stream().map(a->a.getName().toUpperCase()).forEach(a->System.out.println(a));
		//Given a list of employees, use filter() to find employees with salary greater than 10 LPA and map() to get only their names.
		
		List<Employee>employee = new ArrayList<Employee>();
		employee.add(new Employee("abhi",1000000));
		employee.add(new Employee("asu",2000000));
		employee.add(new Employee("abhijit",40000000));
		employee.add(new Employee("arijit",10000000));
		employee.add(new Employee("abhi_pradhan",200000));
		List<String>names = employee.stream().filter(a->a.getSalary()>1000000).map(a->a.getName()).collect(Collectors.toList());
		System.out.println(names);
	}
	
}

