package bridge;

import bridge.interfaces.EncryptionAlgorithm;

public class AsymmetricEncryption extends Encryption {
    public AsymmetricEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void drawShape (String data) {
        String encryptedData = algorithm.encrypt(data);
        System.out.println(encryptedData);
    }
}