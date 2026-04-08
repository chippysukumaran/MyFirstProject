package exception;



public class TryCatch {
	
	
	public static void main(String Args)
	{
		
		try
		{
			
		
		int a=10;
		int b=0;
		int result=a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());		
			}
	}

}
