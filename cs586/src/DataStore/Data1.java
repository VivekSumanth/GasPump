package DataStore;
/*
 *  Data 2 is used by GasPump2.
 *  Data2 has get methods and Set methods used by gaspump2 and output class
 */
public class Data1 extends Data {
	
	private int cash;
	private int Price;
	private int L;
	private int Total;
	private int w;

	//Temporary variables
	private int temp_a;
	private int temp_c;
	
	//set cash
	public void setCash(int cash) {
		this.cash = cash;
	}
	
	//return cash
	public int getCash() {
		return cash;
	}
	
	//set price
	public void setPrice(int Price) {

		this.Price = Price;
	}
	
	//return price
	public int getPrice() {
		return Price;
	}
	
	//return L
	public int getL() {
		return L;
	}
	
	//set L
	public void setL(int L) {
		this.L = L;
	}
	
	//return Total
	public int getTotal() {
		return Total;
	}

	//set Total
	public void setTotal(int Total) {
		this.Total = Total;
	}

	//return Temp_a(setting price of gas)
	public int getTemp_a() {
		return temp_a;
	}

	//set temporary variable a
	public void setTemp_a(int temp_a) {
		this.temp_a = temp_a;
	}

	// return temp c
	public int getTemp_c() {
		return temp_c;
	}

	//set Temp c
	public void setTemp_c(int temp_c) {
		this.temp_c = temp_c;
	}
	
	//set W
	public void setW(int w) { 
		this.w = w; 
	}
	// get W
	public int getW(){ 
		return this.w;
		};

}	

