package collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> frts=new ArrayList<>();
		frts.add("Apple");
		frts.add("Pineapple");
		frts.add("Grapes");
		frts.add(0,"mango");
		frts.add("Grapes");
		System.out.println(frts);
		System.out.println(frts.get(3));
		System.out.println(frts.remove(4));
		System.out.println(frts.set(2, "Avacado"));
		//frts.clear();
		System.out.println(frts);
		System.out.println("+++++++++++for Loop+++++++");
		for(int i=0;i<frts.size();i++)
		{
			System.out.println(frts.get(i));
			
		}
		
		System.out.println("++++++for Each+++++");
		for(String f:frts)
		{
			System.out.println(f);
			
		}
		
		

	}

}
