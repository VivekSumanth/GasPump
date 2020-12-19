package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class GasAckMsg {
	
	public Data data;
	
	public GasAckMsg(Data data) {
		this.data = data;
	}
	
	public abstract void GasAckMsg();

}
