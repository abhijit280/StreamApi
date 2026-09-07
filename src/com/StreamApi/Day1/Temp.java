package com.StreamApi.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(20, 3, 20, 58, 65, 784, 695, 59, 8, 45, 8, 42, 989, 8, 7458, 88, 8, 88, 5, 54,
				885, 48, 8, 5, 879, 8);
//		Collections.sort(num);	//	this is the utility class to sort the list .
//		System.out.println(num);
		num.stream().min((a,b)->a-b).get();
		num.stream().max((a,b)->a-b).get();
		int numm = num.stream().reduce(0, (a,b)->a+b);
		num.stream().filter(a->a%2==0).sorted((a,b)->b.compareTo(a)).skip(2).findFirst().get();//even num
		int sum = num.stream().filter(a->a%2!=0).reduce(0,(a,b)->a+b);//it reduce the length and add the numbers
		List<Integer> desendingsortedUniqueNum = num.stream().distinct().sorted((a, b) -> b - a)
				.collect(Collectors.toList());// distinct remove the all duplicate element
		System.out.println(desendingsortedUniqueNum);
		int highestnum = desendingsortedUniqueNum.stream().findFirst().get();// findfirst use for get first element get
																				// used for get single element its a
																				//findfirst terminate operation
		System.out.println("Highest number : " + highestnum);
		int secondHighestnum = desendingsortedUniqueNum.stream().skip(1).findFirst().get();// skip used for skip the
																							// element it take the input
																							// as a long.
		System.out.println("2nd Highest number : " + secondHighestnum);
		List<Integer> ascendingsortedUniqueNum = num.stream().distinct().sorted((a, b) -> a - b)
				.collect(Collectors.toList());
		System.out.println(ascendingsortedUniqueNum);
//		int lowestNum = ascendingsortedUniqueNum.stream().findFirst().get();
//		System.out.println("Lowest Number : "+lowestNum);
		int secLowestNum = ascendingsortedUniqueNum.stream().skip(1).findFirst().get();// here findfirst is a terminal
																						// operation get is a method to
																						// get the data from
																						// optionallist
		System.out.println("2nd Lowest Number : " + secLowestNum);
		Optional<Integer> lowestNum = ascendingsortedUniqueNum.stream().findFirst();// here is the example of this.
		System.out.println("Lowest Number : " + lowestNum.get());
		
		
		List<List<String>> words = Arrays.asList(Arrays.asList("java", "python", "c++"),
				Arrays.asList("spring", "hibernate", "servlet"), Arrays.asList("html", "css", "javascript"),
				Arrays.asList("mysql", "mongodb", "oracle"));
		Map<Object, List<String>>group = words.stream().flatMap(a->a.stream()).filter(a->a.length()>4).collect(Collectors.groupingBy(a->a.length()));
		System.out.println(group);
		
		
		String name = "swiss";
		Optional<Character> str = name.chars()
				/* String to char int stream */.mapToObj(a -> (char) a)
				/* used for the intstream to char */.filter(a -> name.indexOf(a) == name.lastIndexOf(a))
				/* then filter */.findFirst();
		System.out.println(str.get());
		
		
		List<String>list1 = Arrays.asList("spring", "hibernate", "servlet");
		List<String>list2 = Arrays.asList("html", "css", "javascript");
		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(w->System.out.println(w));//concat used for add two lists
	}

}
