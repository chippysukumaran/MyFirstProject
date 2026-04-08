package JavaProjects;

public class PalindromeString {
	public static void main(String[] args) {
	
	
	String word= "malayalam";
	String Reverse="";
	for(int i=word.length()-1;i>=0;i--)
	{
		Reverse= Reverse+word.charAt(i);
		
	}
	if(word.equals(Reverse))
	{
		System.out.println("The given word is a palindrome");
	}
	else
	{
		System.out.println("The given word is not a palindrome");
	}
			

		

	}

}
