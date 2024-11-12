package bridge;

import bridge.interfaces.EncryptionAlgorithm;

public class Hashing extends Encryption {
    public Hashing(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void drawShape(String data) {
        String hashedData = algorithm.encrypt(data);
        System.out.println(hashedData);
    }

}