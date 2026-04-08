package collections;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(0,4);
		System.out.println(num);
		num.add(1);
		System.out.println(num);
		num.set(2, 6);
		System.out.println(num);
		num.remove(3);
		System.out.println(num);
	}

}
