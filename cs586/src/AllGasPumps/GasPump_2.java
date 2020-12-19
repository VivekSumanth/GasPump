package AllGasPumps;

import MDA_EFSM.mda_efsm;


import OutputClasses.Output;
import AbstractFactoryClasses.*;
import DataStore.*;


/*
 * GasPump2 Class 
 * Every method selected in main has implementation here.
 */

public class GasPump_2 {

	//	Pointers to DataStore and mda_efsm
	mda_efsm efsm;
	public Data2 data;
	
	/*
	 * Initialization of Object of mda_efsm when GasPump 2 is invoked. 
	 */
	public GasPump_2(AbstractFactory abstractFactory) {
		efsm = new mda_efsm (new Output(abstractFactory)); 
		data = (Data2) abstractFactory.getData(); 
	}

	/*
	 * All Methods below invoke respective method in mda_efsm.
	 */

	// Activate Method.
	public void Activate(float a, float b, float c) {
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
		 System.out.println("	7. Approved()");
		 System.out.println("	3. Reject()");
		efsm.PayCredit();
		
	}
	
	
	//Reject method
	public void Reject() {
		efsm.Reject();
		
	}

	//PayDebit method
	public void PayDebit(String a) {
		data.setTemp_p(a);
		efsm.PayDebit();
		
	}
	
	//Pin method
	public void Pin(String b) {

		String Originalpin = data.getpin();

		
		if (Originalpin.equals(b) && Originalpin != null) {
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
