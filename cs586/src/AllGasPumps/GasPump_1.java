package AllGasPumps;

import MDA_EFSM.mda_efsm;
import DataStore.*;
import AbstractFactoryClasses.*;
import OutputClasses.*;
/*
 * GasPump1 Class 
 * Every method selected in main has implementation here.
 */
public class GasPump_1 {
	
//	Pointers to DataStore and mda_efsm
	public Data1 data = new Data1();
	public mda_efsm efsm;
	
	/*
	 * Initialization of Object of mda_efsm when GasPump 1 is invoked. 
	 */
	public GasPump_1(AbstractFactory abstractFactory) {
		efsm = new mda_efsm (new Output(abstractFactory));
		data = (Data1) abstractFactory.getData();  
	}
	
	
/*
 * All Methods below invoke respective method in mda_efsm.
 */
	
	// Activate Method.
	public void Activate(int a) {
		if (a > 0) {
			data.setTemp_a(a);
			efsm.Activate();
			
			
		} else {
			System.out.println("Activation Failed");
			System.out.println("a should be greater than 0");
			System.out.println("\n");
		}
	}
	
	//PayCash Method
	public void PayCash(int c) {
		if(c>0) {
			data.setTemp_c(c);
			data.setW(1);
			efsm.PayCash();
		}
		
	}
	
	//PayCredit Method.
	public void PayCredit() {
		 System.out.println("	4. Approved()");
		 System.out.println("	5. Reject()");
		data.setW(0);
		efsm.PayCredit();
	}
	
	//Approved Method.
	public void Approved() {
		efsm.Approved();	
	}
	
	//Reject Method
	public void Reject() {
		efsm.Reject();	
	}
	
	//Cancel Method
	public void Cancel() {
		efsm.Cancel();
	}
	
	//StartPump Method
	public void StartPump() {
		data.setPrice(data.getTemp_a());
		efsm.StartPump();

	}
	
	//PumpLiter Method
	public void PumpLiter() {


		if ( (data.getCash()>0) && (data.getCash() < data.getPrice()*((data.getL())+1))) {
			efsm.StopPump();
		}
		else {
			efsm.Pump();
		}
		
		}
	
	//StopPump Method
	public void StopPump() {
		efsm.StopPump();
	}
	
	//Start Method
	public void Start() {
		efsm.Start();
	}
}
