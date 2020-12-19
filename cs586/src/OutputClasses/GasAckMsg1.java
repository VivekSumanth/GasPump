package OutputClasses;

import DataStore.*;

public class GasAckMsg1 extends GasAckMsg {


	public GasAckMsg1(Data data) {
		super(data);
		
		}

	//display the quantity of pumped gas in Liters
	@Override
	public void GasAckMsg() {
		Data1 d = (Data1) data;
		System.out.println("");
		System.out.println("Total Gas Pumped in : " + d.getL() + "Liters");
		System.out.println("8: PumpLiter");
		System.out.println("9: StopPump");
	}
}
