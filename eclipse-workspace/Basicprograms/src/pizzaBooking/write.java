package pizzaBooking;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class write 
{
	public static void write(List<Pizza> list) throws Exception
	{
		
		File f1 = new File("C:\\Users\\vedes\\OneDrive\\Desktop\\PizzaBills\\data1\\PizzaBookingData.txt");
		

		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(list);
		
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
		
		
	}
}
