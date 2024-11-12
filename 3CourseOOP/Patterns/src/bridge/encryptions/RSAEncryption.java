package bridge.encryptions;

import bridge.interfaces.EncryptionAlgorithm;

public class RSAEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        return "RSA Encrypted Data: " + data; // Заглушка
    }
}
