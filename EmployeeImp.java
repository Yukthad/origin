package com.sonata.CollectionExample;

import java.util.LinkedList;
import java.util.List;

public abstract class EmployeeImp implements EmployeeInt {
	List<Employee> l1 = new LinkedList<>();
	
	@Override
	public void addEmployee(Employee o) {
		l1.add(o);
	}
}
