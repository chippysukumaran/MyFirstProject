package Hierarchialinheritance;

public class Car extends Vehicle 
{
	void engine()
	{
		System.out.println("Engine works fine");
	}

	public static void main(String[] args) {
		
Car c= new Car();
c.engine();
c.start();
c.stop();

	}

}
