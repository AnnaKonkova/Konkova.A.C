package factoryMathod.musicalnstrument;

import factoryMathod.InstrumentFactory;
import factoryMathod.interfaces.Instrument;

public class ViolinFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Violin();
    }
}
