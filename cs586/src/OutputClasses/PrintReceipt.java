package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class PrintReceipt {
	
	public Data data;
	
	public PrintReceipt(Data data) {
		this.data = data;
	}
	
	public abstract void PrintReceipt();

}
