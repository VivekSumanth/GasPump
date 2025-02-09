package AllGasPumps;
import DataStore.Data1;
import AbstractFactoryClasses.*;

/*
 * GasPump1 Class 
 * Every method selected in main has implementation here.
 */
public class GasPump_1 extends GasPump{
	
//	Pointers to DataStore and mda_efsm

	
	/*
	 * Initialization of Object of mda_efsm when GasPump 1 is invoked. 
	 */
	public GasPump_1(AbstractFactory abstractFactory) {
		super(abstractFactory);
	}
	
	
/*
 * All Methods below invoke respective method in mda_efsm.
 */
	
	// Activate Method.
	public void Activate(int a) {
		if (a > 0) {
			Data1 data = (Data1) this.data;
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
			 Data1 data = (Data1) this.data;
			data.setTemp_c(c);
			efsm.PayCash();
		}
		
	}
	
	//PayCredit Method.
	public void PayCredit() {
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
		Data1 data = (Data1) this.data;
		data.setPrice(data.getTemp_a());
		efsm.StartPump();

	}
	
	//PumpLiter Method
	public void PumpLiter() {

		Data1 data = (Data1) this.data;
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
