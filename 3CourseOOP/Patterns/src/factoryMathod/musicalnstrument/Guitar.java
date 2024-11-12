package factoryMathod.musicalnstrument;

import factoryMathod.interfaces.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Мелодия гитары: Трунь Трунь !");
    }
}
