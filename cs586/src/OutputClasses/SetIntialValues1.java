package OutputClasses;
import DataStore.*;

public class SetIntialValues1 extends SetInitialValues {

	public SetIntialValues1(Data data) {
		super(data);
		
	}


	@Override
	public void SetInitialValues() {
		Data1 d = (Data1) data;
		d.setL(0);
		d.setTotal(0);
	}

}
