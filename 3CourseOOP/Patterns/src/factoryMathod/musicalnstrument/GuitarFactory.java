package factoryMathod.musicalnstrument;

import factoryMathod.InstrumentFactory;
import factoryMathod.interfaces.Instrument;

public class GuitarFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Guitar();
    }
}
