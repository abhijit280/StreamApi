package com.StreamApi.Day1.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("abhijit","ashu","deepak","ayush","daksh");
		 Stream<String>stream = list.stream();
		 //convert the list to stream and it return a stream
		 Stream<String>filterStream = stream.filter(name -> name.startsWith("a"));
		 //then filter is a method in stream and it filer the data as per condition an it return a stream also and its intermediate operation
		 List<String>listStartsWithA = filterStream.collect(Collectors.toList());
		 // then collect the data from stream AND  store in list to list is the method which given the list and the collect is a terminal operation
		 System.out.println(listStartsWithA);
		 
		 
		List<String> list1 = list.stream().filter(a->a.startsWith("a") && a.length()>5 ).map(a->a.concat(" Pradhan")).collect(Collectors.toList());
		System.out.println(list1);
		
		List<String> output = list.stream().filter(a->a.startsWith("a") && a.length()==4 ).map(a->a.concat(" mallick")).collect(Collectors.toList());
		System.out.println(output);
		
		List<List<String>> list2 = Arrays.asList(Arrays.asList("abhijit","ashu"),Arrays.asList("deepak","ayush"),Arrays.asList("daksh"));
		System.out.println(list2);
		List<String>names = list2.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
		System.out.println(names);
	}

}
