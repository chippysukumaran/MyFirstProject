package polymorphism;
  

public class OnSeason {
	
	
	
	
	void discount(int amount)
	
	{
		float disc;
		double finalamount;
		
		
	disc=(40.0f/100)*amount;
	finalamount=amount-disc;
	System.out.println("On Season");
	System.out.println("Total amount of the clothes after 40% discount  "+finalamount);
	}

}
