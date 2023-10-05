package pizzaBooking;


public class Admin
{
	public Admin() 
	{
	    	int totalPizzaSold=0;
			int totalTurnOver=0;
			
			int normalCheck=0;
			int normalVeg =0;
			int normalNonVeg =0;
			int normalCheese =0;
			int normalToppings =0;
			int normalTakeAway =0;
			
			int deluxCheck=0;
			int deluxVeg =0;
			int deluxNonVeg =0;
			int deluxCheese =0;
			int deluxToppings =0;
			int deluxTakeAway =0;
			
			int CheesyPizzaQuantity =0;
			int ClassicVeggieQuantity =0;
			int GreekyFunghiQuantity =0;
			int chickenPizzaQuantity =0;
			int muttonPizzaQuantity =0;
			int prawnPizzaQuantity =0;
			
			    long count = Pizza.list.stream().count();
				for(Pizza p : Pizza.list)
				{
					totalPizzaSold += p.getTotalQuantity();
					totalTurnOver += p.getTotalPrice();
					CheesyPizzaQuantity += p.getCheesyPizzaQuantity();
					ClassicVeggieQuantity += p.getClassicVeggieQuantity();
					GreekyFunghiQuantity += p.getGreekyFunghiQuantity();
					chickenPizzaQuantity +=p.getChickenPizzaQuantity();
					muttonPizzaQuantity +=p.getMuttonPizzaQuantity();
					prawnPizzaQuantity =+p.getPrawnPizzaQuantity();
					if(p.getnOrd().equalsIgnoreCase("Normal"))
					{
						normalCheck++;
						if(p.getVorN().equalsIgnoreCase("Veg"))
						{
							normalVeg++;
						}
						if(p.getVorN().equalsIgnoreCase("Non-Veg"))
						{
							normalNonVeg++;
						}
						if(p.isCheeseCheck())
						{
							normalCheese += p.getTotalQuantity();
						}
						if(p.isToppingsCheck())
						{
							normalToppings += p.getTotalQuantity();
						}
						if(p.isTakeawayCheck())
						{
							normalTakeAway += p.getTotalQuantity();
						}
					}
					if(p.getnOrd().equalsIgnoreCase("Delux"))
					{
						deluxCheck++;
						if(p.getVorN().equalsIgnoreCase("Veg"))
						{
							deluxVeg++;
						}
						if(p.getVorN().equalsIgnoreCase("Non-Veg"))
						{
							deluxNonVeg++;
						}
						if(p.isCheeseCheck())
						{
							deluxCheese += p.getTotalQuantity();
						}
						if(p.isToppingsCheck())
						{
							deluxToppings += p.getTotalQuantity();
						}
						if(p.isTakeawayCheck())
						{
							deluxTakeAway += p.getTotalQuantity();
						}
					}
				}
				
				
				System.out.println("Total Users            = "+count);
				System.out.println("Normal Veg Pizza's     = "+normalVeg);
				System.out.println("Normal Non-Veg Pizza's = "+normalNonVeg);
				System.out.println("Normal Cheese          = "+normalCheese);
				System.out.println("Normal Toppings        = "+normalToppings);
				System.out.println("Normal Takeaway's      = "+normalTakeAway);
				System.out.println("Total Normal Pizza's   = "+normalCheck);
				System.out.println("Delux Veg Pizza's      = "+deluxVeg);
				System.out.println("Delux Non-Veg Pizza's  = "+deluxNonVeg);
				System.out.println("Delux Cheese           = "+deluxCheese);
				System.out.println("Delux Toppings         = "+deluxToppings);
				System.out.println("Delux Takeaway's       = "+deluxTakeAway);
				System.out.println("Total Delux Pizza's    = "+deluxCheck);
				System.out.println("Total Cheesy Pizza     = "+CheesyPizzaQuantity);
				System.out.println("Total Classic Veggi    = "+ClassicVeggieQuantity);
				System.out.println("Total Greeky Funghi    = "+GreekyFunghiQuantity);
				System.out.println("Total Chicken Pizza    = "+chickenPizzaQuantity);
				System.out.println("Total Mutton Pizz      = "+muttonPizzaQuantity);
				System.out.println("Total Prawn Pizza      = "+prawnPizzaQuantity);
				System.out.println("Total Pizza's Solded   = "+totalPizzaSold);
				System.out.println("Total Turn Over        = "+totalTurnOver+" rs");
				System.out.println();
			
	    
		
	}

}
