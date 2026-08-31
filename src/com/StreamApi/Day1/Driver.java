package com.StreamApi.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int prdId;
	String prdName;
	int Price;
	boolean active;

	public Product(int prdId, String prdName, int Price, boolean active) {
		this.prdId = prdId;
		this.prdName = prdName;
		this.Price = Price;
		this.active = active;

	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", Price=" + Price + ", active=" + active + "]";
	}
	
}

public class Driver {

	public static void main(String[] args) {
		  List<Product> products = Arrays.asList(
		            new Product(101, "Laptop", 80000, true),
		            new Product(102, "Mouse", 1500, true),
		            new Product(103, "Phone", 50000, true),
		            new Product(104, "Monitor", 12000, false),
		            new Product(105, "Keyboard", 3000, true)
		        );
		  
		  List<Product> result = products.stream().filter(x->x.active).filter(x->x.Price>=5000).map(x->{
			  x.Price = x.Price + 1000;
			  return x;
		  }).peek(x->{
			  x.Price = x.Price - 1000;
		  }).sorted(Comparator.comparingInt(x->x.Price)).collect(Collectors.toList());
		  System.out.println(result);
		  List<Product> result1 = result.stream().map(x ->{ x.Price = x.Price + 1000; return x;}).collect(Collectors.toList());
		  System.out.println(result1);
		  
	
	}

}
