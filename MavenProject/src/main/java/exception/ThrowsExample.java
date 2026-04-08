package exception;

public class ThrowsExample {
	

		static void calculate(int a) throws ArithmeticException
		{
			
			
			if(a<18)
			{
				throw new ArithmeticException("You are not Eligible");
			}
			
			else
			{
				System.out.println("You are eligible");		}
		}

	
	public static void main(String[] args) {
		try
		{
			calculate(11);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());

	}

}
}
