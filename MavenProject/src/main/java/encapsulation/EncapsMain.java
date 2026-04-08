package encapsulation;

public class EncapsMain {

	public static void main(String[] args) {
		EncapsTest e=new EncapsTest();
		e.setAge(20);
		System.out.println(e.getAge());
        e.setName("Kavya");
       System.out.println( e.getName());
       e.setId(101);
       System.out.println(e.getid());
	}

}
