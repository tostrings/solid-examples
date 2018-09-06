package com.solid.ocp.good;

public enum TypeEmployee {

	BACKEND{
		@Override
		Salary calculateNetSalary(double grossSalary) {
			
			return new BackEndSalary( grossSalary );
		}
	},
	FONTEND{
		@Override
		Salary calculateNetSalary(double grossSalary) {

			return new FrontEndSalary( grossSalary );
		}
	};
	
	abstract  Salary calculateNetSalary(double grossSalary);
}
