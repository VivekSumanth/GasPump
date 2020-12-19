package OutputClasses;
import DataStore.*;

public class PumpGasUnit2 extends PumpGasUnit {
	
	public PumpGasUnit2(Data data) {
		super(data);
	}

	// SET G AND TOTAL
	@Override
	public void PumpGasUnit() {
		Data2 d = (Data2) data;
		d.setG(d.getG()+1);
		d.setTotal(d.getG()*d.getPrice());
		System.out.println("Total Gas Pumped : " + d.getG() + " Gallons");
		System.out.println("Your Total Amount : " + d.getTotal());
	}

}
