package collections;

import java.util.ArrayList;

public class ColourArrayList {

	public static void main(String[] args) {
		 
		
		ArrayList <String> color=new ArrayList<>();
		color.add("Orange");
		color.add("Yellow");
		color.add("Pink");
		color.add("Red");
		color.add("Brown");
		System.out.println(color);
		
        System.out.println("Element in the First Index is  " +color.get(1));
        
        for(String s: color)
        {
        	System.out.println(color);
        	
        }
       
       color.remove(2);
       System.out.println("The list after Removing 3rd Element  " +color);
       
       
       System.out.println( color.contains("Yellow"));
       
       
		
	

	}

}
