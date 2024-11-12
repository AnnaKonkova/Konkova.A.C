package abstractFactory;

import abstractFactory.interfaces.Refrigerator;

public class LGRefrigerator implements Refrigerator {
    @Override
    public void cool() {
        System.out.println("LG Refrigerator is cooling.");
    }
}