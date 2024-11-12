package abstractFactory.app;

import abstractFactory.factories.ApplianceFactory;
import abstractFactory.interfaces.Microwave;
import abstractFactory.interfaces.Refrigerator;
import abstractFactory.interfaces.WashingMachine;

public class Application {
    private Refrigerator refrigerator;
    private WashingMachine washingMachine;
    private Microwave microwave;

    public Application(ApplianceFactory factory) {
        refrigerator = factory.createRefrigerator();
        washingMachine = factory.createWashingMachine();
        microwave = factory.createMicrowave();
    }

    public void actions() {
        refrigerator.cool();
        washingMachine.wash();
        microwave.heat();
    }
}