package OutputClasses;
import DataStore.*;

public class ReadyMsg1 extends ReadyMsg {
	
	public ReadyMsg1(Data data) {
		super(data);
	}


	public void ReadyMsg() {
		Data1 d = (Data1) data;
		System.out.println("");
		System.out.println("~~~~~ GasPump is  Ready to Pump ~~~~~");
		System.out.println("Your selected gas price is : " + d.getPrice() + "/Liter");
		System.out.println("8 : 1 Liter of Gas");
		System.out.println("9 : Stop Pump");
	}

}
