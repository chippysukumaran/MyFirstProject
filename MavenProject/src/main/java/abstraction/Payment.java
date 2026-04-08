package abstraction;  // Abstraction Using abstract class

public abstract class Payment {
	
	abstract void pay(double amount);
	
	void payStart()
	{
		System.out.println("Payment Started");
	}

}
