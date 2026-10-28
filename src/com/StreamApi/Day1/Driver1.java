package com.StreamApi.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		List<List<String>> words = Arrays.asList(Arrays.asList("java", "python", "c++"),
				Arrays.asList("spring", "hibernate", "servlet"), Arrays.asList("html", "css", "javascript"),
				Arrays.asList("mysql", "mongodb", "oracle"));
		Map<String, Long> map = words.stream().flatMap(a->a.stream()).collect(Collectors.groupingBy(a->a,Collectors.counting()));
		System.out.println(map);
		 String masiveWord = words.stream().flatMap(a->a.stream()).reduce((a,b)->a+b).get();
		 System.out.println(masiveWord);
		 Map<Character, Long> frequency = masiveWord.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
		 System.out.println(frequency);
	}

}
