package factoryMathod;

import factoryMathod.interfaces.Instrument;

import java.util.ArrayList;
import java.util.List;

public class MusicComposition {
    private List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(InstrumentFactory factory) {
        Instrument instrument = factory.createInstrument();
        instruments.add(instrument);
    }

    public void playComposition() {
        System.out.println("Воспроизведение композиции:");
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}