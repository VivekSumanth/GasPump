package OutputClasses;
import DataStore.*;

public abstract class StorePin {
	
	public Data data;
	
	public StorePin(Data data) {
		this.data = data;
	}
	
	public abstract void StorePin();

}
