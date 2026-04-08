package abstraction;

public class Contractor extends Employee{
int workinghour;

Contractor(int workinghour,double payment)
{
	super(payment);
 this.workinghour=workinghour;
 
}
	@Override
	double calculateSalary() {
	
		
		return payment*workinghour;
		
	}
	
	
	
	
	

}
