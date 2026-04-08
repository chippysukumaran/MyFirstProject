package polymorphism;

public class OffSeason  extends OnSeason
{
	
void discount(int amount)
	
	{
	float disc;
	double finalamount;	
		
	disc=(15.0f/100)*amount;
	finalamount=amount-disc;

	
	System.out.println("Off Season");
	System.out.println("Total amount of the clothes after 15% discount  "+finalamount);
	}

	public static void main(String[] args) {
		
		OffSeason off=new OffSeason();
		off.discount(4000);
		
	OnSeason on=new OnSeason();
	on.discount(5000);
		
	}

}
