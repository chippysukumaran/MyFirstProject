package exception;

public class MultiCatch {

	public static void main(String[] args) {
		try
		{
			int arr[]= {1,2,3};
			System.out.println(arr[5]);
			String s=null;
			System.out.println(s.length());
		
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		
		
	}

}
