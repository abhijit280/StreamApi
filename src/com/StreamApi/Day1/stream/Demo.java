package com.StreamApi.Day1.stream;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String prdname;
    private double price;

    public Product(String prdname, double price) {
        this.prdname = prdname;
        this.price = price;
    }

    public String getPrdname() {
        return prdname;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return prdname + " : " + price;
    }
}
public class Demo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product("Laptop", 55000));
		products.add(new Product("Mobile", 25000));
		products.add(new Product("Headphone", 3000));
		products.add(new Product("Keyboard", 1000));
		products.add(new Product("Monitor", 12000));
		
		products.stream().filter(a->a.getPrice()>1000).map(a->a.getPrdname()+" : "+(a.getPrice()-a.getPrice()*10/100)).forEach(a->System.out.println(a));
	
	
	}

}
