package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class DisplayMenu {
	
	public Data data;
	
	public DisplayMenu(Data data) {
		this.data = data;
	}
	


	public abstract void DisplayMenu();

}
