package com.StreamApi.Day3.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("bhubaneswar","delhi","punjab","hyderabad","bangalore","chennai","gurgoan");
		long result = city.stream().collect(Collectors.counting());
		System.out.println(result);
		Map<Integer, List<String>>result1 = city.stream().collect(Collectors.groupingBy(a->a.length()));
		System.out.println(result1);

	}

}
