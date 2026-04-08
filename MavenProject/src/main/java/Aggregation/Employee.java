package Aggregation;

public class Employee {
	
	int empid;
	String empname;
	OfficeAddress adrs;
	Employee(int empid,String empname,OfficeAddress adrs)
	{
		this.empid=empid;
		this.empname=empname;
		this.adrs=adrs;
	}
		
		void showDetails()
		{
			System.out.println("E-mployeeid="+empid +" " +"Employee name="+empname);
			System.out.println("Office Address="+adrs.city+" " +adrs.state+"," +adrs.country);
		}
	

	public static void main(String[] args) {
		OfficeAddress oa=new OfficeAddress("Kochi","Kerala","India");
				
				Employee e=new Employee(1,"Kavya",oa);
		e.showDetails();
				

	}

}
