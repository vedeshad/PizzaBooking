package pizzaBooking;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class Billing extends Pizza
{
	static void billing (Pizza u1)
	{ SimpleDateFormat format = new SimpleDateFormat();
	  Date date = new Date();
	  Print p = new Print();
		if(u1 instanceof User)
		{
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("                   Bill For Your Order                 ");
					System.out.println("-------------------------------------------------------");
					System.out.println(" Customer Name = "+u1.getUserName());
					System.out.println(" Customer ID   = "+u1.getUserId());
					System.out.println(" Date & Time   = "+format.format(date));
					System.out.println("-------------------------------------------------------");
					System.out.println("          You Have Ordered "+u1.getnOrd()+" "+u1.getVorN()+" Pizza          ");
					System.out.println("-------------------------------------------------------");
					System.out.println("      Pizzas          |     Quantity     |     Price   ");
					System.out.println("-------------------------------------------------------");
					if(u1.getCheesyPizzaQuantity()>0)
				   {System.out.println(" Cheesy Pizza         | "+u1.getCheesyPizzaQuantity()+"                |"+" "+(74*u1.getCheesyPizzaQuantity()));}
					if(u1.getGreekyFunghiQuantity()>0)
				   {System.out.println(" Greeky Funghi Pizza  | "+u1.getGreekyFunghiQuantity()+"                |"+" "+(550*u1.getGreekyFunghiQuantity()));}
					if(u1.getClassicVeggieQuantity()>0)
				   {System.out.println(" Classic Veggie Pizza | "+u1.getClassicVeggieQuantity()+"                |"+" "+(159*u1.getClassicVeggieQuantity()));}
					if(u1.getChickenPizzaQuantity()>0)
				   {System.out.println(" Chicken Pizza        | "+u1.getChickenPizzaQuantity()+"                |"+" "+(100*u1.getChickenPizzaQuantity()));}
				    if(u1.getMuttonPizzaQuantity()>0)
				   {System.out.println(" Mutton Pizza         | "+u1.getMuttonPizzaQuantity()+"                |"+" "+(150*u1.getMuttonPizzaQuantity()));}
				    if(u1.getPrawnPizzaQuantity()>0)
				   {System.out.println(" Prawn Pizza          | "+u1.getPrawnPizzaQuantity()+"                |"+" "+(200*u1.getPrawnPizzaQuantity()));}
					
				    if(u1.getnOrd().equalsIgnoreCase("Normal"))
				    {
				    	if(u1.isCheeseCheck()|u1.isToppingsCheck()|u1.isTakeawayCheck())
						   {System.out.println("-------------------------------------------------------");
							System.out.println("    ExtraAddons       |       Check      |     Price   ");
							System.out.println("-------------------------------------------------------");
							if(u1.isCheeseCheck())
						   {System.out.println(" Cheese               |"+"       Added      |"+" "+(10*u1.getTotalQuantity()));}
							if(u1.isToppingsCheck())
						   {System.out.println(" Toppings             |"+"       Added      |"+" "+(10*u1.getTotalQuantity()));}
							if(u1.isTakeawayCheck())
						   {System.out.println(" TakeAway             |"+"       Added      |"+" "+"20    ");}
							}
				    }
				    if(u1.getnOrd().equalsIgnoreCase("Delux"))
				    {
				    	if(u1.isCheeseCheck()|u1.isToppingsCheck()|u1.isTakeawayCheck())
						   {System.out.println("-------------------------------------------------------");
							System.out.println("    ExtraAddons       |       Check      |     Price   ");
							System.out.println("-------------------------------------------------------");
							if(u1.isCheeseCheck())
						   {System.out.println(" Double Cheese        |"+"       Added      |"+" "+(20*u1.getTotalQuantity()));}
							if(u1.isToppingsCheck())
						   {System.out.println(" Double Toppings      |"+"       Added      |"+" "+(20*u1.getTotalQuantity()));}
							if(u1.isTakeawayCheck())
						   {System.out.println(" TakeAway             |"+"       Added      |"+" "+"30    ");}
							}
				    }
				    
					System.out.println("-------------------------------------------------------");
					System.out.println("       Total          | "+u1.getTotalQuantity()+"                |"+" "+(u1.getTotalPrice()));
					System.out.println("-------------------------------------------------------");
					p.print();
				    
					
		}
	}
}
		
