package OutputClasses;
import DataStore.*;


public class SetW1 extends SetW {
	
    public SetW1(Data data) {
		super(data);

	}

 
    @Override
    public void SetW(int w) {
        Data1 d = (Data1) data;
        if(w == 1) {
        	System.out.println(" approve to continue ");
        }
        d.setW(w);
    }

}
