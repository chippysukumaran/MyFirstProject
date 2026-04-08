package superkeyword;

public class SuperClass {
	
	String name="Anu";
	SuperClass()
	{
		System.out.println("Constructor parent");
	}
	
	SuperClass(int a)
	{
		this();
		System.out.println(a);
	}
	void show()
	{
		System.out.println("Parent class");
	}
	}


