package pizzaBooking;

public class NonVegPizza extends Pizza
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	void nonVegPizza() 
	{
		System.out.println("Press 1) Chicken Pizza --Rs.100");
		System.out.println("Press 2) Mutton Pizza --Rs.150");
		System.out.println("Press 3) Prawn Pizza --Rs.200");
		System.out.println("Press 4) To Exit");
		extraAdd();
		
	} 
	 
	 
	  void extraAdd()
	 {		
		    boolean flag=true;
		    int num=0;
			while(flag)
			{   
				 num=MainClass.s.nextInt();	
				if(num>0&&num<4)
				{   System.out.println("Enter quantity you need");
					int num1=num;
					int quantity=0;
					int totalPrice=0;  
					switch(num)
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
							super.getU1().setChickenPizzaQuantity(quantity);
							super.getU1().setTotalQuantity(quantity);
							totalPrice=100*quantity;
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
										super.getU1().setChickenPizzaQuantity(quantity);
										super.getU1().setTotalQuantity(quantity);
										totalPrice=100*quantity;
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
										super.getU1().setMuttonPizzaQuantity(quantity);
										super.getU1().setTotalQuantity(quantity);
										totalPrice=150*quantity;
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
										super.getU1().setPrawnPizzaQuantity(quantity);
										super.getU1().setTotalQuantity(quantity);
										totalPrice=200*quantity;
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
					case(2):
						quantity=MainClass.s.nextInt();
						while(quantity<=0)
						{
							System.out.println("Enter Correct quantity you need");
							quantity=MainClass.s.nextInt();
						}
						if(quantity>0)
						{
						super.getU1().setMuttonPizzaQuantity(quantity);
						super.getU1().setTotalQuantity(quantity);
						totalPrice=150*quantity;
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
									super.getU1().setChickenPizzaQuantity(quantity);
									super.getU1().setTotalQuantity(quantity);
									totalPrice=100*quantity;
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
									super.getU1().setMuttonPizzaQuantity(quantity);
									super.getU1().setTotalQuantity(quantity);
									totalPrice=150*quantity;
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
									super.getU1().setPrawnPizzaQuantity(quantity);
									super.getU1().setTotalQuantity(quantity);
									totalPrice=200*quantity;
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
							super.getU1().setPrawnPizzaQuantity(quantity);
							super.getU1().setTotalQuantity(quantity);
							totalPrice=200*quantity;
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
								super.getU1().setChickenPizzaQuantity(quantity);
								super.getU1().setTotalQuantity(quantity);
								totalPrice=100*quantity;
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
								super.getU1().setMuttonPizzaQuantity(quantity);
								super.getU1().setTotalQuantity(quantity);
								totalPrice=150*quantity;
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
								super.getU1().setPrawnPizzaQuantity(quantity);
								super.getU1().setTotalQuantity(quantity);
								totalPrice=200*quantity;
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
				else if(num==4)
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
