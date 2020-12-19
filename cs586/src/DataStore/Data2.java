package DataStore;
/*
 *  Data 2 is used by GasPump2.
 *  Data2 has get methods and Set methods used by gaspump2 and output class
 */
public class Data2 extends Data {
	
	//Temporary variables used by Gaspump2
	private float temp_a;
	private float temp_b;
	private float temp_c;
	private String temp_p;
	
	private String pin;
	private float Price;
	private int G;
	private float Total;
	private float RPrice;
	private float DPrice;
	private float SPrice;
	
	
	//return temp_a (price of regular)
	public float getTemp_a() {
		return temp_a;
	}

	//set temp_a
	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}
	
	//return temp_b (price of diesel)
	public float getTemp_b() {
		return temp_b;
	}

	//set temp_b
	public void setTemp_b(float temp_b) {
		this.temp_b = temp_b;
	}

	//return temp_c (price of super)
	public float getTemp_c() {
		return temp_c;
	}

	//set temp_c
	public void setTemp_c(float temp_c) {
		this.temp_c = temp_c;
	}
	
	//set temp_p
	public void setTemp_p(String temp_p) {
		this.temp_p = temp_p;
	}
	
	// return temp_p(PIN)
	public String getTemp_p() {
		return temp_p;
	}
	
	// set pin
	public void setpin(String pin) {
		this.pin = pin;
	}
	
	//return pin
	public String getpin() {
			return pin;
	}
	
	//set price
	public void setPrice(float f) {
		this.Price = f;
	}
	
	//return price
	public float getPrice() {
		return Price;
	}
	
	// return G - Gallon
	public int getG() {
		return G;
	}
	
	//set G
	public void setG(int G) {
		this.G = G;
	}
	
	// return Total
	public float getTotal() {
		return Total;
	}

	//set Total
	public void setTotal(float Total) {
		this.Total = Total;
	}

	//return RPrice
	public float getRprice() {
		return RPrice;
	}
	
	//set RPrice
	public void setRprice(float RPrice) {
		this.RPrice = RPrice;
	}
	
	//return Dprice
	public float getDprice() {
		return DPrice;
	}
	
	//set DPrice
	public void setDprice(float DPrice) {
		this.DPrice = DPrice;
	}
	
	//return SPrice
	public float getSprice() {
		return SPrice;
	}
	
	//set SPrice
	public void setSprice(float SPrice) {
		this.SPrice = SPrice;
	}
}
