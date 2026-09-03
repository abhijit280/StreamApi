package com.StreamApi.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<String>words = Arrays.asList("abhi","ashu","dip","somya");
		List<String> words3 = words.stream().filter(w-> w.length()>4).collect(Collectors.toList());
		System.out.println(words3);
		  
		List<List<String>>names = Arrays.asList(Arrays.asList("abhi","ashu"),Arrays.asList("dip","somya"),Arrays.asList("dip","somya"));
		
		List<String> name1d = names.stream().flatMap(a->a.stream()).collect(Collectors.toList());
		System.out.println(names);
		System.out.println(name1d);
	}

}
