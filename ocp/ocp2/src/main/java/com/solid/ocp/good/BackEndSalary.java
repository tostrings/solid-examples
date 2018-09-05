package com.solid.ocp.good;

public final class BackEndSalary implements Salary{

	private final double discount;
	private final double grossSalary;
	
	public BackEndSalary(final double grossSalary) {
		this.grossSalary = grossSalary;
		this.discount = 0.12;
	}

	@Override
	public double netSalary() { 
		return grossSalary - ( grossSalary * discount );
	}
}
