package bridge.encryptions;

import bridge.interfaces.EncryptionAlgorithm;

public class SHAEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        return "SHA Hashed Data: " + data; // Заглушка
    }
}