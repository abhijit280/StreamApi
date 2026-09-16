package com.StreamApi.Day3.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver3 {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("bhubaneswar","delhi","punjab","hyderabad","bangalore","chennai","gurgoan");
		String word = city.stream().collect(Collectors.joining());
		System.out.println(word);
		String name = city.stream().reduce((a,b)->a+b).get();
		System.out.println(name);
		Map<Character, Long> frequency = name.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
		System.out.println(frequency);
		Map<Character, Long> sortFrequency = name.chars().mapToObj(a->(char)a).sorted(Comparator.comparingLong((Character a)->frequency.get(a)).reversed().thenComparing(a->a))
				.collect(Collectors.toMap(a->a, a->frequency.get(a),(x,y)->x,LinkedHashMap::new));
		System.out.println("Descecndingsorted frequency" + sortFrequency);
		
	}

}
