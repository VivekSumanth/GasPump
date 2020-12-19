/**
 * 
 */
package AbstractFactoryClasses;

import DataStore.*;
import OutputClasses.*;

/**
 * Abstract Factory Pattern 
 * This is Abstract Class and all the methods in concrete factory are declared here
 */
public abstract class AbstractFactory {
	public abstract StoreData getStoreData();
	public abstract Data getData();
	public abstract PayMsg getPayMsg();
	public abstract DisplayMenu getDisplayMenu();
	public abstract RejectMsg getRejectMsg();
	public abstract SetPrice getSetPrice();
	public abstract StoreCash getStoreCash();
	public abstract ReturnCash getReturnCash();
	public abstract CancelMsg getCancelMsg();
	public abstract ReadyMsg getReadyMsg();
	public abstract SetInitialValues getSetInitialValues();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract GasAckMsg getGasAckMsg();
	public abstract StopMsg getStopMsg();
	public abstract PrintReceipt getPrintReceipt();
	public abstract EnterPinMsg getEnterPinMsg();
	public abstract StorePin getStorePin();
	public abstract IncorrectPinMsg getIncorrectPinMsg();
	public abstract EjectCard getEjectCard();
	public abstract SetW getSetW();
	

}
