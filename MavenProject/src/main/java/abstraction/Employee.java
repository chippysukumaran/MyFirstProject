package abstraction;

public abstract class Employee {
	

	double payment;

	Employee(double payment)
	{

		this.payment=payment;
	
	}
	
	abstract double calculateSalary();
	

}
