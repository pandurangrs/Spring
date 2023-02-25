package com.springcore.collectionRef;

import java.util.List;

public class Test {
	private String name;
	private List<Employee> employee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Test(String name, List<Employee> employee) {
		super();
		this.name = name;
		this.employee = employee;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", employee=" + employee + "]";
	}
	
	
}
