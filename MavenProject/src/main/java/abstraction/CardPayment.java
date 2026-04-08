package abstraction;

public class CardPayment  extends Payment{
	
	void pay(double amount)
	{
		System.out.println("Amount paid  "+amount);
	}

	public static void main(String[] args) {
		
		
		CardPayment c=new CardPayment();
		c.pay(60000);
		c.payStart();
	}

}
