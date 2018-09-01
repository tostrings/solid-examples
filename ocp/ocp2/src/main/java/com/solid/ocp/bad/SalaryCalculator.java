package com.solid.ocp.bad;

public class SalaryCalculator {

	private double salary;
	
	public void calculator(TypeEmployee type) {
		
		if( type.equals(TypeEmployee.FONTEND) ) {
			
			salary = 1000;
		}
		
		if( type.equals(TypeEmployee.BACKEND) ) {
			
			salary = 2000;
		}
		
		if( type.equals(TypeEmployee.FULLSTACK) ) {
		
			salary = 3000;
		}

		if( type.equals(TypeEmployee.PRODUCT_MANAGER) ) {

			salary = 4000;
		}
	}
	
	public double getSalary() {
		return salary;
	}
}
