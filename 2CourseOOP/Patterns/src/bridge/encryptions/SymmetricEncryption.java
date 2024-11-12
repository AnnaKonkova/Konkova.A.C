package bridge.encryptions;

import bridge.Encryption;
import bridge.interfaces.EncryptionAlgorithm;

public  class SymmetricEncryption extends Encryption {
    public SymmetricEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void drawShape(String data) {
        String encryptedData = algorithm.encrypt(data);
        System.out.println(encryptedData);
    }
}