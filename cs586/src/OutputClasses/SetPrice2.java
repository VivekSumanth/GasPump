package OutputClasses;

import DataStore.*;

public class SetPrice2 extends SetPrice{

	public SetPrice2(Data data) {
		super(data);
		
	}
	
	//set price according to the selected gas
	public void SetPrice(int g) {
		Data2 d = (Data2) data;

		
		if (g == 1) { 

            d.setPrice(d.getRprice());
            System.out.println("	Regular Gas Selected");
        } else if (g == 2) { 

            d.setPrice(d.getDprice());
            System.out.println("	Diesel Gas Selected");
        } else if(g == 3) {

        	d.setPrice(d.getSprice());
        	System.out.println("	Super Gas Selected");
        }
		System.out.println("");
        System.out.println(" Price of the Gas is " + d.getPrice() + "/Gallon");
		System.out.println("  	10: StartPump()");
		System.out.println(" 	6: Cancel()");
	}

}
