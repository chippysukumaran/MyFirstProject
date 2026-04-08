package superkeyword;

public class Calculation extends Division{
	
	
	void display()
	{
		 super.add(98, 20);
		
		if(result%10==0)
		{
			System.out.println("The total number is divisible by 10");
			
		}
		else
		{
			System.out.println("The total number is not divisible by 10");
				
		}
	}

	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.display();
		
		

	}

}
