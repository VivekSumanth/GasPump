package OutputClasses;

import DataStore.*;

public class StorePin2 extends StorePin {

	public StorePin2(Data data) {
		super(data);

	}
	public void StorePin() {

		Data2 d = (Data2) data;
		d.setpin(d.getTemp_p());


		
		
	}
}
