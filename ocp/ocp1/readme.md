## OCP - Open to Extention

*"software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification";*

The OCP is a complementation of SRP, see more follow below.

This example I show how use OCP principle using `abstract classes`   

**BAD**

It's bad practice create a class with several responsibility.

In package `bad` existe a class `SalaryCalculator`.

```
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


```

If there is a need to change this class? very complicated.


**GOOD**

In good package I use an abstract class.


```
public abstract class SalaryCalculator {

	public abstract void calculator();
		
	public abstract double getSalary();
}

```

and implementations for each case, see implementation to FrontEnd:

```
public class FrontEndSalaryCalculator extends SalaryCalculator{

	private double salary;

	@Override
	public void calculator() {
		
		this.salary = 1000;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}
}

```

The class `SalaryCalculator` is intact, If there is a need to change, now it's easier.   
