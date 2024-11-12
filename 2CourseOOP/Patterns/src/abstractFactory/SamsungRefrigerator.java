package abstractFactory;

import abstractFactory.interfaces.Refrigerator;

public class SamsungRefrigerator implements Refrigerator {
    @Override
    public void cool() {
        System.out.println("Samsung Refrigerator is cooling.");
    }
}