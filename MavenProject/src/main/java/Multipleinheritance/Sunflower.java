package Multipleinheritance;

public class Sunflower extends Rose,Jasmine{
	
	void smell()
	{
		System.out.println("sunflower smell so good");
	}

	public static void main(String[] args) {
		Sunflower s=new Sunflower();
		s.smell();

	}

}
