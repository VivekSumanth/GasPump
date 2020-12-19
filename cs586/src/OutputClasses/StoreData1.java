package OutputClasses;
import DataStore.*;

public class StoreData1 extends StoreData{
	
	
	public StoreData1(Data data) {
		super(data);
	}


	public void StoreData() {
		Data1 d = (Data1) data;
		d.setPrice(d.getTemp_a());
		System.out.println("");
		System.out.println("Gas Pump-1 activated !!! Now Start to Pump Gas");
		System.out.println("	1: Start()");
	}

}
