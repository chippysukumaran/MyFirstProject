package encapsulation;

public class Bank {
	
	private int pin;
	
	
	void setPin(int pin)
	{
		this.pin=pin;
	}
	
   public int getPin()
{
	   
	   return pin;
}
   
   public void display()
   {
	   if (pin ==1001  || pin==1234  || pin==1212)
		{
			System.out.println("Pin is valid");
		}
		else
		{
			System.out.println("Pin is not valid, Enter a valid pin");
			
		}
   }
}
