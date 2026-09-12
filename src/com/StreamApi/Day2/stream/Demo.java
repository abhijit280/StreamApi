package com.StreamApi.Day2.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
//		Create a Map<Character, Long> containing the frequency of every character.
//		Find all characters that occur more than once.
//		Sort those characters by their frequency in descending order.
//		If two characters have the same frequency, sort those characters alphabetically.
//		Print the character and its frequency.
		String word = "bananaapple";
		Map<Character, Long> frequency = word.chars().mapToObj(a -> (char) a)
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		List<Character> charsrepeatengMoreThanOne = word.chars().mapToObj(a -> (char) a)
				.filter(a -> frequency.get(a) > 1).distinct().collect(Collectors.toList());
		List<Character> charSorted = charsrepeatengMoreThanOne.stream()
				.sorted(Comparator.comparingLong((Character a) -> frequency.get(a)).reversed().thenComparing(a -> a))
				.collect(Collectors.toList());
		for (Character character : charSorted) {
			System.out.println(character + " : " + frequency.get(character));
		}

		List<String> words1 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "mango", "orange");
		
//		The outer key is the length of the word.
//		The inner map contains each word and its frequency.
		
		Map<Object, Map<String, Long>> hello = words1.stream().collect(Collectors.groupingBy(a->a.length(),Collectors.groupingBy(a->a,Collectors.counting())));
		System.out.println(hello);
		
		
		List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);
		
//		true → count of even numbers
//		false → count of odd numbers
		
		Map<Boolean, Long> partition = nums.stream().collect(Collectors.partitioningBy(a->a%2==0,Collectors.counting()));
		System.out.println(partition );
		
		List<String> names = Arrays.asList("Abhi", "Amit", "Rahul", "Anil", "Rohan", "Aman");
		
//		true → names whose length is greater than 4
//		false → names whose length is 4 or less
//		Within each partition, join the names using ", ".
//		Preserve the original order.
		
		Map<Boolean, String>part = names.stream().collect(Collectors.partitioningBy(a->a.length()>4 ,Collectors.mapping(a->a, Collectors.joining(","))) );
		System.out.println(part);
	}

}
