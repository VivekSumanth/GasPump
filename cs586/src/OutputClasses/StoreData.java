package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class StoreData {
	 Data data;
	


	public StoreData(Data data) {
		this.data = data;
	}


	public abstract void StoreData();

}
