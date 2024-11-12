package abstractFactory.factories;

import abstractFactory.interfaces.Microwave;
import abstractFactory.interfaces.Refrigerator;
import abstractFactory.interfaces.WashingMachine;

public interface ApplianceFactory {
    Refrigerator createRefrigerator();
    WashingMachine createWashingMachine();
    Microwave createMicrowave();
}