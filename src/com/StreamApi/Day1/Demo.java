package com.StreamApi.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		List<String>words = Arrays.asList("abhi","ashu","dip","somya");
		List<String> words3 = words.stream().filter(w-> w.length()>4).collect(Collectors.toList());
		System.out.println(words3);
		  
		List<List<String>>names = Arrays.asList(Arrays.asList("abhi","ashu"),Arrays.asList("dip","somya"),Arrays.asList("dip","somya"));
		
		List<String> name1d = names.stream().flatMap(a->a.stream()).collect(Collectors.toList());
		System.out.println(names);
		System.out.println(name1d);
		
		
		List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/* Optional<Object> value = */ list.stream().filter(a->a>3)
		.peek(a->System.out.println("number before change : "+a))
		.map(a->a*-1)
		.peek(a->System.out.println("after : "+a))
				/* .sorted((a,b)->a-b.reverse(-9)) */
				/* .sorted((a,b)->b.compareTo(a)) */
				/* .sorted(Comparator.comparing((Integer a) -> a).reversed()) */
				/* .sorted(Comparator.reverseOrder()) */
		.sorted(Comparator.<Integer>comparingInt(a -> a).reversed())
		 .forEach(a->System.out.println("soted : "+a)) ;
		
		
		List<Integer>list1 = Arrays.asList(10,5,25,5,8,26,84,2,68,8,45,8);
		int output = list1.stream().filter(a->a>10).sorted((a,b)->b-a).skip(2).findFirst().get();
		System.out.println(output);
		
		
		List<Integer> nums = Arrays.asList(12, 5, 8, 21, 44, 15, 30, 7, 44, 18, 21, 50);

		int out = nums.stream().filter(a -> a > 10).distinct().filter(a -> a % 2 == 0)
				.sorted(Comparator.<Integer>comparingInt(a -> a).reversed()).skip(1).findFirst().get();
		System.out.println(out);
		
		
		
		List<String> names1 = Arrays.asList("Abhi", "Rahul", "Amit", "Abhi", "Rohit", "Ankit", "Rahul", "Suman","Amit");
		String name = names1.stream().distinct().sorted((a,b)->b.length()-a.length()).skip(1).findFirst().get();
		System.out.println(name);
		
		
		
		List<String> prices = Arrays.asList("100", "250", "50", "400", "150", "250");
		int sum = prices.stream().mapToInt(x->Integer.parseInt(x)).filter(a->a>100).distinct().reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		
		List<Integer> nums1 = Arrays.asList(10, 15, 20, 25, 30, 15, 40, 50, 20, 60);

		double number = nums1.stream().distinct().filter(a->a%2==0).sorted((a,b)->b-a).mapToInt(a->a).limit(3).average().getAsDouble();
		System.out.println(number);
		
		//it  will give the 3 highest even numbers average
		
		
		List<Integer> nums2 = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);
		List<Integer> results = nums2.stream().filter(a->a%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(results);
		
		
		List<String> names2 = Arrays.asList("Abhi", "Amit", "Anil", "Rahul", "Arjun", "Aman");
		List<String> result =names2.stream().distinct().map(a->a.toUpperCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);
	}

}
