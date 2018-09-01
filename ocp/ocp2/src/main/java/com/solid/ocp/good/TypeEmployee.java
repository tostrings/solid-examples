package com.solid.ocp.good;

public enum TypeEmployee {

	BACKEND{
		@Override
		SalaryCalculator calc() {
			
			return new BackEndSalaryCalculator();
		}
	},
	FONTEND{
		@Override
		SalaryCalculator calc() {

			return new FrontEndSalaryCalculator();
		}
	};
	
	abstract  SalaryCalculator calc();
}
