package com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class CompareExample {
	public static void main(String args[]) {
		ArrayList<Student> n1 = new ArrayList<>();
		n1.add(new Student(106,"csgo",55));
		n1.add(new Student(107,"valorant",56));
		n1.add(new Student(108,"gtaV",57));
		
		Collections.sort(n1);
		for(Student s : n1) {
			System.out.println(s.stdId+ " "+ s.stdName+ " " +s.stdAge);
		}
	}

}
