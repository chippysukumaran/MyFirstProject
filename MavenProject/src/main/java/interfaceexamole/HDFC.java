package interfaceexamole;

public class HDFC implements RBI{
	

	
	
	@Override
	public void recurringDeposit(double amount,float duration) {
		

		
		double finalamount= amount*duration;
		
		double interestamount=(finalamount*interest)/100;
		double maturityamount=finalamount+interestamount;
		System.out.println("Amount Deposit"+amount);
		System.out.println("Interest earned"+interestamount);
		System.out.println("Maturity Amount"+maturityamount);
		
		

	}
	public static void main(String[] args) {
		HDFC hd=new HDFC();
		hd.recurringDeposit(80000, 8);

	}

}
