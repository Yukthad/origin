package com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeCollection {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>(3);
		list.add("Hi");
		list.add("Hello");
		list.add("Wassup");
		
		String obj = "Hi";
		
		System.out.println("Initial ArrayList: " + list);
		
		list.remove(obj); 
		
		System.out.println("Final ArrayList: " + list);
		

	}
}
