package com.StreamApi.Day2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(10);
		numbers1.add(20);
		List<Integer> readOnly = Collections.unmodifiableList(numbers1);
		numbers1.add(30);
		System.out.println(readOnly);

		List<Integer> numbers = Arrays.asList(20, 30, 5, 04, 0, 60, 7, 2, 82, 81, 5, 85, 5, 22, 55, 15, 5, 0, 56, 2, 4,
				5, 5, 1, 4, 1);
//		numbers.stream().sorted().distinct().forEach(a->System.out.println(a));

		List<String> list = Arrays.asList("spring", "hibernate", "servlet", "html", "css", "java", "javascript", "java",
				"hibernate");
//		list.stream().filter(a->a.startsWith("j")).limit(1).forEach(a->System.out.println(a));
//		list.stream().sorted().skip(2).forEach(System.out::println);
		Map<Integer, List<String>> h = list.stream().filter(a -> list.indexOf(a) != list.lastIndexOf(a)).distinct().collect(Collectors.groupingBy(a->a.length()));
			
		System.out.println(h);
		
		String word = "mississippi";
		Map<Object, Long> frequency = word.chars().mapToObj(a -> (char) a)
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));

		System.out.println(frequency);
		char hschar = word.chars().mapToObj(a->(char)a).filter(a->frequency.get(a)>1).findFirst().get();
		System.out.println(hschar+" : "+frequency.get(hschar));
		
		
		
	}

}
