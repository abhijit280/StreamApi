package com.StreamApi.Day2.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
//		String word = "swiss";
//		Map<Character,Long > frequency = word.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
//		char count = word.chars().mapToObj(a->(char)a).filter(a->frequency.get(a)==1).findFirst().get();
//		System.out.println(count+" : "+frequency.get(count));
		
		
		String word = "programming";
		Map<Character,Long>frequency = word.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
		char count = word.chars().mapToObj(a->(char)a).filter(a->frequency.get(a)==2).findFirst().get();
		System.out.println(count+" : "+frequency.get(count));
		
	}

}
