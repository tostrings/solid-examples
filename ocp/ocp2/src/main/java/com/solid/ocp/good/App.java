package com.solid.ocp.good;

public class App {

	public static void main( String[] args ){
        
    	SalaryCalculator salaryFront = TypeEmployee.FONTEND.calc();
        salaryFront.calculator();
    	
        System.out.println( salaryFront.getSalary() );
        
        SalaryCalculator salaryBack = TypeEmployee.BACKEND.calc();
        salaryBack.calculator();
    	
        System.out.println( salaryBack.getSalary() );
    }
}
