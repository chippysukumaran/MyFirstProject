package superkeyword;

public class ChildClass extends SuperClass{
	
		
		
		ChildClass()
		{
			super(10);
			System.out.println("Constructor child");
		}
		void display()
		{
			
			super.show();
			System.out.println("Child class"+super.name);
		}
		

	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.display();

	}

}
