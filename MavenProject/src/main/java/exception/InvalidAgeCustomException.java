package exception;

public class InvalidAgeCustomException {

	static void calculate(int a) throws InvalidAgeException
	{
		
		
		if(a<18)
		{
			throw new InvalidAgeException("You are not Eligible..........");
		}
		
		else
		{
			System.out.println("You are eligible");		}
	}
	
	static void add() throws InvalidAgeException
	{
		int res=10/0;
	}


public static void main(String[] args) {
	try
	{
		calculate(11);
		add();
	}
	catch(InvalidAgeException e)
	{
		System.out.println(e.getMessage());

}
	catch(ArithmeticException ae)

}
}
