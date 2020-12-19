package OutputClasses;
import AbstractFactoryClasses.*;


public class Output {
	//pointer to abstract factory
	public AbstractFactory abstractFactory;
	
	/*
	 * STRATERGY PATTERN
	 */
	public StoreData storeData;
	public PayMsg payMsg;
	public StoreCash storeCash;
	public DisplayMenu displayMenu;
	public RejectMsg rejectMsg;
	public SetPrice setPrice;
	public SetInitialValues setInitialValues;
	public PumpGasUnit pumpGasUnit;
	public GasAckMsg gasAckMsg; // gas pumped message
	public PrintReceipt printReceipt;
	public CancelMsg cancelMsg;
	public ReturnCash returnCash;
	public IncorrectPinMsg incorrectPinMsg; // wrong pin message
	public StorePin storePin;
	public EnterPinMsg enterPinMsg;
	public EjectCard ejectcard;
	public SetW setw;
//	public setW
	public ReadyMsg readyMsg;
	public StopMsg stopMsg;

	/*
	 * ABSTRACT FATCORY PATTERN 
	 */
	public Output(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
		/*
		 * Here Get method gets the Object and Sets it using set method
		 */
		setStoreCash(abstractFactory.getStoreCash());
		setStoreData(abstractFactory.getStoreData());
		setPayMsg(abstractFactory.getPayMsg());
		setDisplayMenu(abstractFactory.getDisplayMenu());
		setRejectMsg(abstractFactory.getRejectMsg());
		setSetPrice(abstractFactory.getSetPrice());
		setCancelMsg(abstractFactory.getCancelMsg());
		setReturnCash(abstractFactory.getReturnCash());
		setReadyMsg(abstractFactory.getReadyMsg());
		setSetInitialValues(abstractFactory.getSetInitialValues());
		setPumpGasUnit(abstractFactory.getPumpGasUnit()); 
		setGasAckMsg(abstractFactory.getGasAckMsg());
		setStopMsg(abstractFactory.getStopMsg());
		setPrintReceipt(abstractFactory.getPrintReceipt());
		setEnterPinMsg(abstractFactory.getEnterPinMsg());
		setStorePin(abstractFactory.getStorePin());
		setIncorrectPinMsg(abstractFactory.getIncorrectPinMsg());
		setEjectCard(abstractFactory.getEjectCard());
		setW(abstractFactory.getSetW());
	}



	// call set StoreData
	public void setStoreData(StoreData storeData){
		this.storeData = storeData;
	}
	//call StoreData
	public void StoreData() {
		this.storeData.StoreData();
	}
	//call setPayMsg
	public void setPayMsg(PayMsg payMsg) {
		this.payMsg = payMsg;
	}
	//call PayMsg
	public void PayMsg() {
		this.payMsg.PayMsg();
	}
	//call enter Pin Msg
	public void EnterPinMsg() {
		this.enterPinMsg.EnterPinMsg();
	}
	
	//set enterpinmsg
	public void setEnterPinMsg(EnterPinMsg enterPinMsg) {
		this.enterPinMsg = enterPinMsg;
	}
	

	//call IncorrectPinMsg
	public void IncorrectPinMsg() {
		this.incorrectPinMsg.IncorrectPinMsg();
	}
	
	//set IncorrectPinMsg
	public void setIncorrectPinMsg(IncorrectPinMsg incorrectPinMsg) {
		this.incorrectPinMsg = incorrectPinMsg;
	}
	
	//Set Displaymenu 
	public void setDisplayMenu (DisplayMenu displayMenu) {
		this.displayMenu = displayMenu;
	}
	
	//set RejectMsg
	public void setRejectMsg(RejectMsg rejectMsg) {
		this.rejectMsg = rejectMsg;
	}
	
	//call DisplayMenu
	public void DisplayMenu() {
		this.displayMenu.DisplayMenu();
	}
	
	//call RejectMsg
	public void RejectMsg() {
		this.rejectMsg.RejectMsg();
	}
	
	//set SetPrice
	public void setSetPrice(SetPrice setPrice) {
		this.setPrice = setPrice;
	}
	
	//call SetPrice
	public void SetPrice(int g) {
		this.setPrice.SetPrice(g);
	}
	
	//call CancelMsg
	public void CancelMsg() {
		this.cancelMsg.CancelMsg();
	}
	
	//Set setCancelMsg
	public void setCancelMsg(CancelMsg cancelMsg) {
		this.cancelMsg = cancelMsg;
	}
	
	//call ReturnCash
	public void ReturnCash() {
		this.returnCash.ReturnCash();
	}
	
	//set ReturnCash
	public void setReturnCash(ReturnCash returnCash) {
		this.returnCash = returnCash;
	}
	
	//call StoreCash
	public void StoreCash() {
		this.storeCash.StoreCash();
		
	}
	
	//Set StoreCash
	public void setStoreCash(StoreCash storeCash) {
		this.storeCash = storeCash;
	}
	
	public void setStorePin(StorePin storePin) {
		this.storePin = storePin;
	}
	
	public void StorePin() {
		this.storePin.StorePin();
	}
	
	//Set Initial Values
	public void setSetInitialValues(SetInitialValues setInitialValues) {
		this.setInitialValues = setInitialValues;
	}
	
	//SetReadyMsg
	public void setReadyMsg(ReadyMsg readyMsg) {
		this.readyMsg = readyMsg;
	}

	//call ReadyMsg
	public void ReadyMsg() {
		this.readyMsg.ReadyMsg();
	}

	//Set Initial Values
	public void SetInitialValues() {
		this.setInitialValues.SetInitialValues();
	}

	// Call PumpGasUnit
	public void PumpGasUnit() {
		this.pumpGasUnit.PumpGasUnit();
		
	}

	// Call GasAckMsg
	public void GasAckMsg() {
		this.gasAckMsg.GasAckMsg();
	}
	
	//set PumpGasUnit 
	public void setPumpGasUnit(PumpGasUnit pumpGasUnit) {
		this.pumpGasUnit = pumpGasUnit;
	}
	
	//set GasPumpedMsg
	public void setGasAckMsg(GasAckMsg gasAckMsg) {
		this.gasAckMsg = gasAckMsg;
	}
	
	//set StopMsg
	public void setStopMsg(StopMsg stopMsg) {
		this.stopMsg = stopMsg;
	}
	
	//call StopMsg
	public void StopMsg() {
		this.stopMsg.StopMsg();
	}
	
	//call PrintReceipt
	public void PrintReceipt() {
		this.printReceipt.PrintReceipt();
		
	}
	//set PrintReceipt
	public void setPrintReceipt(PrintReceipt printReceipt) {
		this.printReceipt = printReceipt;
	}

	public void EjectCard() {
		this.ejectcard.EjectCard();
	}
	
	public void setEjectCard(EjectCard ejectCard) {
		this.ejectcard = ejectCard;
	}

	public void setW(SetW setw){
		this.setw = setw;
	}

	public void setWValue(){
		this.setw.SetW();
	}

//	public void SetW() {
////		this.setW().SetW();
//	}


}
