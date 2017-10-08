package com.designpatterns.structural.composite;

public class Developer implements Employee {

	private String name;
	private Double salary;
	
	public Developer(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public void print() {
		System.out.println("---");
		System.out.println("Name : " + this.getName());
		System.out.println("Salary : " + this.getSalary());
		System.out.println("---");
	}

	
	
	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
