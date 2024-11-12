package abstractFactory;

import abstractFactory.interfaces.WashingMachine;

public class SamsungWashingMachine implements WashingMachine {
    @Override
    public void wash() {
        System.out.println("Samsung Washing Machine is washing.");
    }
}
