package factoryMathod.musicalnstrument;

import factoryMathod.interfaces.Instrument;

public class Violin implements Instrument {
    @Override
    public void play() {
        System.out.println("Мелодия скрипки!");
    }
}
