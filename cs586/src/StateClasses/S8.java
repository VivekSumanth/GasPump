package StateClasses;
import OutputClasses.*;
/*
 * At this State only CorrectPin and InCorrectPin is Invoked.
 */
public class S8 extends State{
public int id = 6;
	
	public S8(Output op) {
		super(op);
	}


	public void Activate() {
		notatthisstatemsg();
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
	
	//Invokes DisplayMenu in Output Class
	public void CorrectPin() {
		this.op.EjectCard();
		this.op.DisplayMenu();
	}
	//Invokes InCorrectPinMsg in Output Class
	public void InCorrectPin() {
		this.op.IncorrectPinMsg();
	}
	
	public void TooManyAttempts() {
		this.op.IncorrectPinMsg();
		this.op.EjectCard();
	}
	
	public void SelectGas(int g) {
		notatthisstatemsg();
	}
	
	public void Pump() {
		notatthisstatemsg();
	}
	
	public void Approved() {
		notatthisstatemsg();
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
