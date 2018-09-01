package com.solid.ocp.bad;

/**
 * Hello world!
 *
 */
public class App {

	public static void main( String[] args ){
        
    	SalaryCalculator salary = new SalaryCalculator();
        salary.calculator( TypeEmployee.FONTEND );
        System.out.println( salary.getSalary() );
    }
}
