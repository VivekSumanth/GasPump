package AllGasPumps;
import AbstractFactoryClasses.AbstractFactory;
import DataStore.Data;
import MDA_EFSM.mda_efsm;
import OutputClasses.Output;

public abstract class GasPump {

Data data;
mda_efsm efsm;

GasPump(AbstractFactory abstractfactory) {
this.data = abstractfactory.getData();
this.efsm = new mda_efsm(new Output(abstractfactory));

}

}

