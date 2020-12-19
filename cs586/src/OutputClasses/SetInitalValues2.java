package OutputClasses;
import DataStore.*;

public class SetInitalValues2 extends SetInitialValues{
	
	public SetInitalValues2(Data data) {
		super(data);
	}


	public void SetInitialValues() {
		Data2 d = (Data2) data;
		d.setG(0);
		d.setTotal(0);
	}

}
