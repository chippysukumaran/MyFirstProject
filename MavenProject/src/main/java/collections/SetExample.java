package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set <String> clr=new HashSet<>();
		clr.add("orange");
		clr.add("pink");
		clr.add("green");
		clr.add("pink");
		System.out.println(clr);
		
		Set <String> clr1=new HashSet<>();
		clr1.add("brown");
		clr1.add("pink");
		clr1.add("yellow");
		System.out.println(clr1);
		clr.addAll(clr1);
		System.out.println(clr);
		System.out.println(clr.size());
		System.out.println(clr.removeAll(clr1));
		System.out.println(clr);
		

	}

}
