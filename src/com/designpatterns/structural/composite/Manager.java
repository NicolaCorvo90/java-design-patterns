package com.designpatterns.structural.composite;

import java.util.ArrayList;

public class Manager implements Employee {

	private String name;
	private Double salary;
	
	public Manager(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	ArrayList<Employee> employees = new ArrayList<Employee>(0);
	
	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}

	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public void print() {
		System.out.println("---");
		System.out.println("Name : " + this.getName());
		System.out.println("Salary : " + this.getSalary());
		System.out.println("---");
		
		System.out.println("EMPLOYEES");
		System.out.println("---");
		
		for (Employee employee : this.getEmployees()) {
			employee.print();
		}
		
		System.out.println("---");
	}

}
