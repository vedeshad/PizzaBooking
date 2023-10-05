package pizzaBooking;

public class VegPizza extends Pizza
{
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	void vegPizza()
	  {
		  System.out.println("Press 1) Cheesy Pizza --Rs.74");
			System.out.println("Press 2) Greeky Funghi Pizza --Rs.550");
			System.out.println("Press 3) Classic Veggie Pizza --Rs.159");
			System.out.println("Press 4) To Exit");
			extraAdd();
	  }
	 
	 
	  void extraAdd()

	 {
		    boolean flag=true;
		    int num1=0;
			while(flag)
			{   
				 num1=MainClass.s.nextInt();	
				if(num1>0&&num1<4)
				{   System.out.println("Enter quantity you need");
					
					int quantity=0;
					int totalPrice=0;  
					switch(num1)
					{
					case(1):
					    quantity=MainClass.s.nextInt();
					while(quantity<=0)
					{
						System.out.println("Enter Correct quantity you need");
						quantity=MainClass.s.nextInt();
					}
						if(quantity>0)
						{
							super.getU1().setCheesyPizzaQuantity(quantity);
							super.getU1().setTotalQuantity(quantity);
							totalPrice=74*quantity;
							super.getU1().setTotalPrice(totalPrice);
							System.out.println("If you need to add more means press the numbers or press 4) to exit");
							num1=MainClass.s.nextInt();
							if(num1>0&&num1<4)
							{
								System.out.println("Enter quantity you need");
								if(num1==1)
								{
									quantity=MainClass.s.nextInt();
									while(quantity<=0)
									{
										System.out.println("Enter Correct quantity you need");
										quantity=MainClass.s.nextInt();
									}
									if(quantity>0)
									{
										super.getU1().setCheesyPizzaQuantity(quantity);
										super.getU1().setTotalQuantity(quantity);
										totalPrice=74*quantity;
										super.getU1().setTotalPrice(totalPrice);
									}
								}
								else if(num1==2)
								{
									quantity=MainClass.s.nextInt();
									while(quantity<=0)
									{
										System.out.println("Enter Correct quantity you need");
										quantity=MainClass.s.nextInt();
									}
									if(quantity>0)
									{
										super.getU1().setGreekyFunghiQuantity(quantity);
										super.getU1().setTotalQuantity(quantity);
										totalPrice=550*quantity;
										super.getU1().setTotalPrice(totalPrice);
									}
								}
								else if(num1==3)
								{
									quantity=MainClass.s.nextInt();
									while(quantity<=0)
									{
										System.out.println("Enter Correct quantity you need");
										quantity=MainClass.s.nextInt();
									}
									if(quantity>0)
									{
										super.getU1().setClassicVeggieQuantity(quantity);
										super.getU1().setTotalQuantity(quantity);
										totalPrice=159*quantity;
										super.getU1().setTotalPrice(totalPrice);
									}
								}
								System.out.println("If you need to add more means press the numbers or press 4) to exit");
							}
							else if(num1==4)
							{
							 flag=false;
							 break;
							}
							else
							{
								System.out.println("Enter correct number to Order More ");
							}
							break;
						}
						break;
					case(2):
						quantity=MainClass.s.nextInt();
						while(quantity<=0)
						{
						System.out.println("Enter Correct quantity you need");
						quantity=MainClass.s.nextInt();
						}
						if(quantity>0)
						{
						super.getU1().setGreekyFunghiQuantity(quantity);
						super.getU1().setTotalQuantity(quantity);
						totalPrice=550*quantity;
						super.getU1().setTotalPrice(totalPrice);
						System.out.println("If you need to add more means press the numbers or press 4) to exit");
						num1=MainClass.s.nextInt();
						if(num1>0&&num1<4)
						{
							System.out.println("Enter quantity you need");
							if(num1==1)
							{
								quantity=MainClass.s.nextInt();
								while(quantity<=0)
								{
									System.out.println("Enter Correct quantity you need");
									quantity=MainClass.s.nextInt();
								}
								if(quantity>0)
								{
									super.getU1().setCheesyPizzaQuantity(quantity);
									super.getU1().setTotalQuantity(quantity);
									totalPrice=74*quantity;
									super.getU1().setTotalPrice(totalPrice);
								}
							}
							else if(num1==2)
							{
								quantity=MainClass.s.nextInt();
								while(quantity<=0)
								{
									System.out.println("Enter Correct quantity you need");
									quantity=MainClass.s.nextInt();
								}
								if(quantity>0)
								{
									super.getU1().setGreekyFunghiQuantity(quantity);
									super.getU1().setTotalQuantity(quantity);
									totalPrice=550*quantity;
									super.getU1().setTotalPrice(totalPrice);
								}
							}
							else if(num1==3)
							{
								quantity=MainClass.s.nextInt();
								while(quantity<=0)
								{
									System.out.println("Enter Correct quantity you need");
									quantity=MainClass.s.nextInt();
								}
								if(quantity>0)
								{
									super.getU1().setClassicVeggieQuantity(quantity);
									super.getU1().setTotalQuantity(quantity);
									totalPrice=159*quantity;
									super.getU1().setTotalPrice(totalPrice);
								}
							}
							System.out.println("If you need to add more means press the numbers or press 4) to exit");
						}
						else if(num1==4)
						{
						 flag=false;
						 break;
						}
						else
						{
							System.out.println("Enter correct number to Order More");
						}
						break;
					}
					break;
					case(3):
						quantity=MainClass.s.nextInt();
					while(quantity<=0)
					{
					System.out.println("Enter Correct quantity you need");
					quantity=MainClass.s.nextInt();
					}
					if(quantity>0)
					{
					super.getU1().setClassicVeggieQuantity(quantity);
					super.getU1().setTotalQuantity(quantity);
					totalPrice=159*quantity;
					super.getU1().setTotalPrice(totalPrice);
					System.out.println("If you need to add more means press the numbers or press 4) to exit");
					num1=MainClass.s.nextInt();
					if(num1>0&&num1<4)
					{
						System.out.println("Enter quantity you need");
						if(num1==1)
						{
							quantity=MainClass.s.nextInt();
							while(quantity<=0)
							{
								System.out.println("Enter Correct quantity you need");
								quantity=MainClass.s.nextInt();
							}
							if(quantity>0)
							{
								super.getU1().setCheesyPizzaQuantity(quantity);
								super.getU1().setTotalQuantity(quantity);
								totalPrice=74*quantity;
								super.getU1().setTotalPrice(totalPrice);
							}
						}
						else if(num1==2)
						{
							quantity=MainClass.s.nextInt();
							while(quantity<=0)
							{
								System.out.println("Enter Correct quantity you need");
								quantity=MainClass.s.nextInt();
							}
							if(quantity>0)
							{
								super.getU1().setGreekyFunghiQuantity(quantity);
								super.getU1().setTotalQuantity(quantity);
								totalPrice=550*quantity;
								super.getU1().setTotalPrice(totalPrice);
							}
						}
						else if(num1==3)
						{
							quantity=MainClass.s.nextInt();
							while(quantity<=0)
							{
								System.out.println("Enter Correct quantity you need");
								quantity=MainClass.s.nextInt();
							}
							if(quantity>0)
							{
								super.getU1().setClassicVeggieQuantity(quantity);
								super.getU1().setTotalQuantity(quantity);
								totalPrice=159*quantity;
								super.getU1().setTotalPrice(totalPrice);
							}
						}
						System.out.println("If you need to add more means press the numbers or press 4) to exit");
					}
					else if(num1==4)
					{
					 flag=false;
					 break;
					}
					else
					{
						System.out.println("Enter correct number to Order More");
					}
					break;
				}
				break;
					case(4):
					{
						flag=false;
						break;
					}
					default:
						System.out.println("Enter correct number to Order More");
						
					}
					
				}
				else if(num1==4)
				{
				   flag=false;
				   break;
				}
				else
				{
					System.out.println("Enter correct number to Order More");				
				}
			  
				
			}
			
	 }
}
