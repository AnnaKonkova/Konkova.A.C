package factoryMathod.musicalnstrument;

import factoryMathod.InstrumentFactory;
import factoryMathod.interfaces.Instrument;

public class PianoFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Piano();
    }
}
