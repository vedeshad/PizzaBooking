package pizzaBooking;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;



public class Read 
{
	
	@SuppressWarnings("unchecked")
	public static void  read() throws Exception
	{

		File f1 = new File("C:\\Users\\vedes\\OneDrive\\Desktop\\PizzaBills\\data1\\PizzaBookingData.txt");
		
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = null;
		int size = (int) f1.length();
		
		if(size>0)
		{
			ois = new ObjectInputStream(fis);
			Pizza.list = (List<Pizza>) ois.readObject();
			ois.close();
		}
	}

}
