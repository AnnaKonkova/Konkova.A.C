package abstractFactory;

import abstractFactory.interfaces.Microwave;

public class LGMicrowave implements Microwave {
    @Override
    public void heat() {
        System.out.println("LGMicrowave is heating.");
    }
}