package bridge;

import bridge.interfaces.EncryptionAlgorithm;

public abstract class Encryption {
    protected EncryptionAlgorithm algorithm;

    protected Encryption(EncryptionAlgorithm algorithm) {

        this.algorithm = algorithm;
    }

    public abstract void drawShape(String data);
}