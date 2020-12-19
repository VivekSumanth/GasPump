package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class ReturnCash {
	public Data data;
	
	ReturnCash(Data data) {
		this.data = data;
	}
	


	public abstract void ReturnCash();

}
