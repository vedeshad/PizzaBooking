package pizzaBooking;


public class NormalPizza extends Pizza
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	void normalPizza()
	{
		System.out.println("For Veg-Pizza press 1");
		System.out.println("For Non-Veg Pizza Press 2");
		System.out.println("To go back press 3");
		System.out.println("To Exit press 4");
		int num= MainClass.s.nextInt();
		
		boolean flag=true;
		while(flag)
		{
		 switch(num)
		 {
		case(1):
			
			VegPizza vp=new VegPizza();
			vp.vegPizza();
			if(super.getU1().getTotalQuantity()>0)
			{   super.getU1().setVorN("Veg");
				flavAdd();
			}
			flag=false;
			break;
		case(2):
			
			NonVegPizza np =new NonVegPizza();
			np.nonVegPizza();
			if(super.getU1().getTotalQuantity()>0)
			{	super.getU1().setVorN("Non-Veg");
				flavAdd();
			}
			flag=false;
			break;
		case(3):
			//creatingUser();
			flag=false;
		
		case(4):
			System.out.println("Thanks! visit again :)");
		    super.setU1(null);
		    flag=false;
			break;
		default :
			System.out.println("Enter correct number");
			num=MainClass.s.nextInt();
		}
		
	   }
	 }
	void flavAdd()
	  {
		        
				System.out.println("Did You Need Cheese Rs10 ?");
				System.out.println("If Need Type Yes or Else No");
				String extraCheese=MainClass.s.next();
				while(!extraCheese.equalsIgnoreCase("yes")&&!extraCheese.equalsIgnoreCase("no"))
				{
					System.out.println("Enter Correctly");
					extraCheese=MainClass.s.next();
				}
				if(extraCheese.equalsIgnoreCase("yes"))
				{
					super.getU1().setCheeseCheck(true);
					super.getU1().setTotalPrice(10*super.getU1().getTotalQuantity());
			
				}
				
				System.out.println("Did You Need Toppings Rs10 ?");
				System.out.println("If Need Type Yes or Else No");
				String tCheck =MainClass.s.next();
				while(!tCheck.equalsIgnoreCase("yes")&&!tCheck.equalsIgnoreCase("no"))
				{
					System.out.println("Enter Correctly");
					tCheck=MainClass.s.next();
				}
				if(tCheck.equalsIgnoreCase("yes"))
				{
					super.getU1().setToppingsCheck(true);
					super.getU1().setTotalPrice(10*super.getU1().getTotalQuantity());
				}
				System.out.println("Did You Need TakeAway Rs20 ?");
				System.out.println("If Need Type Yes or Else No");
				String takeCheck =MainClass.s.next();
				while(!takeCheck.equalsIgnoreCase("yes")&&!takeCheck.equalsIgnoreCase("no"))
				{
					System.out.println("Enter Correctly");
					takeCheck=MainClass.s.next();
				}
				if(takeCheck.equalsIgnoreCase("yes"))
				{  
					super.getU1().setTakeawayCheck(true);
					super.getU1().setTotalPrice(20);
				}
	  }
		
	}
	
