package bridge;

import bridge.interfaces.EncryptionAlgorithm;

class ShapeEncryption extends Encryption {
    public ShapeEncryption (EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void drawShape(String data) {
        algorithm.encrypt(data);
    }
}