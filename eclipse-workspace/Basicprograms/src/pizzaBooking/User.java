package pizzaBooking;

public class User extends Pizza
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -4931330172540409792L;
	String UserName;
	
	void creatingUser() 
	{
		
		System.out.println("Enter Customer Name");
		super.getU1().setUserName(UserName=MainClass.s.next());
		super.getU1().setUserId(Pizza.list.size());
		System.out.println("Hi "+super.getU1().getUserName()+" What Pizza You Need");
		System.out.println("Your User ID = "+super.getU1().getUserId());
		System.out.println("For Normal Pizza press 1 ");
		System.out.println("For Deluxe Pizza press 2");
		System.out.println("For Exit Press 3");
		int n=MainClass.s.nextInt();
		boolean flag=true;
		while(flag)
		{
		  switch(n)
			{
			case(1):
				NormalPizza np = new NormalPizza();
				np.normalPizza();
				if(super.getU1()!=null && super.getU1().getTotalQuantity()>0)
				{   super.getU1().setnOrd("Normal");
					Billing.billing(super.getU1());
					Pizza.getList().add(super.getU1());
				    try 
				    {
						write.write(Pizza.getList());
						Read.read();
					} catch (Exception e) 
				    {
						
						e.printStackTrace();
					}
				}
				flag=false;
				break;
			case(2):
				
				DeluxPizza dp = new DeluxPizza();
				dp.deluxPizza();
				if(super.getU1()!=null && super.getU1().getTotalQuantity()>0)
				{   super.getU1().setnOrd("Delux");
					Billing.billing(super.getU1());	
					Pizza.getList().add(super.getU1());
				    try 
				    {
						write.write(Pizza.getList());
						Read.read();
					} catch (Exception e) 
				    {
						
						e.printStackTrace();
					}
				}
				flag=false;
				break;
			case(3):
				System.out.println("Thanks! visit again :)");
				flag=false;
				System.gc();
				break;
			default :
				System.out.println("Please enter correct Number");
				n=MainClass.s.nextInt();
			}
		}
		
		
		
		
	}
	

}
