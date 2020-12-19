package StateClasses;

import OutputClasses.*;

/*
 * At this State only SelectGas(),startPump(),Cancel() is Invoked.
 */

public class S3 extends State {
	
	public int id = 4;
	
	public S3(Output output) {
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
	
	//SelectGas Method Invokes SetPrice(g) in Output Class
	public void SelectGas(int g) {
		output.SetPrice(g);
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
		output.CancelMsg();
		output.ReturnCash();
	}
	
	// StartPump() Method Invokes SetInitialValues() and ReadyMsg() in Output Class
	public void StartPump() {

		output.SetInitialValues();
		output.ReadyMsg();
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
