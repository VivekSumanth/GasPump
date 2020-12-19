package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class ReadyMsg {
	public Data data;
	
	public ReadyMsg(Data data) {
		this.data = data;
	}
	
	public abstract void ReadyMsg();

}
