package StateClasses;
import OutputClasses.Output;
/*
 * At this State only PayCash() is Invoked.
 */
public class S1 extends State {
	
	public int id = 2;
	
	public S1(Output op) {
		super(op);
	}

	public void Activate() {
		notatthisstatemsg();
	}
	
	//PayCash Method invokes StoreCash and DisplayMenu in Output Class
	public void PayCash() {
		this.op.StoreCash();
		this.op.DisplayMenu();
	}
	
	public void PayCredit() {
		this.op.setWValue(1);
	}
	
	public void PayDebit() {
		this.op.StorePin();
		this.op.EnterPinMsg();
		this.op.setWValue(1);
	}
	
	public void CorrectPin() {
		notatthisstatemsg();
	}
	
	public void InCorrectPin() {
		notatthisstatemsg();
	}
	
	public void TooManyAttempts() {
		notatthisstatemsg();
	}
	
	public void SelectGas(int g) {
		notatthisstatemsg();
	}
	
	public void Pump() {
		notatthisstatemsg();
	}
	
	public void Approved() {
		notatthisstatemsg();;
	}
	
	public void Reject() {
		notatthisstatemsg();
	}
	
	public void Cancel() {
		notatthisstatemsg();
	}
	
	public void StartPump() {
		notatthisstatemsg();
	}
	
	public void PumpLiter() {
		notatthisstatemsg();
	}
	
	public void StopPump() {
		notatthisstatemsg();
	}
	
	public void Start() {
		notatthisstatemsg();
	}
	
	public int getStateId() {
		return this.id;
	} 
	

}
