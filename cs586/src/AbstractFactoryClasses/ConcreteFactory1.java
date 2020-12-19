package AbstractFactoryClasses;
import DataStore.*;
import OutputClasses.*;
/* Creates Objects for GasPump1
 * this class extends methods in Abstract factory pattern
 */
public class ConcreteFactory1 extends AbstractFactory{
	
	//pointes 
	//Pointer to Data1
	private Data1 data1;
	
	//object to Data1
	public ConcreteFactory1() {
		data1 = new Data1();
	}
	
	//returns Data
	public Data getData() {
		return data1;
	}
	
	//returns store data
	public StoreData getStoreData() {
		return new StoreData1(this.data1);
	}
	
	//returns PayMsg1
	public PayMsg getPayMsg() {
		return new PayMsg1();
	}
	
	//returns DisplayMenu1
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu1(this.data1);
	}
	
	//returns RejectMsg1
	public RejectMsg getRejectMsg() {
		return new RejectMsg1();
	}
	
	//returns ReadyMsg1
	public ReadyMsg getReadyMsg() {
		return new ReadyMsg1(this.data1);
	}
	
	//returns Initial Values1 
	public SetInitialValues getSetInitialValues() {
		return new SetIntialValues1(this.data1);
	}

	//Returns Price1
	public SetPrice getSetPrice() {
		return new SetPrice1(this.data1);
	}

	//returns Cash1
	public ReturnCash getReturnCash() {
		return new ReturnCash1(this.data1);
	}

	//returns StoreCash1
	public StoreCash getStoreCash() {
		return new StoreCash1(this.data1);
	}

	//returns CancelMsg1
	public CancelMsg getCancelMsg() {
		return new CancelMsg1();
	}	
	
	//returns PumpGasUnit1
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit1(this.data1);
	}


	//returns GasAckMsg1
	public GasAckMsg getGasAckMsg() {
		return new GasAckMsg1(this.data1);
	}

	//returns StopMsg
	public StopMsg getStopMsg() {
		return new StopMsg1();
	}
	
	//returns PrintReceipt
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt1(this.data1);
	}

	//Returns EnterPin Msg
	public EnterPinMsg getEnterPinMsg() {
		return new EnterPinMsg1();
	}

	//returns IncorrectPin Msg
	public IncorrectPinMsg getIncorrectPinMsg() {
		return new IncorrectPinMsg1();
	}

	//returns EjectCard
	public EjectCard getEjectCard() {
		return new EjectCard1();
	}

	public SetW getSetW() { return new SetW1(this.data1); }


	public StorePin getStorePin() {
		return new StorePin1(this.data1);
	}

}
