package com.solid.ocp.good;

public final class Employee {

	private final String name;
	private final TypeEmployee type;
	private final double grossSalary;
	
	public Employee(String name, TypeEmployee type, double grossSalary) {
		this.name = name;
		this.type = type;
		this.grossSalary = grossSalary;
	}

	public double netSalary() {
		return type.calculateNetSalary(grossSalary).netSalary();
	}
	
	public String name() {
		return name;
	}
}
