package pizzaBooking;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Pizza implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private boolean cheeseCheck;
	private boolean toppingsCheck;
	private boolean takeawayCheck;
	private String userName;
	private String nOrd;
	private String VorN;
	private int userId;
	private double totalPrice;
	private int totalQuantity;
	private int CheesyPizzaQuantity ;
	private int ClassicVeggieQuantity;
	private int GreekyFunghiQuantity;
	private int chickenPizzaQuantity;
	private int muttonPizzaQuantity;
	private int prawnPizzaQuantity;
	private static Pizza u1;
	static List<Pizza> list = new ArrayList<Pizza>();
	
	
	public static List<Pizza> getList() {
		return list;
	}
	public static Pizza getU1() {
		return u1;
	}
	public static void setU1(Pizza u1) {
		Pizza.u1 = u1;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getnOrd() {
		return nOrd;
	}
	public void setnOrd(String nOrd) {
		this.nOrd = nOrd;
	}
	public String getVorN() {
		return VorN;
	}
	public void setVorN(String vorN) {
		VorN = vorN;
	}
	public boolean isCheeseCheck() {
		return cheeseCheck;
	}
	public void setCheeseCheck(boolean cheeseCheck) {
		this.cheeseCheck = cheeseCheck;
	}
	public boolean isToppingsCheck() {
		return toppingsCheck;
	}
	public void setToppingsCheck(boolean toppingsCheck) {
		this.toppingsCheck = toppingsCheck;
	}
	public boolean isTakeawayCheck() {
		return takeawayCheck;
	}
	public void setTakeawayCheck(boolean takeawayCheck) {
		this.takeawayCheck = takeawayCheck;
	}
	public int getChickenPizzaQuantity() {
		return chickenPizzaQuantity;
	}
	public void setChickenPizzaQuantity(int chickenPizzaQuantity1) {
		this.chickenPizzaQuantity = chickenPizzaQuantity+chickenPizzaQuantity1;
	}
	public int getMuttonPizzaQuantity() {
		return muttonPizzaQuantity;
	}
	public void setMuttonPizzaQuantity(int muttonPizzaQuantity1) {
		this.muttonPizzaQuantity = muttonPizzaQuantity+muttonPizzaQuantity1;
	}
	public int getPrawnPizzaQuantity() {
		return prawnPizzaQuantity;
	}
	public void setPrawnPizzaQuantity(int prawnPizzaQuantity1) {
		this.prawnPizzaQuantity = prawnPizzaQuantity+prawnPizzaQuantity1;
	}
	public int getCheesyPizzaQuantity() {
		return CheesyPizzaQuantity;
	}
	public void setCheesyPizzaQuantity(int cheesyPizzaQuantity1) {
		this.CheesyPizzaQuantity = CheesyPizzaQuantity+cheesyPizzaQuantity1;
	}
	public int getClassicVeggieQuantity() {
		return ClassicVeggieQuantity;
	}
	public void setClassicVeggieQuantity(int classicVeggieQuantity1) {
		ClassicVeggieQuantity = ClassicVeggieQuantity+classicVeggieQuantity1;
	}
	public int getGreekyFunghiQuantity() {
		return GreekyFunghiQuantity;
	}
	public void setGreekyFunghiQuantity(int greekyFunghiQuantity1) {
		GreekyFunghiQuantity = GreekyFunghiQuantity+greekyFunghiQuantity1;
	}
	public int getTotalQuantity() 
	{
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity1) 
	{
		this.totalQuantity = totalQuantity+totalQuantity1;
	}	
	
	public double getTotalPrice() 
	{
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice1) 
	{
		this.totalPrice = totalPrice+totalPrice1;
	}
	
	 
	
	
	
	
	
	
	

}
