package OutputClasses;
import DataStore.*;

public class PumpGasUnit1 extends PumpGasUnit{

	public PumpGasUnit1(Data data) {
		super(data);
	}

	// SET L AND TOTAL
	public void PumpGasUnit() {
		Data1 d = (Data1) data;
		d.setL(d.getL()+1);
		d.setTotal(d.getPrice()*d.getL());
		System.out.println("");
		System.out.println("Your Total Amount : " + d.getTotal());
	}
}
