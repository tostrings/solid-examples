package com.solid.ocp.good;

public class App {

	public static void main( String[] args ){
        
    	SalaryCalculator salary = new FrontEndSalaryCalculator();
    	salary.calculator();
        System.out.println( salary.getSalary() );
    }
}
