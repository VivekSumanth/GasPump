package StateClasses;
import OutputClasses.*;

// Abstract Class
public abstract class State {
	public Output output;
	
	public State(Output output) {
		this.output = output;
	}
	
	public abstract void Activate();
	public abstract int getStateId();
	public abstract void Start();
	public abstract void Cancel();
	public abstract void Approved();
	public abstract void Reject();
	public abstract void SelectGas(int g);
	public abstract void PayCredit();
	public abstract void PayCash();
	public abstract void StartPump();
	public abstract void Pump();
	public abstract void StopPump();
	public abstract void PayDebit();
	public abstract void InCorrectPin();
	public abstract void CorrectPin();
	public abstract void TooManyAttempts();
	
	public void notatthisstatemsg() {
		System.out.println("");
		System.out.println("WRONG ACTION !!! Cannot Perform From This Present State ");
	}





}
