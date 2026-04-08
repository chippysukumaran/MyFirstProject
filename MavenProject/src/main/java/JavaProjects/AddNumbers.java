package JavaProjects;

public class AddNumbers {
	
	int Addition=0;

 void add(int n)
	{
		
		while(n!=0)
		{
		int digit;
		digit=n%10;
		Addition+=digit;
		n=n/10;
		}
		
	}
void display()
{
	System.out.println("Sum of the number=" +Addition);
}
	public static void main(String[] args) {
		
		
		AddNumbers ad=new AddNumbers();
		ad.add(456);
		ad.display();
		
		
	
		
		

	}

}
