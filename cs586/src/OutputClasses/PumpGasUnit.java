package OutputClasses;
import DataStore.*;

//Abstract Class
public abstract class PumpGasUnit {
	public Data data;
	
	public PumpGasUnit(Data data) {
		this.data = data;
	}
	public abstract void PumpGasUnit();

}
