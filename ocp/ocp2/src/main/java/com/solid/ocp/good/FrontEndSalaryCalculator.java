package com.solid.ocp.good;

public class FrontEndSalaryCalculator implements SalaryCalculator{

	private double salary;

	@Override
	public void calculator() {
		
		this.salary = 1000;
	}

	@Override
	public double getSalary() {
		return salary;
	}
}
