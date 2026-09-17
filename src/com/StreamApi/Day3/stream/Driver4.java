package com.StreamApi.Day3.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver4 {

	public static void main(String[] args) {
		

//		List<Integer> list = Arrays.asList(10, 25, 30, 45, 50, 65, 70, 85);
//		 int out = list.stream().filter(a->a%2!=0).sorted(Comparator.reverseOrder()).findFirst().get();
//			List<String> list1 = Arrays.asList("Ashish", "Ankit", "Amit", "Harsh", "Ashish", "Ankit");
//			Map<String, Long> out1 =  list1.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
//			System.out.println(out1);
//		
//		List<Integer> list = Arrays.asList(10, 20, 15, 30, 25, 40, 35);
//	 double e = list.stream().mapToInt(a->a).average().getAsDouble();
//		 
//		  List<Integer>w =  list.stream().filter(a->a>e).collect(Collectors.toList());
//	
//		System.out.println(w);
//		List<String> list = Arrays.asList(
//			    "Ashish", "Ankit", "Amit", "Harsh", "Kartik", "Arun"
//			);
//		
//		String name = list.stream().sorted((a,b)->b.length()-a.length()).findFirst().get();
//		System.out.println(name);
		
		List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 50, 30, 60, 70, 40, 80);
		int s = list.stream().filter(a->list.indexOf(a)==list.lastIndexOf(a)).max((a,b)->a-b).get();
		System.out.println(s);
		
		
		}

}
