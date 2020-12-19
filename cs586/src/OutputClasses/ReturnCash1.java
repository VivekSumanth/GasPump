package OutputClasses;
import DataStore.*;

public class ReturnCash1 extends ReturnCash{
	
	public ReturnCash1(Data data) {
		super(data);
	}

	//return Cash when transaction cancelled

	public void ReturnCash() {

		Data1 d = (Data1) data;
		float returnCash = d.getCash() - d.getTotal();
		if (returnCash > 0) {
			System.out.println("");
			System.out.println("Your Change : $" + returnCash);
		} else {
			System.out.println("");
			System.out.println("No cash to return");
		}
		System.out.println("");
		System.out.println("Transaction finished");
		
	}


}
