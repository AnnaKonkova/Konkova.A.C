package abstractFactory.factories.LG;

import abstractFactory.LGMicrowave;
import abstractFactory.LGRefrigerator;
import abstractFactory.LGWashingMachine;
import abstractFactory.factories.ApplianceFactory;
import abstractFactory.interfaces.Microwave;
import abstractFactory.interfaces.Refrigerator;
import abstractFactory.interfaces.WashingMachine;

public class LGApplianceFactory implements ApplianceFactory {
    @Override
    public Refrigerator createRefrigerator() {
        return new LGRefrigerator();
    }

    @Override
    public WashingMachine createWashingMachine() {
        return new LGWashingMachine();
    }

    @Override
    public Microwave createMicrowave() {
        return new LGMicrowave();
    }
}