package OutputClasses;

import DataStore.*;

public class ReadyMsg2 extends ReadyMsg {


	public ReadyMsg2(Data data) {
		super(data);
	}


	@Override
	public void ReadyMsg() {
		Data2 d = (Data2) data;
		System.out.println("");
		System.out.println("~~~~~ GasPump is  Ready ~~~~~");
		System.out.println("Your selected gas price is : " + d.getPrice() + "/Gallon");
		System.out.println("11 : 1 Gallon of Gas");
		System.out.println("12 : Stop Pump");
		System.out.println("13 : FullTank");
	}

}
