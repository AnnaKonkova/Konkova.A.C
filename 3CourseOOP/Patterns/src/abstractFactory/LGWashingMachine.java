package abstractFactory;

import abstractFactory.interfaces.WashingMachine;

public class LGWashingMachine implements WashingMachine {
    @Override
    public void wash() {
        System.out.println("LG Washing Machine is washing.");
    }
}
