package OutputClasses;
import DataStore.*;

public class DisplayMenu1 extends DisplayMenu {
	public DisplayMenu1(Data data) {
		super(data);
	}
	/*
	 * Displays Available Options and Payment Approved Message
	 */
	public void DisplayMenu() {
		
		System.out.println("");
		System.out.println("Payment Approved"); 
		System.out.println("Available Options: ");
		System.out.println("	7 : StartPump	");
		System.out.println("	6 : Cancel 		" );
		
	}
}
