package com.sonata.CollectionExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductList {

	public static void main(String[] args) {
		List<Product> p1 = new LinkedList<Product>();
		p1.add(new Product(123,"TV",122));
		p1.add(new Product(132,"Mobile",133));
		p1.add(new Product(142,"Laps",144));
		
		for(Product p2:p1) {
			System.out.println("["+p2.pId + " "+p2.pName + " " + p2.pPrice+"]");
		}
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Bisleri");
		l1.add("Aqua");
		l1.add("Aqua Marine");
		l1.add("Aqua Time");
		l1.addFirst("Water");
		l1.addLast("Vapour");
		
		Iterator<String> i1  = l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
