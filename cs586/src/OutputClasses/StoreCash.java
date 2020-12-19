package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class StoreCash {
	
	public Data data;
	
	public StoreCash(Data data) {
		this.data = data;
	}
	
	public abstract void StoreCash();

}
