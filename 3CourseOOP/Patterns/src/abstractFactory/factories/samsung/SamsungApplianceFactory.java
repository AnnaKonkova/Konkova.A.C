package abstractFactory.factories.samsung;

import abstractFactory.SamsungWashingMachine;
import abstractFactory.SamsungMicrowave;
import abstractFactory.SamsungRefrigerator;
import abstractFactory.factories.ApplianceFactory;
import abstractFactory.interfaces.Microwave;
import abstractFactory.interfaces.Refrigerator;
import abstractFactory.interfaces.WashingMachine;

public class SamsungApplianceFactory implements ApplianceFactory {
    @Override
    public Refrigerator createRefrigerator() {
        return new SamsungRefrigerator();
    }

    @Override
    public WashingMachine createWashingMachine() {
        return new SamsungWashingMachine();
    }

    @Override
    public Microwave createMicrowave() {
        return new SamsungMicrowave();
    }
}