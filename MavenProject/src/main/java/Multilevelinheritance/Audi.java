package Multilevelinheritance;

public class Audi extends Car{
	
	void end()
	{
		System.out.println("Audi is a luxurious car");
	}

	public static void main(String[] args) {
		
Audi a=new Audi();
a.start();
a.end();
a.middle();
System.out.println("Carname is" +a.carname);

	}

}
