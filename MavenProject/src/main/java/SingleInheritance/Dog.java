package SingleInheritance;

public class Dog extends Pet{
	
	void bark()
	{
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		
Dog d=new Dog();
d.bark();
d.eat();
System.out.println(d.s);

	}

}
