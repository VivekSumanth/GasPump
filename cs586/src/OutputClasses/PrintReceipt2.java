package OutputClasses;
import DataStore.*;

public class PrintReceipt2 extends PrintReceipt {
	
	public PrintReceipt2(Data data) {
		super(data);
	}

	//Print receipt()
	@Override
	public void PrintReceipt() {
		Data2 d = (Data2) data;
		
		System.out.println("");
		System.out.println("Receipt ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("price of the fuel	                      	: " + d.getPrice());
		System.out.println("The Total Fuel Pumped				: " + d.getG());
		System.out.println("Total Amount to be paid                         : " +  d.getTotal());
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------");
	}
}
