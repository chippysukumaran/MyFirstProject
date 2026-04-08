package Inheritanceexample;

public class Total extends Deductions {
	
	void display()
	{
		int salary=(basic+hra-pf-deduction+bonus);
		
		System.out.println("Salary Slip");
		System.out.println("Basic Salary="+basic);
		System.out.println("Bonus=" +bonus);
		System.out.println("Deduction="+deduction);
	
		System.out.println("HRA=" +hra);
		System.out.println("PF=" +pf);
		
		System.out.println("Total Salary in-hand="+salary);
		
	}

	public static void main(String[] args) {
	Total t=new Total();
	t.basicPay(10000, 1000, 200);
	t.calculations();
	t.display();
	
	}

}
