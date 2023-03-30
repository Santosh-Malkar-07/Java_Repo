package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class SortListOfProduct {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Zeyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		Comparator<Product> productList = (p1, p2) -> {

//			return p1.name.compareTo(p2.name);

			if (p1.price > p2.price) {
				return 1;
			} else if (p1.price < p2.price) {
				return -1;
			} else {
				return 0;
			}
		};
		Collections.sort(list, productList);

		for (Product product : list) {
			System.out.println(product.id + "  " + product.name + "     " + product.price);
		}

	}

}
