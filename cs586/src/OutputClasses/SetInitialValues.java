package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class SetInitialValues {
	public Data data;
	
	public SetInitialValues(Data data) {
		this.data = data;
	}
	
	public abstract void SetInitialValues();
}
