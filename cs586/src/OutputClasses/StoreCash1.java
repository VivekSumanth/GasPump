package OutputClasses;
import DataStore.*;

public class StoreCash1 extends StoreCash {
	
	public StoreCash1(Data data) {
		super(data);
	}
	
	// Store Cash

	public void StoreCash() {
		Data1 d = (Data1) data;
		d.setCash(d.getTemp_c()); 
		System.out.println("");
		System.out.println("CASH IN : " + d.getCash());
		System.out.println("---------------------------------------------------------------------");
	}
}
