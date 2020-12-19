package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class SetPrice {
	public Data data;
	
	public SetPrice (Data data) {
		this.data = data;
	}
	
	public abstract void SetPrice(int g);
}
