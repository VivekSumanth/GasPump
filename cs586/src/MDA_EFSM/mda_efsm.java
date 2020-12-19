/*
* Centralralized Design Pattern Implementataion
*/

package MDA_EFSM;
import StateClasses.*;
import OutputClasses.*;


public class mda_efsm {
	public State state;  //Points to the current state 
	Integer k = 0;		// counter to counter number of Incorrect attempts
	
	
	/* Methods in MDA_EFSM
	 * Activate()
	 * PayCash()
	 * PayCredit()
	 * PayDebit()
	 * Correctpin()
	 * InCorrectPin()
	 * TooManyAttempts()
	 * SelectGas()
	 * Approved
	 * Reject
	 * Cancel
	 * StartPump()
	 * Pump()
	 * StopPump()
	 * Start
	 */

	public State list[];
	/*
	 * StatePattern and all stated in list 
	 * Initial State is Start state
	 */

	public mda_efsm(Output op) {
		list = new State[7];
		list[0] = new Start(op); 
		list[1] = new S0(op);
		list[2] = new S1(op);
		list[3] = new S2(op);
		list[4] = new S3(op);
		list[5] = new S5(op);
		list[6] = new S8(op);
		state = list[0]; //setting initial state to start state.
	}

	/*
	 * this method calls activate method in state class and changes class from start to S0
	 * change of state from start to S0
	 */
	public void Activate() {
		state.Activate();
		int statein = state.getStateId();
		if (statein==0) {
			state = list[1]; 
		}
	}
	/*
	 * this method calls PayCash in state class and changes class from S1 to S3
	 * change of state from S1 to S3
	 */
	
	public void PayCash() {
		state.PayCash();
		int statein = state.getStateId();
		if (statein==2) {
			state = list[4];
		}
	}
	/*
	 * this method calls PayCredit method in state class and changes class from S1 to S2
	 * change of state from start to S0
	 */
	public void PayCredit() {
		state.PayCredit();
		int statein = state.getStateId();
		if (statein == 2) {
			state = list[3];
		}
	}
	/*
	 * this method calls PayDebit method in state class and changes class from S1 to S8
	 * change of state from start to S0
	 */
	public void PayDebit() {
		state.PayDebit();
		int statein = state.getStateId();
		if (statein == 2) {
			state = list[6];
		}
	}
	/*
	 * this method calls CorrectPin method in state class and changes class from S8 to S3
	 * change of state from start to S0
	 */
	public void CorrectPin() {
		state.CorrectPin();
		int statein = state.getStateId();
		if (statein == 6) {
			state = list[4];
		}
	}
	/*
	 * this method calls IncorrectPin method in state class and changes class from start to S0
	 * Counts number of incorrect attempts and changes accordingly
	 */
	public void InCorrectPin(int Max) {
		
		if (k <= Max) {
			state.InCorrectPin();
		}
		else if (k > Max) {
			TooManyAttempts();
		}
		k = k+1;
	}
	/*
	 * 
	 * change of state from S8 to S0
	 * when maximum number of attempts reached Too Many attempts method is called by IncorrectPin
	 */
	public void TooManyAttempts() {
		int statein = state.getStateId();
		state.TooManyAttempts();

		if (statein == 6) {
			state = list[1];
		}
	}
	/*
	 * this method calls activate method in state class and changes class from start to S0
	 * change of state from start to S0
	 */
	public void SelectGas(int g) {
		state.SelectGas(g);

	}
	
	/*
	 * this method calls approved method in state class and changes class from S2 to S3
	 * change of state from start to S0
	 */
	public void Approved() {
		state.Approved();
		int statein = state.getStateId();
		if (statein == 3) {
			state = list[4];
		}
		
	}
	/*
	 * this method calls activate method in state class and changes class from start to S0
	 * change of state from start to S0
	 */
	public void Reject() {
		state.Reject(); 
		if(state.getStateId() == 3) {
			state = list[1]; 
		}
	}
	/*
	 * this method calls activate method in state class and changes class from S5 to S0
	 * change of state from S5 to S0
	 */
	public void Cancel() {
		state.Cancel(); 
		int statein = state.getStateId();
		if(statein == 4) {
			state = list[1];
		}
	}
	/*
	 * this method calls StartPump method in state class and changes class from S3 to S5
	 * change of state from S3 to S5
	 */
	public void StartPump() {
		state.StartPump();
		int statein = state.getStateId();

		if(statein == 4) {
			state = list[5]; 
		}
	}
	/*
	 * this method calls Pump method in state class
	 * 
	 */
	public void Pump() {
		state.Pump();
	}
	/*
	 * this method calls StopPump method in state class and changes class from start to S0
	 * change of state from S5 to S1
	 */
	public void StopPump() {
		state.StopPump();
		int statein = state.getStateId();
		if(statein == 5) {
			state = list[1];
		}
	}
	
	/*
	 * this method calls Start method in state class and changes class from S0 to S1
	 * change of state from S0 to S1
	 */
	
	public void Start() {
		state.Start();
		int statein = state.getStateId();
		if (statein==1) {
			state = list[2];
		}
	}
	
}
