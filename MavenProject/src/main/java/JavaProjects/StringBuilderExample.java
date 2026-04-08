package JavaProjects;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("hai");
		StringBuffer sb1= new StringBuffer("Hello World");
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append( " World"));
		System.out.println(sb1.insert(5, " java"));
		
	sb.setCharAt(0,'c');
	System.out.println(sb);

	}

}
