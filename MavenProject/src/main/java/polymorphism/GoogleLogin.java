package polymorphism;

public class GoogleLogin extends Login{
	
	void userLogin()
	{
		System.out.println("Welcome user to google");
	}
	
	void display()
	{
		System.out.println("Welcome admin to Google");
	}


	public static void main(String[] args) {
		
		GoogleLogin g=new GoogleLogin();
		Login l=new Login();
		l.userLogin();
		g.userLogin();
		g.display();
		

	}

}
