package AbstractFactoryClasses;
import DataStore.*;
import OutputClasses.*;
/* Creates Objects for GasPump2
 * this class extends methods in Abstract factory pattern
 */

public  class ConcreteFactory2 extends AbstractFactory {
	
	//Pointers 
	// Pointer to Data2
	private Data2 data2;
	
	//Object to Data2
	public ConcreteFactory2() {
		data2 = new Data2(); 
	}
	
	@Override
	public Data getData() {
		
		return this.data2;
	}
	
	//returns StoreData
	@Override
	public StoreData getStoreData() {
		
		return new StoreData2(this.data2);
	}

	//returns PayMsg2
	@Override
	public PayMsg getPayMsg() {
		
		return new PayMsg2();
	}

	//returns DisplayMenu2
	@Override
	public DisplayMenu getDisplayMenu() {
		
		return new DisplayMenu2(this.data2);
	}

	//returns RejectMsg2
	@Override
	public RejectMsg getRejectMsg() {
		
		return new RejectMsg2();
	}

	
	//Returns Price2
	@Override
	public SetPrice getSetPrice() {
		
		return new SetPrice2(this.data2);
	}

	//returns StoreCash2
	@Override
	public StoreCash getStoreCash() {
		
		return new StoreCash2(this.data2);
	}

	//returns Cash2
	@Override
	public ReturnCash getReturnCash() {
		
		return new ReturnCash2(this.data2);
	}

	//returns CancelMsg2
	@Override
	public CancelMsg getCancelMsg() {
		
		return new CancelMsg2();
	}

	//returns ReadyMsg2
	@Override
	public ReadyMsg getReadyMsg() {
		
		return new ReadyMsg2(this.data2);
	}

	//returns Initial Values2
	@Override
	public SetInitialValues getSetInitialValues() {
		
		return new SetInitalValues2(this.data2);
	}

	//returns PumpGasUnit2
	@Override
	public PumpGasUnit getPumpGasUnit() {
		
		return new PumpGasUnit2(this.data2);
	}

	//returns GasAckMsg2
	@Override
	public GasAckMsg getGasAckMsg() {
		
		return new GasAckMsg2(this.data2);
	}
	
	//returns StopMsg2
	@Override
	public StopMsg getStopMsg() {
		
		return new StopMsg2();
	}
	
	
	//returns PrintReceipt2
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt2(this.data2);
	}

	//Returns EnterPin Msg2
	@Override
	public EnterPinMsg getEnterPinMsg() {
		return new EnterPinMsg2();
	}
	
	//returns IncorrectPin Msg2
	@Override
	public IncorrectPinMsg getIncorrectPinMsg() {
		return new IncorrectPinMsg2();
	}
	
	//returns EjectCard
	public EjectCard getEjectCard() {
		return new EjectCard2();
	}

	@Override
	public SetW getSetW() { return new SetW2(this.data2); }

	@Override
	public StorePin getStorePin() {
		return new StorePin2(this.data2);
	}


}
