package StateClasses;

import OutputClasses.Output;
/*
 * At this State only Pump(),StartPump(),StopPump() is Invoked.
 */

public class S5 extends State {
	
	public int id = 5;
	
	public S5(Output output) {
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
	
	//invokes PumpGasUnit and GasAckMsg in Output class
	public void Pump() {
		output.PumpGasUnit();
		output.GasAckMsg();
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
	
	//invokes SetInitialValues and ReadyMsg in Output class
	public void StartPump() {
		output.SetInitialValues();
		output.ReadyMsg();
	}
	
	public void PumpLiter() {
		notatthisstatemsg();
	}
	
	//invokes StopMsg and PrintReceipt and ReturnCash() in Output class
	public void StopPump() {
		output.StopMsg();
		output.PrintReceipt();
//		output.ReturnCash();
	}
	
	public void Start() {
		notatthisstatemsg();
	}
	
	public int getStateId() {
		return this.id;
	} 
	

}