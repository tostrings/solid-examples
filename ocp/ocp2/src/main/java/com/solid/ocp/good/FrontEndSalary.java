package com.solid.ocp.good;

public final class FrontEndSalary implements Salary{

	private final double discount;
	private final double grossSalary;
	
	public FrontEndSalary(final double grossSalary) {
		this.grossSalary = grossSalary;
		this.discount = 0.10;
	}

	@Override
	public double netSalary() { 
		return grossSalary - ( grossSalary * discount );
	}
}
