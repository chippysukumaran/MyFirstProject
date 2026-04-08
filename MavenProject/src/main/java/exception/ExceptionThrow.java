package exception;

public class ExceptionThrow {

	public static void main(String[] args) {
		int a=10;
		if(a<18)
		{
			throw new ArithmeticException("You are not Eligible");
		}
		
		else
		{
			System.out.println("You are eligible");		}
	}

}
