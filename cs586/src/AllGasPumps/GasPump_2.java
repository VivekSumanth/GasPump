package AllGasPumps;
import DataStore.*;
import AbstractFactoryClasses.*;



/*
 * GasPump2 Class 
 * Every method selected in main has implementation here.
 */

public class GasPump_2 extends GasPump {

	/*
	 * Initialization of Object of mda_efsm when GasPump 2 is invoked. 
	 */
	public GasPump_2(AbstractFactory abstractFactory) {
			super(abstractFactory); 
	}

	/*
	 * All Methods below invoke respective method in mda_efsm.
	 */

	// Activate Method.
	public void Activate(float a, float b, float c) {
		 Data2 data = (Data2) this.data;
		if (a > 0 && b > 0 && c > 0 ) {
			
			data.setTemp_a(a);
			data.setTemp_b(b);
			data.setTemp_c(c);
			efsm.Activate();
		} else {
			System.out.println("Activation Failed");
			System.out.println("a,b,c should be greater than 0");
			System.out.println("\n");
		}
		
	}
	
	//start method
	public void Start() {
		efsm.Start();
	}

	//PayCredit method
	public void PayCredit() {
		efsm.PayCredit();
		
	}
	
	
	//Reject method
	public void Reject() {
		efsm.Reject();
		
	}

	//PayDebit method
	public void PayDebit(String a) {
		Data2 data = (Data2) this.data;
		data.setTemp_p(a);
		efsm.PayDebit();
		
	}
	
	//Pin method
	public void Pin(String b) {
		Data2 data = (Data2) this.data;
		String Originalpin = data.getpin();
		if (Originalpin != null && Originalpin.equals(b) ) {
			efsm.CorrectPin();
		}
		else {
			
			efsm.InCorrectPin(1);
		}
	}
	
	//cancel method
	public void Cancel() {
		efsm.Cancel();
	
	}
	
	//approved method
	public void Approved() {
		efsm.Approved();
	
	}

	// Diesel method
	public void Diesel() {
		efsm.SelectGas(2);

		
	}
	
	//regular method
	public void Regular() {
		efsm.SelectGas(1);
		
	}
	
	//startPump method
	public void StartPump() {
		 Data2 data = (Data2) this.data;
		if (data.getPrice() != 0) {
			efsm.StartPump();
		} else {
			System.out.println("Please Select Gas Type");
			System.out.println(" 	8 : Diesel()");
			System.out.println(" 	9 : Regular()");
			System.out.println(" 	14: Super()");
		}
		
	}
	
	//pumpGallon method
	public void PumpGallon() {
		efsm.Pump();
		
	}
	
	//StopPump method
	public void StopPump() {
		efsm.StopPump();
		
	}

	//fulltank method
	public void FullTank() {
		efsm.StopPump();
		
	}
	
	//Super method
	public void Super() {
		efsm.SelectGas(3);
		
	}
}
