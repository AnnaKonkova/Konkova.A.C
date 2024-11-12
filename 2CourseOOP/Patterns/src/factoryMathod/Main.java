package factoryMathod;

import factoryMathod.musicalnstrument.GuitarFactory;
import factoryMathod.musicalnstrument.PianoFactory;
import factoryMathod.musicalnstrument.ViolinFactory;

public class Main {
    public static void main(String[] args) {
        MusicComposition composition = new MusicComposition();

        composition.addInstrument(new GuitarFactory());
        composition.addInstrument(new PianoFactory());
        composition.addInstrument(new ViolinFactory());

        composition.playComposition();
    }
}