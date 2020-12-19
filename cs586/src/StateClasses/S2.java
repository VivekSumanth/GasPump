package StateClasses;

import OutputClasses.Output;


/*
 * At this State only Approved(),Displaymenu(),Reject() is Invoked.
 */

public class S2 extends State {
	
	public int id = 3;
	
	public S2(Output output) {
		super(output);
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
	// Approved method invokes DisplayMenu() in Output
	public void Approved() {
		output.DisplayMenu();
		output.EjectCard();
	}
	// Reject method invokes RejectMsg() in Output
	public void Reject() {
		output.RejectMsg();
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
