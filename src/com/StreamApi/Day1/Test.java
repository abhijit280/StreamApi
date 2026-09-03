package com.StreamApi.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Products {
	private String prdname;
	public Products(String prdname) {
		this.prdname = prdname;
	}
	public String getPrdname() {
		return prdname;
	}
	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}
	@Override
	public String toString() {
		return prdname;
	}
}
public class Test {

	public static void main(String[] args) {
		List<Products>list = Arrays.asList(new Products("iphone"),new Products("samsung s24"),new Products("vivo x200fe"));
		System.out.println(list);
		Map<Integer, List<Products>>list1 = list.stream().collect(Collectors.groupingBy(a->a.toString().length()));
		System.out.println(list1);
	}

}
