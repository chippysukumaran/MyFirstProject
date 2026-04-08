package JavaProjects;

public class ReverseNumber {
	int number;
	int reverse=0;
	
	ReverseNumber (int number)
	{
		
		this.number=number;
		int value;
		while(number!=0)
		{
			value=number%10;
			reverse=reverse*10+value;
			number=number/10;
		}
	
		}
	ReverseNumber()
	{
		this(458);
			System.out.println("Reverse of the given number is"+reverse);
		}
	

	public static void main(String[] args) {
		
		ReverseNumber rev=new ReverseNumber();
		
		
	}

}
