package com.StreamApi.Day3.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,52,96,147,8,8,2,47,8,2,2,4,8,2,1,7,89,6,85);
		Map<Boolean,List<Integer>> output = input.stream().collect(Collectors.partitioningBy(a->a%2==0));
		System.out.println(output);
		
//		String name = "Abhijit";
//		List <Character> output1 = name.chars().mapToObj(a-> (char)a).collect(Collectors.toList());
//		System.out.println(output1);
		
//		String name = "Abhijit";
//		Map <Character,Long > output1 = name.chars().mapToObj(a-> (char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		System.out.println(output1);
		
		String name = "Abhijit";
		List <Character> output1 = name.chars().mapToObj(a-> (char)a).filter(a->name.indexOf(a) == name.lastIndexOf(a)).limit(1).collect(Collectors.toList());
		System.out.println(output1);
	}

}
