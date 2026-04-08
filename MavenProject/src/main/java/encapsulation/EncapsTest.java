package encapsulation;

public class EncapsTest {
	
	private String name;
	private int age;
	private int id;
	
	
	public void  setAge(int age)
	{
		this.age=age;  //setter method(to write the value)
		
	}
	
	public int getAge()
	{
		return age;  //getter message (to read value)
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getid()
	{
		return id;
	}
}
