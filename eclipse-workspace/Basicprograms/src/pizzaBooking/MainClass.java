package pizzaBooking;
import java.util.Scanner;


public class MainClass extends Pizza
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1993893010083659994L;
	public static Scanner s = new Scanner(System.in);


	static
	{
		try 
		{
		Read.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		MainClass m1 = new MainClass();
			m1.mainMethod();
		
	}
	
	 void mainMethod() 
	{
		while(true)
		{
			System.out.println("User Means Press 1");
			System.out.println("Admin Means Press 2");
			System.out.println("For Exit press 3");
			int user = MainClass.s.nextInt();
			
			switch (user)
			{
			  case(1):
			  {
				super.setU1(new User());
				User u1 = (User)super.getU1();
				u1.creatingUser();
				break;
			  }
			  case(2):
			  {
				  	System.out.println("Enter Admin Password...");
				  	System.out.println("For Exit press 3");
				    String pass = MainClass.s.next();
				    while(!pass.equalsIgnoreCase("java")&&!pass.equalsIgnoreCase("3"))
					{
						System.out.println("Enter Correct Password");
						pass=MainClass.s.next();
					}
				    if(pass.equalsIgnoreCase("Java"))
				    {
				    	new Admin ();
				    }
				break;
			  }
			  case(3):
			  {
				  System.out.println("Thank You");
				  System.out.println();
				  System.exit(0);
			  }
			
			}
	    }
		
	}

}
