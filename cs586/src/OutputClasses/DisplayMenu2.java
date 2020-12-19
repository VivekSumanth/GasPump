package OutputClasses;
import DataStore.*;

public class DisplayMenu2 extends DisplayMenu {
	public DisplayMenu2(Data data) {
		super(data);
	}
	/*
	 * Displays Available Options and Payment Approved Message
	 */
	public void DisplayMenu() {
		
		Data2 d = (Data2) data;
		System.out.println("");
		System.out.println("Payment Approved"); 
		System.out.println("Available Options : ");
		System.out.println("	9 : Regular Gas = " + d.getRprice()	);
		System.out.println("	14 : Super Gas = " + d.getSprice()	);
		System.out.println("	8 : Diesel = " + d.getDprice()	);
		System.out.println("	6 : Cancel 		" );
 	}
}