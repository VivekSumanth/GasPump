package StateClasses;

import OutputClasses.Output;
/*
 * At this State only CorrectPin and InCorrectPin is Invoked.
 */
public class S8 extends State{
public int id = 6;
	
	public S8(Output output) {
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
	
	//Invokes DisplayMenu in Output Class
	public void CorrectPin() {
		output.EjectCard();
		output.DisplayMenu();
	}
	//Invokes InCorrectPinMsg in Output Class
	public void InCorrectPin() {
		output.IncorrectPinMsg();
	}
	
	public void TooManyAttempts() {
		output.IncorrectPinMsg();
		output.EjectCard();
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
