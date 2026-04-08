package upcasting;

public class Cat extends Animal{
	
	
	void meow()
	{
		System.out.println("Cat is meowing");
	}

	public static void main(String[] args) {
		Animal a=new Cat(); //up-casting
		a.display();
		//a.meow();
		
		int c=10;
		float b=c; //widening
		System.out.println(b);
		
		
		float d=10.8f;
		int e=(int)d;   //narrowing
		
		System.out.println(e);
		
		
	}

}
