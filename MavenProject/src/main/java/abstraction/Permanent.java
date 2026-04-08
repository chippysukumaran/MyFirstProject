package abstraction;

public class Permanent  extends Employee{



	
	
	Permanent(double payment)
	{
		
   super(payment);
	
	
	}

	@Override
	double calculateSalary() {
	 
	 return payment*8;
	

}

	public static void main(String[] args) {
		
Permanent p=new Permanent(500);
p.calculateSalary();
System.out.println("Salary of permanent employee= " +p.calculateSalary());
Contractor c=new Contractor(5,500);
c.calculateSalary();
System.out.println("Salary of Contractor employee= " +c.calculateSalary());



}
}
