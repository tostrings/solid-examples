package com.solid.ocp.good;

public class BackEndSalaryCalculator implements SalaryCalculator{

	private double salary = 0.0;
	
	@Override
	public void calculator() {
		
		this.salary = 2000;
	}

	@Override
	public double getSalary() {
		return salary;
	}
}
