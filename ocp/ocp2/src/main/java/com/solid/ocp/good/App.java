package com.solid.ocp.good;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main( String[] args ){
        
		final List<Employee> Employees = Arrays.asList(new Employee("Bessa", TypeEmployee.BACKEND, 2000),new Employee("Maciel", TypeEmployee.FONTEND, 2000) );
        
		for (Employee employee : Employees) {
			System.out.println(employee.netSalary());
		}
    }
}
