package JavaProjects;

public class StringExample {

	public static void main(String[] args) {
		String s="Hello Programmers";
		String s1="  Hello ";
		String s2="World";
		
		System.out.println(s.length());
		System.out.println(s1.equals(s));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s.contains(s1));
		System.out.println(s.charAt(8));
		String sl=s2.toLowerCase();
		System.out.println(sl);
		System.out.println(sl.toUpperCase());
		String subs=s.substring(6,13);
		System.out.println(subs);
		
		System.out.println(s1.trim());
		System.out.println(s.startsWith("he"));
		System.out.println(s.endsWith("mers"));
		String str = "Apple,Orange,Grapes";
		String fruit[]=str.split(",");
		for(String f:fruit)
			{
			System.out.println(f);
			}
		
	

	}

}
