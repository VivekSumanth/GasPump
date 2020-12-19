package OutputClasses;
import DataStore.*;
public class StoreCash2 extends StoreCash {
	public StoreCash2(Data data) {
		super(data);
	}

	//GasPump2 doesnt have Cash mode of payment
	@Override
	public void StoreCash() {

	}
}
