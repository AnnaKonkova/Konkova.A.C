package abstractFactory;

import abstractFactory.interfaces.Microwave;

public class SamsungMicrowave implements Microwave {
    @Override
    public void heat() {
        System.out.println("Samsung Microwave is heating.");
    }
}