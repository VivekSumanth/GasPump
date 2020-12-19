package StateClasses;
import OutputClasses.*;

/*
 * At this State only Activate is Invoked.
 * Initial State
 */
public class Start extends State {
	public int id = 0;
	
	public Start(Output op) {
		super(op);
	}
	
	//Invokes StoreData in OutputClass
	public void Activate() {
		this.op.StoreData();
	}
	
	public void PayCash() {
		notatthisstatemsg();
	}
	
	public void PayCredit() {
		notatthisstatemsg();
	}
	
	public void PayDebit() {
		notatthisstatemsg();
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
		
	public int getStateId() {
		return this.id;
	}

	@Override
	public void Start() {
		notatthisstatemsg();
		
	} 
	
}
