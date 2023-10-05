package pizzaBooking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Print extends Pizza
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("null")
	void print() 
	{ SimpleDateFormat format = new SimpleDateFormat();
	  Date date = new Date();
		
		File f2 = new File("C:\\Users\\vedes\\OneDrive\\Desktop\\PizzaBills\\"+super.getU1().getUserName()+".txt");
		FileWriter fw = null;
		try 
		{
			f2.createNewFile();
			fw = new FileWriter(f2);
			
			fw.write("-------------------------------------------------------"+"\n");
			fw.write("                   Bill For Your Order                 "+"\n");
			fw.write("-------------------------------------------------------"+"\n");
			fw.write(" Customer Name = "+super.getU1().getUserName()+"\n");
			fw.write(" Customer ID   = "+super.getU1().getUserId()+"\n");
			fw.write(" Date & Time   = "+format.format(date)+"\n");
			fw.write("-------------------------------------------------------"+"\n");
			fw.write("          You Have Ordered "+super.getU1().getnOrd()+" "+super.getU1().getVorN()+" Pizza          "+"\n");
			fw.write("-------------------------------------------------------"+"\n");
			fw.write("      Pizzas          |     Quantity     |     Price   "+"\n");
			fw.write("-------------------------------------------------------"+"\n");
			if(super.getU1().getCheesyPizzaQuantity()>0)
		   {fw.write(" Cheesy Pizza         | "+super.getU1().getCheesyPizzaQuantity()+"                |"+" "+(74*super.getU1().getCheesyPizzaQuantity())+"\n");}
			if(super.getU1().getGreekyFunghiQuantity()>0)
		   {fw.write(" Greeky Funghi Pizza  | "+super.getU1().getGreekyFunghiQuantity()+"                |"+" "+(550*super.getU1().getGreekyFunghiQuantity())+"\n");}
			if(super.getU1().getClassicVeggieQuantity()>0)
		   {fw.write(" Classic Veggie Pizza | "+super.getU1().getClassicVeggieQuantity()+"                |"+" "+(159*super.getU1().getClassicVeggieQuantity())+"\n");}
			if(super.getU1().getChickenPizzaQuantity()>0)
		   {fw.write(" Chicken Pizza        | "+super.getU1().getChickenPizzaQuantity()+"                |"+" "+(100*super.getU1().getChickenPizzaQuantity())+"\n");}
		    if(super.getU1().getMuttonPizzaQuantity()>0)
		   {fw.write(" Mutton Pizza         | "+super.getU1().getMuttonPizzaQuantity()+"                |"+" "+(150*super.getU1().getMuttonPizzaQuantity())+"\n");}
		    if(super.getU1().getPrawnPizzaQuantity()>0)
		   {fw.write(" Prawn Pizza          | "+super.getU1().getPrawnPizzaQuantity()+"                |"+" "+(200*super.getU1().getPrawnPizzaQuantity())+"\n");}
			
		    if(super.getU1().getnOrd().equalsIgnoreCase("Normal"))
		    {
		    	if(super.getU1().isCheeseCheck()|super.getU1().isToppingsCheck()|super.getU1().isTakeawayCheck())
				   {fw.write("-------------------------------------------------------"+"\n");
					fw.write("    ExtraAddons       |       Check      |     Price   "+"\n");
					fw.write("-------------------------------------------------------"+"\n");
					if(super.getU1().isCheeseCheck())
				   {fw.write(" Cheese               |"+"       Added      |"+" "+(10*super.getU1().getTotalQuantity())+"\n");}
					if(super.getU1().isToppingsCheck())
				   {fw.write(" Toppings             |"+"       Added      |"+" "+(10*super.getU1().getTotalQuantity())+"\n");}
					if(super.getU1().isTakeawayCheck())
				   {fw.write(" TakeAway             |"+"       Added      |"+" "+"20    "+"\n");}
					}
		    }
		    if(super.getU1().getnOrd().equalsIgnoreCase("Delux"))
		    {
		    	if(super.getU1().isCheeseCheck()|super.getU1().isToppingsCheck()|super.getU1().isTakeawayCheck())
				   {fw.write("-------------------------------------------------------"+"\n");
					fw.write("    ExtraAddons       |       Check      |     Price   "+"\n");
					fw.write("-------------------------------------------------------"+"\n");
					if(super.getU1().isCheeseCheck())
				   {fw.write(" Double Cheese        |"+"       Added      |"+" "+(20*super.getU1().getTotalQuantity())+"\n");}
					if(super.getU1().isToppingsCheck())
				   {fw.write(" Double Toppings      |"+"       Added      |"+" "+(20*super.getU1().getTotalQuantity())+"\n");}
					if(super.getU1().isTakeawayCheck())
				   {fw.write(" TakeAway             |"+"       Added      |"+" "+"30    "+"\n");}
					}
		    }
		    
			fw.write("-------------------------------------------------------"+"\n");
			fw.write("       Total          | "+super.getU1().getTotalQuantity()+"                |"+" "+(super.getU1().getTotalPrice())+"\n");
			fw.write("-------------------------------------------------------"+"\n");
			
			fw.flush();
			fw.close();
		} 
		catch (IOException e) 
		{
			e.getStackTrace();
			
		}
	}
	
	
}
