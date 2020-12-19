package StateClasses;

import OutputClasses.*;
/*
 * At this State only SelectGas(),startPump(),Cancel() is Invoked.
 */

public class S3 extends State {
	
	public int id = 4;
	
	public S3(Output op) {
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
		this.op.SetPrice(g);
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
		this.op.CancelMsg();
		this.op.ReturnCash();
	}
	
	// StartPump() Method Invokes SetInitialValues() in Output Class
	public void StartPump() {

		this.op.SetInitialValues();
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
