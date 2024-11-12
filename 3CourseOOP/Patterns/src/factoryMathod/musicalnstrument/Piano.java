package factoryMathod.musicalnstrument;

import factoryMathod.interfaces.Instrument;

public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Играет фортепиано");
    }
}
